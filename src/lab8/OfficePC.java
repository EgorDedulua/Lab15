package lab8;

public class OfficePC extends Computer {
    public double monitorSize;

    public OfficePC(String processor, int ram, int storage, double monitorSize) {
        super(processor, ram, storage);
        this.monitorSize = monitorSize;
    }

    public void setMonitorSize(double monitorSize) {
        this.monitorSize = monitorSize;
    }

    public double getMonitorSize() {
        return monitorSize;
    }

    @Override
    public void getPerformance() {
        System.out.println("Средняя производительность");
    }

    public void printDocument() {
        System.out.println("Печатаем документ");
    }
}
