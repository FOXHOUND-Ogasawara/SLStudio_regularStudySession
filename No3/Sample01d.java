public class Sample01d {
    public static void main(String[] args) {
        // 関数の呼び出し
        int num = add(22, 22);
        System.out.println(num);
    }

    // int型の値を戻り値として設定している
    public static int add (int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}