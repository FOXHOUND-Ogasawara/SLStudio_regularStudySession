import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudySample02ex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        String[] inputCount = { "ひとつ目", "二つ目", "三つ目" };
        int[] nums = new int[3];
        int result = 0;
        int count = 0;
        boolean roop = true;

        System.out.println("0~9の数字を入力してください");

        while (roop) {
            if (count >= 3) {
                roop = false;
                break;
            }
            System.out.print(inputCount[count] + "の数字を入力してください: ");
            input = br.readLine();
            nums[count] = Integer.parseInt(input);

            if (nums[count] < 0 || nums[count] > 9) {
                System.out.println("0~9以外の数字が入力されました");
                continue;
            }
            result += nums[count];
            count++;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "+");
            if (i == nums.length - 1) {
                System.out.println("=" + result);
            }
        }
    }
}