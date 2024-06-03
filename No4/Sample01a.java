import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Sample01a {
    public static void main(String[] args) throws IOException {
        // クラスのインスタンス化
        Drink coke = new Drink("コーラ", 148, "清涼飲料水", "コア・コーラ");
        Book comic = new Book("週刊少年チョップ", 540, "書籍", "週刊誌");

        // コレクションにまとめることが可能
        List<Product> products = Arrays.asList(coke, comic);

        coke.action();
        comic.action();

        coke.order();
        comic.order();

        for (Product product : products) {
            product.showData();
        }
    }
}
