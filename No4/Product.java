import java.io.IOException;

public abstract class Product {
    // 商品情報の各種フィールド
    private String name;
    private int price;
    private String category;

    public Product(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public abstract void action();

    public abstract void order() throws IOException;

    public void showData() {
        System.out.println("商品情報は以下の通りです");
        System.out.println("商品名: " + this.name);
        System.out.println("価格: " + this.price + "円");
        System.out.println("カテゴリ: " + this.category);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    // 数値判定用
    public boolean isNumber(String inputText) {
        return inputText.chars().allMatch(c -> Character.isDigit((char) c));
    }
}