package br.com.otogamidev.konan.model.entities;

public class Product {

    private int id;

    private String name;

    public Product(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(final String name) { this.name = name; }
}
