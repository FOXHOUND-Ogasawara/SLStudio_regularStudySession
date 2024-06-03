import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drink extends Product {
    private String maker;

    public Drink(String name, int price, String category, String maker) {
        super(name, price, category);
        this.maker = maker;
    }

    @Override
    public void action() {
        System.out.println(getName() + "を飲みます");
    }

    @Override
    public void order() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        boolean flag = true;

        while (flag) {
            System.out.println(getName() + "を注文します。本数を指定してください。");
            input = br.readLine();
            if (!isNumber(input)) {
                System.out.println("半角の整数を入力してください");
                continue;
            }
            System.out.println(getName() + "を" + input + "本注文しました。");
            System.out.println("金額は" + (getPrice() * Integer.parseInt(input)) + "円です。");
            flag = false;
        }
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("販売元: " + this.maker);
    }
}