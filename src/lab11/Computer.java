package lab11;

public class Computer {
    protected String model;
    protected int ram;
    protected int storage;

    public Computer(int storage, int ram, String model) {
        this.storage = storage;
        this.ram = ram;
        this.model = model;
    }

    public Computer() {
    }

    public void run() {
        System.out.println("Компьютер работает");;
    }

    public void run(String program) {
        System.out.println("Запускает " + program);
    }

    public void run(int processes) {
        System.out.println("Запускает " + processes + " процессов");
    }

    public String getPerformance() {
        return "Средняя";
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
