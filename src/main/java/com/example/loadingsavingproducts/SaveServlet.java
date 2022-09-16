package com.example.loadingsavingproducts;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.inject.Inject;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(value = "/save")
public class SaveServlet extends HttpServlet {

    private final Catalog _catalog;

    @Inject
    public SaveServlet(Catalog catalog) {
        _catalog = catalog;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var name = request.getParameter("name");

        var file = new Attachment(
                name + ".json",
                _catalog.toJson().getBytes()
        );

        response.setHeader(
                "Content-Disposition",
                "attachment; filename=" + file.getFileName()
        );
        response.setContentType("application/octet-stream");
        var stream = response.getOutputStream();
        stream.write(file.getFileContents());


    }
}
