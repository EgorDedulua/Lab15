package org.example;

public class Hammer extends Tool {
    private int handleLength;

    public Hammer(String name, int id, double weight, int handleLength) {
        super(name, id, weight);
        this.handleLength = handleLength;
    }

    @Override
    public String toString() {
        return super.toString() + " handleLength: " + handleLength;
    }
}
