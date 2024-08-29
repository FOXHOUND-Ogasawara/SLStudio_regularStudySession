import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge01Answer {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers = Arrays.asList(6, 71, 23, 53, 99, 25, 16, 49, 33, 20, 18);

        // 上記処理をStreamAPIを利用した内容に修正しなさい
        // 処理は、「3の倍数のみを昇順で出力する」となります
        numbers.stream()
                .filter(n -> n % 3 == 0)
                .sorted()
                .forEach(n -> System.out.println(n));
    }
}