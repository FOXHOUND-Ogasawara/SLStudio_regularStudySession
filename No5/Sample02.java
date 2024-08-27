import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sample02 {
    public static void main(String[] args) {
        // 商品リスト
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product(1, "モニター", 29800, "A"),
                new Product(2, "キーボード", 7800, "B"),
                new Product(3, "マウス", 2300, "A"),
                new Product(4, "PC", 176900, "C"),
                new Product(5, "PC", 82000, "B")));

        // 値段が20000以上の商品を降順にして出力する
        products.stream()
                .filter(n -> n.getPrice() >= 20000)
                .sorted(Comparator.comparing(Product::getPrice))
                .forEach(n -> {
                    System.out.print("ID: " + n.getId() + ", ");
                    System.out.print("商品名: " + n.getName() + ", ");
                    System.out.print("価格: " + n.getPrice() + ", ");
                    System.out.println("メーカー: " + n.getMaker());
                });

        // データ加工だけを行うことも可能
        List<Product> makerAProducts = products.stream()
                .filter(n -> n.getMaker() == "A")
                .collect(Collectors.toList());

        makerAProducts.forEach(n -> {
            System.out.print("ID: " + n.getId() + ", ");
            System.out.print("商品名: " + n.getName() + ", ");
            System.out.print("価格: " + n.getPrice() + ", ");
            System.out.println("メーカー: " + n.getMaker());
        });

        // SLスタジオで紹介されてるメソッド
        // map, filter, forEach
        // distinct, limit, sorted, findFirst
    }
}
