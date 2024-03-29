public class FullTimeEmployee extends Employee {
    // 月給
    private double monthlySalary;

    // 氏名と月給を受け取るコンストラクタ
    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    // 給与計算
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}