public class PartTimeEmployee extends Employee {
    // 時給
    private double hourlyRate;
    // 働いた時間
    private int hoursWorked;

    // 時給と働いた時間を受け取るコンストラクタ
    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // 給与計算
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}