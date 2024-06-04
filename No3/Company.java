public class Company {
    private String name;
    private String address;
    private int employeeCount;
    public static int companyCount;

    public Company() {
        companyCount++;
        this.name = "架空の企業";
        this.address = "不明";
        this.employeeCount = 0;
    }

    public Company(String name, String address, int employeeCount) {
        companyCount++;
        this.name = name;
        this.address = address;
        this.employeeCount = employeeCount;
    }

    public void showCompanyData() {
        System.out.println("企業名: " + this.name);
        System.out.println("住所: " + this.address);
    }

    public void updateCompanyAddress(String address) {
        System.out.println(this.name + "の住所を変更します");
        System.out.println("変更前: " + this.address + " | 変更後: " + address);
        this.address = address;
    }

    public void showEmployeeCount() {
        System.out.println(this.name + "の社員数は" + this.employeeCount + "名です");
    }

    public static int allCompanyCount() {
        return companyCount;
    }
}
