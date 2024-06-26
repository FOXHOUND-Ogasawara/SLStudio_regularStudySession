import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample05b {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        int count = 0;
        boolean flag = true;

        // 条件
        while (flag) {
            System.out.println("数値を入力してください");
            String inputNumber = reader.readLine();
            int num = Integer.parseInt(inputNumber);

            if (num >= 30) {
                flag = false;
                System.out.println("入力値が30を超えました！");
            }

            if (count > 3) {
                flag = false;
                System.out.println("3回目の入力なので終了します！");
            }

            result += num;
        }

        System.out.println(count + "回の繰り返し処理が終了しました");
        System.out.println("入力された数値の合計は " + result + " でした");
    }
}