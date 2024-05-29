import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudySampleIC {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String menu = "2";
        int deposit = 10000;
        String input;
        int amount = 0;
        int count = 0;

        if (menu.equals("2")) {
            System.out.println("引き出す金額を入力してください。（残高は" + deposit + "円です");
            input = br.readLine();
            amount = Integer.parseInt(input);
            count++;

            if (amount > deposit) {
                System.out.println("残高が不足しています。");
                System.out.println("もう一度引き出す金額を入力してください。（残高は" + deposit + "円です");
                input = br.readLine();
                amount = Integer.parseInt(input);
                count++;
            }

            if (amount > deposit) {
                System.out.println("残高が不足しています。");
                System.out.println("もう一度引き出す金額を入力してください。（残高は" + deposit + "円です");
                input = br.readLine();
                amount = Integer.parseInt(input);
                count++;
            }

            if (count >= 3 && amount > deposit) {
                System.out.println("残高が不足しています。");
                System.out.println("3回操作が行われたため終了します。");
            } else {
                deposit = deposit - amount;
                System.out.println(amount + "円引き出しました、残高は" + deposit + "円です。");
            }
        }
    }
}