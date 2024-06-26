// 展開用の元ファイル

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudySample02 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] quetions = {
                { "8 × 2", "16 × 2", "32 × 2", "64 × 2", "128 × 2" },
                { "16", "32", "64", "128", "256" }
        };

        System.out.println("N問中、正解はM問でした");
    }
}