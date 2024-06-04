public class Sample02a {
    public static void main(String[] args) {
        // インスタンス化
        Company comA = new Company();
        Company comB = new Company("株式会社B", "東京都", 100);
        Company comC = new Company("株式会社C", "千葉県", 36);
        Company comD = new Company("D株式会社", "東京都", 982);

        comA.showCompanyData();
        comB.showCompanyData();

        comC.updateCompanyAddress("神奈川県");
        comC.showCompanyData();

        comD.showEmployeeCount();

        System.out.println("現在の企業数は" + Company.allCompanyCount() + "社となります");
    }
}