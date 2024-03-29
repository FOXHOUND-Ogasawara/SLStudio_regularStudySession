import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample05c {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = 0;

        while (true) {

            System.out.println("1~10の数値を入力してください");
            String inputNumber = reader.readLine();
            num = Integer.parseInt(inputNumber);

            if (num < 1 || num > 10) {
                System.out.println("1~10以外の数値を検知しました");
                continue;
            }

            System.out.println("入力された数値は " + num + " です");
            break;
        }
    }
}