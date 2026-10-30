package lab9;

public class Ship extends  Transport {
    private double tonnage;

    public Ship(int capacity, int speed, double fuel, double tonnage) {
        super(capacity, speed, fuel);
        this.tonnage = tonnage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тоннаж " + tonnage);
    }

    @Override
    public void deliver() {
        System.out.println("Доставляет груз по воде");
    }

    @Override
    public double calculateTime(double destination) {
        return destination / (speed * 0.8);
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }
}
