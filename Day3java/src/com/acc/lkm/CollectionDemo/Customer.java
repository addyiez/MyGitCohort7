package com.acc.lkm.CollectionDemo;

import java.io.Serializable;

public class Customer implements Serializable {
    private Integer cust_id;
    private String name;
    private String product;
    private double price;

    // Constructor
    public Customer(int cust_id, String name, String product, double price) {
        this.cust_id = cust_id;
        this.name = name;
        this.product = product;
        this.price = price;
    }

    // Getters
    public int getCust_id() {
        return cust_id;
    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cust_id='" + cust_id + '\'' +
                ", name='" + name + '\'' +
                ", product='" + product + '\'' +
                ", price=" + price +
                '}';
    }
}