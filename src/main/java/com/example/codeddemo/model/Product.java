package com.example.codeddemo.model;

public class Product {
    private int id;
    private String p_name;
    private String batch_no;
    private double price;
    private int no_of_product;

    //default constructor
    public Product() {

    }

    //constructor using fields
    public Product(int id, String p_name, String batch_no, double price, int no_of_product) {
        this.id = id;
        this.p_name = p_name;
        this.batch_no = batch_no;
        this.price = price;
        this.no_of_product = no_of_product;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return p_name;
    }

    public void setPname(String pname) {
        this.p_name = pname;
    }

    public String getBatchno() {
        return batch_no;
    }

    public void setBatchno(String batchno) {
        this.batch_no = batchno;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNoofproduct() {
        return no_of_product;
    }

    public void setNoofproduct(int no_of_product) {
        this.no_of_product = no_of_product;
    }
}
