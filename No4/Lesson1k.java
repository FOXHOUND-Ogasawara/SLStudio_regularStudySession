import java.util.ArrayList;
import java.util.List;

public class Lesson1k {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("山田太郎", 350000));
        employees.add(new PartTimeEmployee("鈴木花子", 1500, 20));
        employees.add(new FullTimeEmployee("佐藤一郎", 300000));
        employees.add(new PartTimeEmployee("田中美咲", 2000, 15));

        PayrollProcessor payrollProcessor = new PayrollProcessor();
        payrollProcessor.processSalaries(employees);
    }
}