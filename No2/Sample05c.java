public class Sample05c {
    public static void main(String[] args) {

        // シンプルなfor文
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // 繰り返しをネストさせることも可能
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i:" + i + "| j:" + j);
                // System.out.print(i % 2 == 1 ? 1 : 0);
            }
            System.out.println();
        }
    }
}