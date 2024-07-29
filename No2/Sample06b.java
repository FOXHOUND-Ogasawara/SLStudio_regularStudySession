public class Sample06b {
    public static void main(String[] args) {

        // 定義と初期化
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // 全て出力するには10回printが必要だが…
        // System.out.println(nums[0]);
        // System.out.println(nums[1]);
        // System.out.println(nums[2]);

        // for文と組み合わせると？
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }

        // こんな書き方も用意されている
        for (int num : nums) {
            System.out.print(num + ", ");
        }
    }
}