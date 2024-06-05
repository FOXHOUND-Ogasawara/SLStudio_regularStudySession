public class Sample01a {
    public static void main(String[] args) {

        int result = 0;

        // 何と表示される？
        sayHello();

        // sum()を利用して「結果は120です」と表示させるには？
        // ??

        // calculation()を利用して計算し結果を表示するには？
        // ??
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void sum(int val1, int val2) {
        int result = val1 + val2;
        System.out.println("結果は" + result + "です");
    }

    public static int calculation(int num1, int num2, String opt) {
        int result;

        switch (opt) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                result = 0;
                System.out.println("不適切な演算子です");
                break;
        }
        return result;
    }
}