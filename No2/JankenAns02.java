import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class JankenAns02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myHand;
        String enemyHand;
        String[] hands = { "グー", "チョキ", "パー" };

        while (true) {
            System.out.println("自分の手を選択してください");
            System.out.println("1: グー, 2: チョキ, 3: パー");
            int myChoice = Integer.parseInt(br.readLine()) - 1;
            myHand = hands[myChoice];

            Random rand = new Random();
            int enemyChoice = rand.nextInt(3);
            enemyHand = hands[enemyChoice];

            System.out.println("あなたは" + myHand + "で、相手は" + enemyHand + "でした");

            // 勝敗判定用
            int result = myChoice - enemyChoice;
            // ロジック解説
            /*
             * あいこ:result 0
             * 勝ち  :result -1 or 2
             * 負け  :result 1 or -2
             */
            // あいこを先に判定
            if (result == 0) {
                System.out.println("あいこ");
                continue;
            }

            if (result == -1 || result == 2) { // 勝ち
                System.out.println("勝ち");
                break;
            } else if (result == 1 || result == -2) { // 負け
                System.out.println("負け");
                break;
            }
        }
    }
}
