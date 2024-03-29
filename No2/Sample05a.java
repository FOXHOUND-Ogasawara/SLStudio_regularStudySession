import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample05a {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = 0;
        int count = 0;

        // 条件
        while (num <= 30 && count < 3) {
            count++;

            System.out.println("数値を入力してください");
            String inputNumber = reader.readLine();

            num += Integer.parseInt(inputNumber);
        }

        System.out.println(count + "回の繰り返し処理が終了しました");
        System.out.println("入力された数値の合計は " + num + " でした");
    }
}