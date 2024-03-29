public class Sample3 {
    public static void main(String[] args) {

        int age = 20;

        // 条件にあった場合のみのシンプルな構文
        if (age >= 1) {
            System.out.println("条件を満たしています");
        }

        // 当てはまった場合とそれ以外の2択となる構文
        if (age >= 18) {
            System.out.println("18以上です");
        } else {
            System.out.println("18未満です");
        }

        // 複数の条件がある場合の構文
        if (age >= 20) {
            System.out.println("20以上です");
        } else if (age >= 18) {
            System.out.println("20未満で18以上です");
        } else {
            System.out.println("18未満です");
        }
    }
}