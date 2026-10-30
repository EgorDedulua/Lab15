package lab11;

public class Task1 {
    public static void main(String[] args) {
        Computer computer = new Computer(8, 1024, "HP");
        computer.run();
        computer.run("Word");
        computer.run(10);
        //
        System.out.println(computer.getPerformance());
        //
        System.out.println("-----------------------------------");

        GamingPC gamingPC = new GamingPC(2048, 32, "ASUS", "RTX-5090");
        gamingPC.play();
        gamingPC.play("Valorant");
        //
        System.out.println(gamingPC.getPerformance());
        //
        System.out.println("-----------------------------------");

        OfficePC officePC = new OfficePC(512, 4, "HP", "КБП");
        officePC.printDocument();
        officePC.printDocument("Отчет об успеваемости группы Т-392");
        officePC.printDocument("Отчет об учебных часах", 5);
        //
        System.out.println(officePC.getPerformance());
        //
        System.out.println("-----------------------------------");

        Computer comp = new GamingPC(512, 16, "Acer", "RTX-3060");
        comp.run();
        if (comp instanceof GamingPC) {
            GamingPC gamePC = (GamingPC)comp;
            gamePC.play();
            gamingPC.play("Minecraft");
        }
    }
}
