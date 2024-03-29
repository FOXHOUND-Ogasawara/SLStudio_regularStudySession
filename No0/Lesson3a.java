public class Lesson3a {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        String text = "10足す5は";

				// 出力結果は何になる？
        System.out.println(text + (num1 + num2));

        // Q. 計算結果が「40」となり、「○○掛ける○○は40」と出力するには？
        // ルールとして出力処理は変えてはいけません
        // 上の出力結果も変えてはいけません
        System.out.println(text + (num1 * num2));
    }
}