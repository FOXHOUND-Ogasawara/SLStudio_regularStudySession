import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample03 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("呼び出す機能を選んでください。");
        System.out.println("1:メニュー表示, 2:店員呼び出し, 3:お会計, 4:終了");
        String menu = br.readLine();

        switch (menu) {
            case "1":
                System.out.println("メニューを表示します");
                break;
            case "2":
                System.out.println("店員をお呼びしています");
                break;
            case "3":
                System.out.println("お会計を行います");
                break;
            case "4":
                System.out.println("終了します");
                break;
            default:
                System.out.println("1~4以外が選択されました");
                break;
        }
    }
}