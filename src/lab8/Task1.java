package lab8;

public class Task1 {
    public static void main(String[] args) {
        GamingPC gamingPC1 = new GamingPC("i7-14900k", 16, 512, "RTX-3090");
        GamingPC gamingPC2 = new GamingPC("i9-14900KS", 32, 2048, "RTX-5090");
        GamingPC gamingPC3 = new GamingPC("Ultra 9", 64, 1024, "RTX-4090");
        OfficePC officePC1 = new OfficePC("i3-5600", 8, 1024, 22);
        OfficePC officePC2 = new OfficePC("i5-4500", 8, 2048, 25);
        Computer[] computers = {
          gamingPC1, gamingPC2, gamingPC3, officePC1, officePC2
        };
        for (Computer computer: computers) {
            computer.getPerformance();
            computer.displayInfo();
        }

        gamingPC1.playGame();
        officePC2.printDocument();
    }
}
