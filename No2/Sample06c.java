public class Sample06c {
    public static void main(String[] args) {

        // 定義だけの場合
        // int[][] room = new int[3][5];

        // 初期化を含めた場合
        int[][] room = {
                { 101, 102, 103, 105, 106 },
                { 201, 202, 203, 205, 206 },
                { 303, 302, 303, 305, 306 }
        };

        System.out.println("私の部屋は" + room[1][4] + "号室です");

        // 出力するには
        for (int i = 0; i < room.length; i++) {
            System.out.println((i + 1) + "階には" + room[i].length + "個の部屋があります");
            for (int j = 0; j < room[i].length; j++) {
                System.out.print(room[i][j]);
                if (j < room[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}