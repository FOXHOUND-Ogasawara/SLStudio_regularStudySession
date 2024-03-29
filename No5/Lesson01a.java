import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson01a {
    public static void main(String[] args) {
        int num;

        // リストを定義するには
        ArrayList<Integer> numbers = new ArrayList<>();

        // 要素の追加
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);

        // 値の取得
        num = numbers.get(1);

        // 値の変更
        numbers.set(1, 7);
        num = numbers.get(1);

        // 要素数の取得
        num = numbers.size();

        // 要素の削除
        numbers.remove(1);
        num = numbers.size();
        num = numbers.get(1);

        // 値の確認用
        System.out.println(num);

        /*
         * 引数にリストを渡すことで初期化も可能
         * その際は Arrays.asList() や List.of()が便利
         */
        List<Integer> numbersA = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        List<Integer> numbersB = new ArrayList<>(List.of(1000, 100, 10000, 10));
    }
}