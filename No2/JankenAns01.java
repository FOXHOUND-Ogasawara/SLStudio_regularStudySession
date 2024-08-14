import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class JankenAns01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myHand;
        String enemyHand;
        String[] hands = { "グー", "チョキ", "パー" };

        while (true) {
            System.out.println("自分の手を選択してください");
            System.out.println("1: グー, 2: チョキ, 3: パー");
            int choice = Integer.parseInt(br.readLine()) - 1;
            myHand = hands[choice];

            Random rand = new Random();
            enemyHand = hands[rand.nextInt(3)];

            System.out.println("あなたは" + myHand + "で、相手は" + enemyHand + "でした");

            // あいこを先に判定
            if (myHand.equals(enemyHand)) {
                System.out.println("あいこ");
                continue;
            }

            // 自分の手がグーの場合
            if (myHand.equals("グー")) {
                if (enemyHand.equals("チョキ")) {
                    System.out.println("勝ち");
                } else if (enemyHand.equals("パー")) {
                    System.out.println("負け");
                }
                break;
            }

            // 自分の手がチョキの場合
            if (myHand.equals("チョキ")) {
                if (enemyHand.equals("パー")) {
                    System.out.println("勝ち");
                } else if (enemyHand.equals("グー")) {
                    System.out.println("負け");
                }
                break;
            }

            // 自分の手がパーの場合
            if (myHand.equals("パー")) {
                if (enemyHand.equals("グー")) {
                    System.out.println("勝ち");
                } else if (enemyHand.equals("チョキ")) {
                    System.out.println("負け");
                }
                break;
            }
        }
    }
}