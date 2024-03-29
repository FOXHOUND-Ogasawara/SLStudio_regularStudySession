public class Lesson2c {
    public static void main(String[] args) {
        /*
         * 数値を扱う
         */
        // 数値を出力
        System.out.println(12345);

        // 足し算してみる
        System.out.println(1 + 1 + 1);
        // 引き算してみる
        System.out.println(10 - 2);
        // 掛け算してみる
        System.out.println(2 * 3);
        // 割り算してみる
        System.out.println(10 / 2);

        // 計算の優先順位は算数と同じ（掛け算が先）
        System.out.println(2 + 2 * 10); // 22 が出力

        // 算数の様に()で先に計算出来る
        System.out.println((2 + 2) * 10); // 40 が出力

        // 2で割ったあまりを出力してみる
        System.out.println(9 % 2); // 1 が出力

        // こうした場合はどうなるでしょうか？？
        System.out.println("5+2は"(5 + 2) + "です");
    }
}