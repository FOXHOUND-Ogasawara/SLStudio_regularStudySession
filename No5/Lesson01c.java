import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson01c {
    public static void main(String[] args) {
        List<Integer> numbersA = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> numbersB = new ArrayList<>(List.of(10, 20, 30, 40));

        // List型であればforEachメソッドで繰り返し処理が可能
        // 特定のメソッドは ラムダ式 という省略した記述をする
        numbersA.forEach(number -> {
            System.out.println(number);
        });

        // 処理が一行の場合はさらに省略も可能
        numbersA.forEach(number -> System.out.println(number));

        // 多次元のリストも同様の処理が可能
        List<List<Integer>> numberList = new ArrayList<>();

        numberList.add(numbersA);
        numberList.add(numbersB);

        numberList.forEach(numbers -> {
            numbers.forEach(number -> {
                System.out.println(number);
            });
        });
    }
}