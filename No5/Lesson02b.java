import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Lesson02b {
    public static void main(String[] args) {

        /*
         * - お題 -
         * リスト内の要素を比較し重複する要素を削除する
         * 削除後に最初の3つの要素を取り出し昇順でソートする
         * ソート後に最初の要素の値を出力する
         */

        // ★これまでの記述方法
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3,4,3,2,1));
        List<Integer> uniqueNumbers = new ArrayList<>();

        for(int num : numbers) {
            if(!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
            }
        }

        List<Integer> firstThree = uniqueNumbers.subList(0, 3);
        firstThree.sort(Comparator.naturalOrder());
        System.out.println(firstThree.get(0));

        // ★StreamAPIを使うと？
        Optional<Integer> i = numbers.stream()
            .distinct()         // 重複する要素の削除
            .limit(3)   // 最初の3つの要素だけ取得
            .sorted()           // 昇順でソート
            .findFirst();       // 最初の要素を取得
        System.out.println(i.get());
    }
}