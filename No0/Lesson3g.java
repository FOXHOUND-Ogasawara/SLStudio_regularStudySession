// classの上にこの3行を書く
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Lesson3g {
    // mainの()の後に throws IOExceptionと書く
    public static void main(String[] args) throws IOException {
        // 入力を受けつける処理を書きたい場合、mainメソッドにまずこの1行を書く
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("割り勘計算機能です。支払い金額を入力してください：");
        // 入力を受け付けたいタイミングで、この1行を書く
        String input1 = reader.readLine();
        int inputTotal = Integer.parseInt(input1);

        System.out.print("次に何人で割るか人数を入力してください：");
        // 入力を受け付け、入ってきた文字を変数に入れています
        String input2 = reader.readLine();
        int inputCount = Integer.parseInt(input2);

        System.out.println("一人の支払金額は" + (inputTotal / inputCount) + "円です");
    }
}