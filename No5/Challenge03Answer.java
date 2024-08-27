import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge03Answer {
    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>(
                Arrays.asList(
                        Arrays.asList(101, 102, 103, 104, 105),
                        Arrays.asList(201, 202, 203, 204, 205),
                        Arrays.asList(301, 302, 303, 304),
                        Arrays.asList(401, 402, 403)));

        // 「202」と「403」を取得し出力するには？
        System.out.println(rooms.get(1).get(1));
        System.out.println(rooms.get(3).get(2));

        // 各階ごとに部屋番号を出力し改行するには？
        rooms.forEach(x -> {
            x.forEach(y -> {
                System.out.print(y);
                if (!y.equals(x.get(x.size() - 1))) {
                    System.out.print(", ");
                }
            });
            System.out.println();
        });
    }
}