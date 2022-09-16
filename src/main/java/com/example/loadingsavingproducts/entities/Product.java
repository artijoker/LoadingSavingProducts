package com.example.loadingsavingproducts.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;
    public String urlImage;

    public Product(String name, double price, int quantity, String urlImage) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.urlImage = urlImage;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
