import java.util.HashMap;
import java.util.Map;

public class Challenge04Answer {
    public static void main(String[] args) {

        // 上記の処理をMapを利用した処理に修正しなさい
        Map<Integer, String> roomMembers = new HashMap<>();
        roomMembers.put(101, "タロウ");
        roomMembers.put(102, "ジロウ");
        roomMembers.put(103, "ハナコ");

        roomMembers.forEach((n, m) -> {
            System.out.print(n + "号室には");
            System.out.print(m + "が住んでいます");
            System.out.println();
        });
    }
}