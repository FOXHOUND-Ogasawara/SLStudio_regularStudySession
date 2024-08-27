import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge03 {
    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>(
                Arrays.asList(
                        Arrays.asList(101, 102, 103, 104, 105),
                        Arrays.asList(201, 202, 203, 204, 205),
                        Arrays.asList(301, 302, 303, 304),
                        Arrays.asList(401, 402, 403)));

        // 「202」と「403」を取得し出力するには？
        System.out.println(rooms);

        // 各階ごとに部屋番号を出力し改行するには？
        // 各番号ごとに「,」を付け、三桁目が変わるタイミングで改行すること
    }
}