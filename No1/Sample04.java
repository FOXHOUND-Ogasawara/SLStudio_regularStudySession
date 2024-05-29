public class Sample04 {
    public static void main(String[] args) {

        int score = 45;
        String result = "";
        if (score > 70) {
            result = "合格";
        } else {
            result = "不合格";
        }
        System.out.println(result);

        // if文を三項演算子で表現すると…
        result = score > 70 ? "合格" : "不合格";
        System.out.println(result);
    }
}