import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson02a {
    public static void main(String[] args) {

        /*
         * - お題 -
         * リストの文字列に「Cake」を連結し、
         * 文字列の長さが10文字以上の場合に出力する
         */

        // リスト作成
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Charry"));

        // ★これまでの記述方法
        // 繰り返し処理を行い、get()やif
        for(int i = 0; i < fruits.size(); i++) {
            String fruitCake = fruits.get(i) + "Cake";

            if (fruitCake.length() >= 10) {
                System.out.println(fruitCake);
            }
        }

        // ★StreamAPIを使うと？
        fruits.stream()
            .map(n -> n + "Cake")
            .filter(n -> n.length() >= 10)
            .forEach(n -> System.out.println(n));
    }
}