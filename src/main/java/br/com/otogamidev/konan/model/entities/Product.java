package br.com.otogamidev.konan.model.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private double price;

    private double discount;

    public Product(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public Product(final String name, final double price, final double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(final String name) { this.name = name; }

    public double getPrice() { return price; }

    public void setPrice(final double price) { this.price = price; }

    public double getDiscount() { return discount; }

    public void setDiscount(final double discount) { this.discount = discount; }
}
