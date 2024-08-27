public

import java.util.ArrayList;
import java.util.List;

public class Challenge04 {
    public static void main(String[] args) {
        List<Integer> roomNumbers = new ArrayList<>();
        roomNumbers.add(101);
        roomNumbers.add(102);
        roomNumbers.add(103);

        List<String> roomMembers = new ArrayList<>();
        roomMembers.add("タロウ");
        roomMembers.add("ジロウ");
        roomMembers.add("ハナコ");

        roomNumbers.add(201);
        roomMembers.add("シロウ");

        for (int i = 0; i < roomMembers.size(); i++) {
            System.out.print(roomNumbers.get(i) + "号室には");
            System.out.print(roomMembers.get(i) + "が住んでいます");
            System.out.println();
        }

        // 上記の処理をMapを利用した処理に修正しなさい

    }
}{

}
