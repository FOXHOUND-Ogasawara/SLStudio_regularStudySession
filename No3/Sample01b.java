import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample01b {
    public static void main(String[] args) throws IOException {

        String inputData = inputData();
        System.out.println(inputData);

        // roop()に10と渡した場合の結果は？
        int result = roop(10);
        System.out.println(result);
    }

    public static String inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("文字を入力してください");
        String inputData = br.readLine();

        if (!inputCheck(inputData)) {
            inputData = inputData();
        }

        return inputData;
    }

    public static boolean inputCheck(String inputData) {
        boolean flag = true;

        if (inputData.length() > 10) {
            System.out.println("入力した文字数が指定値を超えました");
            flag = false;
        }

        return flag;
    }

    public static int roop(int num) {
        if (num < 100) {
            num++;
            num = roop(num);
        }
        return num;
    }
}