public class Sample01c {
    public static void main(String[] args) {
        // 関数の呼び出し
        calculationResult(100, 10);

        // 変数を引数に渡すことも可能
        // int num1 = 100;
        // int num2 = 20;
        // calculationResult(num1, num2);
    }

    public static void calculationResult(int num1, int num2) {
        System.out.println(num1 + "と" + num2 + "足し算をした結果は「"+ (num1 + num2) + "」となります。");
        System.out.println(num1 + "と" + num2 + "引き算をした結果は「"+ (num1 - num2) + "」となります。");
        System.out.println(num1 + "と" + num2 + "掛け算をした結果は「"+ (num1 * num2) + "」となります。");
        System.out.println(num1 + "と" + num2 + "割り算をした結果は「"+ (num1 / num2) + "」となります。");
    }
}
