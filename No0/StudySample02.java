import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudySample02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("0~9の数字を三回入力してください");

        // 一回目の入力
        System.out.println("ひとつ目の数字を入力してください: ");
        String input = br.readLine();
        int num1 = Integer.parseInt(input);

        // 二回目の入力
        System.out.println("二つ目の数字を入力してください: ");
        input = br.readLine();
        int num2 = Integer.parseInt(input);

        // 三回目の入力
        System.out.println("三つ目の数字を入力してください: ");
        input = br.readLine();
        int num3 = Integer.parseInt(input);

        int result = num1 + num2 + num3;

        System.out.println(num1 + "+" + num2 + "+" + num3 + "=" + result);
    }
}