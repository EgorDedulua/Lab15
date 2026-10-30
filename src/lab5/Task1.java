package lab5;

public class Task1 {
    public static void main(String[] args) throws Exception {
        Employee emp = new Employee("Дедюля Е.Д.", "Директор", 100);
        System.out.println("Изначальная зарплата: " + emp.getSalary());
        emp.raiseSalary(10);
        System.out.println("Зарплата после увелечения на 10 процентов: " + emp.getSalary());
    }
}
