package lab9;

public class Task1 {
    public static void main(String[] args) {
        Transport[] transports = {
                new Truck(2, 90, 6, 10),
                new Ship(10, 120, 10, 1000)
        };

        for (Transport transport: transports) {
            transport.displayInfo();
            transport.deliver();
            System.out.println(transport.calculateTime(1000));
        }
    }
}
