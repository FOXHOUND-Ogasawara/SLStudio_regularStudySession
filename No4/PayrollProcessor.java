import java.util.List;

public class PayrollProcessor {
    public void processSalaries(List<Employee> employees) {
        for (Employee employee : employees) {
            double salary = employee.calculateSalary();
            System.out.println(employee.getName() + "の給料: " + salary + "円");
        }
    }
}