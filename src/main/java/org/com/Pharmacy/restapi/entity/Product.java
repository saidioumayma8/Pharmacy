package org.com.Pharmacy.restapi.entity;

public class Product {

    private int id;
    private String name;
    private String description;
    private int price;
    private int quantity;


    public Product(int id, String name, String description, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;

    }
}
