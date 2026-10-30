public class Task3 {
    static void main() {
        Employee[] employees = {
                new Employee("Дедюля Е.Д.", 1500.657),
                new Employee("Иванов И.И.", 2100.42),
                new Employee("Петров П.П.", 2500),
                new Employee("Михайлов М.М.", 1600)
        };
        Report.generateReport(employees);
    }
}
