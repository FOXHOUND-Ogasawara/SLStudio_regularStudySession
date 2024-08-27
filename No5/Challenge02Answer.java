import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge02Answer {
    public static void main(String[] args) {
        // ListにDrinkオブジェクトを追加する
        List<Drink> drinks = new ArrayList<>(Arrays.asList(
                new Drink("water", 80, "C"),
                new Drink("soda", 120, "A"),
                new Drink("water", 96, "B"),
                new Drink("tea", 88, "A"),
                new Drink("tea", 96, "C"),
                new Drink("coffee", 134, "C")));

        // Listのデータを全て出力する
        drinks.forEach(drink -> {
            System.out.print("商品名: " + drink.getName() + " ");
            System.out.print("値段: " + drink.getPrice() + "円 ");
            System.out.print("メーカー: " + drink.getMaker() + " ");
            System.out.println("\n- - - - - - - -");
        });

        // StreamAPIを使って値段100円以下商品を3つ出力してみよう
        drinks.stream()
                .filter(n -> n.getPrice() <= 100)
                .limit(3)
                .forEach(n -> {
                    System.out.print("商品名: " + n.getName() + " ");
                    System.out.print("値段: " + n.getPrice() + "円 ");
                    System.out.print("メーカー: " + n.getMaker() + " \n");
                });
    }
}