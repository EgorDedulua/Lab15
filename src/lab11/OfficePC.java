package lab11;

public class OfficePC extends Computer {
    private String company;

    public OfficePC(int storage, int ram, String model, String company) {
        super(storage, ram, model);
        this.company = company;
    }

    public void printDocument() {
        System.out.println("Печатаем документ");
    }

    public void printDocument(String name) {
        System.out.println("Печатаем документ " + name);
    }

    public void printDocument(String name, int copies) {
        System.out.println("Печатаем " + copies + " копий документа " + name);
    }

    @Override
    public String getPerformance() {
        return "Низкая";
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
