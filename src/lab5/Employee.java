package lab5;

import java.security.InvalidAlgorithmParameterException;

public class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void raiseSalary(double percent) throws Exception {
        if (percent < 0)
            throw  new Exception("Проценты не могут быть отрицательными");
        salary = salary + (salary * percent/100);
    }

    public double getSalary() {
        return salary;
    }
}
