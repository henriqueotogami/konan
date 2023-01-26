package br.com.otogamidev.konan.model.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String name;

    @Min(0)
    private double price;

    @Min(0)
    @Max(1)
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
