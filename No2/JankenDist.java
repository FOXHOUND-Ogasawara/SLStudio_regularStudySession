import java.util.Random;

public class JankenDist {
    public static void main(String[] args) {
        // じゃんけんの手は以下の配列を活用してください
        String[] hands = { "グー", "チョキ", "パー" };

        // ランダムの処理は以下を活用してください
        Random rand = new Random();
        // 変数名 = hands[rand.nextInt(3)];
        // rand.nextInt(3)は、0,1,2のランダムな数値を返す
    }
}
