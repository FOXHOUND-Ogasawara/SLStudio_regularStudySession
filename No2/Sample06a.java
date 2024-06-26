public class Sample06a {
    public static void main(String[] args) {

        // 配列の準備
        int[] nums = new int[3];

        // 配列にデータを格納
        // キーワード：要素、添字、要素数
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 40;

        // 要素へアクセスし出力
        System.out.println(nums[2]);

        // 配列を使うと簡潔に記述できる
        String fruit1 = "apple";
        String fruit2 = "banana";
        String fruit3 = "cherry";

        System.out.println(fruit1);
        System.out.println(fruit2);
        System.out.println(fruit3);

        String[] fruits = { "apple", "banana", "cherry" };

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}