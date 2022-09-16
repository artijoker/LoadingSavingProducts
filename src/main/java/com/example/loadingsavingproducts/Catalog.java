package com.example.loadingsavingproducts;

import com.example.loadingsavingproducts.entities.Product;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class Catalog  {

    private final List<Product> _products;
    private final ObjectMapper _mapper = new ObjectMapper();

    public Catalog() {
        _products = new ArrayList<>();
    }

    public Catalog(List<Product> products) {
        _products = products;
    }

    public void fromJson(String jsonProducts) throws JsonProcessingException {
        var products = _mapper.readValue(jsonProducts, new TypeReference<List<Product>>(){});
        _products.addAll(products);

    }

    public String toJson() throws JsonProcessingException {
        return _mapper.writeValueAsString(_products);
    }

    public List<Product> getAllProduct(){
        return _products;
    }

    public Product getProductById(int id){
        return _products.get(id);
    }

    public void addProduct(Product product){

        _products.add(product);
    }


        private static List<Product> createTestCatalog(){
        List<Product> products = new ArrayList<>();
        products.add(new Product(
                "Google Pixel 5a",
                560,
                20,
                "https://cdn1.ozone.ru/s3/multimedia-3/wc250/6237328203.jpg"
        ));
        products.add( new Product(
                "USB Flash Samsung",
                30,
                35,
                "https://cdn1.ozone.ru/multimedia/wc1200/1026248251.jpg"
        ));
        products.add(new Product(
                "Lenovo IdeaPad 4 15IX5P6",
                830.50,
                15,
                "https://cdn1.ozone.ru/s3/multimedia-7/wc1200/6166994971.jpg"
        ));
        products.add(new Product(
                "Sony KD50X81J 50",
                1000.25,
                10,
                "https://cdn1.ozone.ru/s3/multimedia-n/wc1200/6068732087.jpg"
        ));
        products.add(new Product(
                "Microsoft Xbox Series X",
                985,
                5,
                "https://cdn1.ozone.ru/s3/multimedia-l/wc1200/6232471137.jpg"
        ));
        return products;
    }
}
