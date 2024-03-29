public class Sample06c {
    public static void main(String[] args) {

        // 定義だけの場合
        // int[][] rooms = new int[3][5];

        // 初期化を含めた場合
        int[][] rooms = {
            {101, 102, 103, 105, 106},
            {201, 202, 203, 205, 206},
            {303, 302, 303, 305, 306}
        };

        System.out.println("私の部屋は" + rooms[1][3] + "号室です");

        // 出力するには
        // for (int i=0; i<room.length; i++) {
        //     for (int j=0; j<room[i].length; j++) {
        //         System.out.print(room[i][j]);
        //     }
        //     System.out.println();
        // }
    }
}