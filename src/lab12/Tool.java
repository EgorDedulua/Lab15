package org.example;

public abstract class Tool {
    protected String name;
    protected int id;
    protected double weight;

    public Tool(String name, int id, double weight) {
        this.name = name;
        this.id = id;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "name: " + name + " id: " + id + " weight: " + weight;
    }
}
