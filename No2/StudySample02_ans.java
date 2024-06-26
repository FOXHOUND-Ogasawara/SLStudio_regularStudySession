import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudySample02_ans {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        String[][] quetions = {
                { "8 × 2", "16 × 2", "32 × 2", "64 × 2", "128 × 2" },
                { "16", "32", "64", "128", "256" }
        };

        for (int i = 0; i < quetions[0].length; i++) {
            System.out.println("次の計算結果は？");
            System.out.println(quetions[0][i]);

            String input = br.readLine();

            if (input.equals(quetions[1][i])) {
                count++;
            }
        }

        System.out.println(quetions.length + "問中、正解は" + count + "問でした");
    }
}