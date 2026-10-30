package lab8;

public class Computer {
    private String processor;
    private int ram;
    private int storage;

    public Computer(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

     public void getPerformance() {
         System.out.println("Базовая производительность");
     }

     public void displayInfo() {
         System.out.println("Процессор " + processor);
         System.out.println("RAM " + ram);
         System.out.println("Storage " + storage);
     }
}
