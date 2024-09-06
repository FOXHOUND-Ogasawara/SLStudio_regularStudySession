public class Sample {
    public static void main(String[] args) {

        // 以下の内容を並び替えて1~9の順番になるように修正しなさい
        System.out.println("1番目");
        System.out.println("7番目");
        System.out.println("2番目");
        System.out.println("9番目");
        System.out.println("3番目");
        System.out.println("5番目");
        System.out.println("4番目");
        System.out.println("8番目");
        System.out.println("6番目");


        // 以下の内容には誤字があるため修正したい
        // 「namber1」となっている箇所を全て「number1」に置換しなさい
        int namber1;
        int number2;
        int sum;
        namber1 = 5;
        number2 = 3;

        System.out.println("現在の数値: 1つめ[" + namber1 + "], 2つめ[" + number2 + "]");
        namber1++;
        number2++;
        sum = namber1 + number2;
        System.out.println("合計値: " + sum);
        ++namber1;
        ++number2;
        sum = namber1 + number2;
        System.out.println("合計値: " + sum);
        namber1--;
        number2--;
        sum = namber1 + number2;
        System.out.println("合計値: " + sum);
        --namber1;
        --number2;
        sum = namber1 + number2;
        System.out.println("合計値: " + sum);
    }
}