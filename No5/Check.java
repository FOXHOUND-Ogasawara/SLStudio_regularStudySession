import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Check {
    public static void main(String[] args) throws IOException {
        boolean flag = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Listの定義
        // 変数名:「favorite」 型:「String」としてください

        while (flag) {
            // 標準入力を利用してfavoriteにデータを追加する
            // 「exit」と入力されたら入力処理を終了する
            System.out.println("好きなデータを登録してください");
            System.out.println("※「exit」と入力するまで何個でも登録が可能です");
            String input = br.readLine();

            if ("exit".equals(input)) {
                flag = false;
            }
        }

        // forEachを利用してデータを全て出力する

        // StreamAPIを利用してデータを加工し、全て出力する
        // 加工は map を利用し、「私は○○が好きです」の形式となるようにすること

    }
}