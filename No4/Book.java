import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Book extends Product {
    public String bookCategory;

    public Book(String name, int price, String category, String bookCategory) {
        super(name, price, category);
        this.bookCategory = bookCategory;
    }

    @Override
    public void action() {
        System.out.println(getName() + "を読みます");
    }

    @Override
    public void order() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        boolean flag = true;

        while (flag) {
            System.out.println(getName() + "を注文します。冊数を指定してください。");
            input = br.readLine();
            if (!isNumber(input)) {
                System.out.println("半角の整数を入力してください");
                continue;
            }
            System.out.println(getName() + "を" + input + "冊注文しました。");
            System.out.println("金額は" + (getPrice() * Integer.parseInt(input)) + "円です。");
            flag = false;
        }
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("分類: " + this.bookCategory);
    }
}