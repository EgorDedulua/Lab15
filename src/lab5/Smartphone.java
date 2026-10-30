package lab5;

public class Smartphone {
    private String brand;
    private double price;
    private int batteryLife;

    public Smartphone(String brand, double price, int batteryLife) {
        this.brand = brand;
        this.price = price;
        this.batteryLife = batteryLife;
    }

    public double getPrice() {
        return price;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public String getBrand() {
        return brand;
    }
}
