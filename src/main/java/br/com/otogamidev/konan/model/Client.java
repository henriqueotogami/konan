package br.com.otogamidev.konan.model;

public class Client {

    private int id;
    private String name;
    private String numberCPF;

    public Client(final int id, final String name, final String numberCPF) {
        this.id = id;
        this.name = name;
        this.numberCPF = numberCPF;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(final String name) { this.name = name; }

    public String getNumberCPF() { return numberCPF; }

    public void setNumberCPF(final String numberCPF) { this.numberCPF = numberCPF; }
}
