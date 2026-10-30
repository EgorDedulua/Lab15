package lab9;

public abstract class Transport {
    protected int capacity;
    protected int speed;
    protected double fuel;

    public Transport(int capacity, int speed, double fuel) {
        this.capacity = capacity;
        this.speed = speed;
        this.fuel = fuel;
    }

    public abstract void deliver();

    public abstract  double calculateTime(double destination);

    public void displayInfo() {
        System.out.println("Вместимость " + capacity);
        System.out.println("Скорость " + speed);
        System.out.println("Топливо " + fuel);
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public double getFuel() {
        return fuel;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
