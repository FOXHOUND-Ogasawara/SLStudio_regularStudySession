import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Challenge01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        numbers = Arrays.asList(6, 71, 23, 53, 99, 25, 16, 49, 33, 20, 18);

        numbers.forEach(num -> {
            if (num % 3 == 0) {
                tempList.add(num);
            }
        });
        tempList.sort(Comparator.naturalOrder());
        tempList.forEach(n -> System.out.println(n));

        // 上記処理をStreamAPIを利用した内容に修正しなさい
        // 処理は、「3の倍数のみを昇順で出力する」となります
    }
}