import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample01 {
    public static void main(String[] args) {
        // List
        List<String> listSample1 = new ArrayList<>();
        List<String> listSample2 = new ArrayList<>(Arrays.asList(
                "ギター",
                "ベース",
                "ドラム",
                "キーボード"));

        // ArrayList
        ArrayList<String> arrayListSample = new ArrayList<>();

        // 基本機能
        listSample1.add("ごはん");
        listSample1.add("パン");
        arrayListSample.add("キャベツ");

        String data1 = listSample1.get(1);
        System.out.println(data1);
        String data2 = arrayListSample.get(0);
        System.out.println(arrayListSample.size() + "番目の要素は" + data2);

        // 繰り返しには forEachメソッド が利用できる
        listSample2.forEach(n -> {
            System.out.println(n);
        });
    }
}