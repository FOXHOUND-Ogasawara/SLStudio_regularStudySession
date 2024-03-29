import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson01b {
    public static void main(String[] args) {
        // リストの作成
        List<Integer> numbers = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6));

        // リストから特定の範囲の要素を削除する
        numbers.subList(0, 3).clear();

        /*
         * これまでの記述でイメージすると？
         */
        Integer data = 100;
        // String str = i.toString();
        // n = str.length();
        System.out.println(data.toString().length()); // 3

        // 動きを予想してみよう
        String sample = "Hello";
        for (int i = 0; i < sample.length(); i++) {
            System.out.println(sample.substring(i).length());
            System.out.println(sample.substring(i));
        }
    }
}