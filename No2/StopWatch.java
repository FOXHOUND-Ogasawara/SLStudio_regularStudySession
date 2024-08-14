import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StopWatch {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = 0;

        while (true) {
            System.out.print("計りたい時間を入力してください(10秒以内):");
            String input = br.readLine();
            if (!input.matches("[0-9]+")) {
                System.out.println("数値を入力してください。");
                continue;
            }
            time = Integer.parseInt(input);
            if (time > 10) {
                System.out.println("秒数は10秒以内で入力してください。");
            } else
                break;
        }

        for (int i = time; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("時間です");
    }
}
