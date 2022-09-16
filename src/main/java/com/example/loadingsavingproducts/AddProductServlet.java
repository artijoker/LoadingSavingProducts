package com.example.loadingsavingproducts;

import com.example.loadingsavingproducts.entities.Product;
import jakarta.inject.Inject;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "AddProductServlet", value = "/add-product")
public class AddProductServlet extends HttpServlet {

    private final Catalog _catalog;

    @Inject
    public AddProductServlet(Catalog catalog) {
        _catalog = catalog;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        var name = request.getParameter("name");
        var price = request.getParameter("price");
        var quantity = request.getParameter("quantity");
        var urlImage = request.getParameter("urlImage");

        var product = new Product(name,
                Double.parseDouble(price),
                Integer.parseInt(quantity),
                urlImage
        );
        _catalog.addProduct(product);

        response.sendRedirect("get-products");
    }

}
