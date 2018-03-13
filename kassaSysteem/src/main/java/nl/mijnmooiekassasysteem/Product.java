package nl.mijnmooiekassasysteem;

import java.util.ArrayList;

public class Product {
    private double price;
    private int productId;
    private String name;


    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }


}

