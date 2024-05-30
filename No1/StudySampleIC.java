public class StudySampleIC {
    public static void main(String[] args) {
        System.out.println("改札を通ろう！");
        System.out.println("ICカードをタッチ");

        System.out.println("残高チェック！");
        boolean isBalance = false;
        if (!isBalance) {
            System.out.println("残高が不足しています。入金してください");
            isBalance = true;
            System.out.println("入金しました。");
        }
        System.out.println("改札を通りました。");
    }
}