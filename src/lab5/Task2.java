package lab5;

public class Task2 {
    public static void main(String[] args) {
        Smartphone[] smartphones = {
                new Smartphone("Apple", 2500, 6),
                new Smartphone("Samsung", 1000, 8),
                new Smartphone("Huawei", 1300, 4),
                new Smartphone("Xiaomi", 1800, 7),
                new Smartphone("POCO", 2000, 10)
        };
        int maxBatteryIndex = 0;
        int maxBatteryLife = smartphones[maxBatteryIndex].getBatteryLife();
        double totalPrice = 0;
        for (int i = 0; i < smartphones.length; ++i) {
            if (smartphones[i].getBatteryLife() > maxBatteryLife) {
                maxBatteryIndex = i;
            }
            totalPrice += smartphones[i].getPrice();
        }
        System.out.println("Телефон с максимальной емкостью батареи: " + smartphones[maxBatteryIndex].getBrand());
        System.out.println("Средняя цена всех смартфонов: " + totalPrice / smartphones.length);
    }
}
