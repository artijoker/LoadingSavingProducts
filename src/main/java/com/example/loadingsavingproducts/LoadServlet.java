package com.example.loadingsavingproducts;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(value = "/load")
@MultipartConfig(
        fileSizeThreshold = 5_242_880, //5MB
        maxFileSize = 20_971_520L, //20MB
        maxRequestSize = 41_943_040L //40MB
)
public class LoadServlet extends HttpServlet {

    private final Catalog _catalog;

    @Inject
    public  LoadServlet(Catalog catalog){
        _catalog = catalog;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Attachment attachment = this.processFile(request.getPart("file1"));

        _catalog.fromJson(new String(attachment.getFileContents(), StandardCharsets.UTF_8));

        response.sendRedirect("get-products");
    }

    private Attachment processFile(Part filePart) throws IOException {
        var inputStream = filePart.getInputStream();

        var outputStream = new ByteArrayOutputStream();
        int read;

        final byte[] bytes = new byte[1024];

        while((read = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, read);
        }

        var file = new Attachment(filePart.getSubmittedFileName(), outputStream.toByteArray());
        outputStream.close();

        return file;
    }

    public void destroy() {
    }
}