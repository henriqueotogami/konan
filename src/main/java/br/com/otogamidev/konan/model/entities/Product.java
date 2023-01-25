package br.com.otogamidev.konan.model.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public Product(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public Product(final String name) {
        super();
        this.name = name;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(final String name) { this.name = name; }
}
