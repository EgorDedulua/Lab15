package lab9;

public class Truck extends  Transport {
    private int cargoWeight;

    public Truck(int capacity, int speed, double fuel, int cargoWeight) {
        super(capacity, speed, fuel);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Вес груза " + cargoWeight);
    }

    @Override
    public void deliver() {
        System.out.println("Доставляет груз по суше");
    }

    @Override
    public double calculateTime(double destination) {
        return destination / speed;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
}
