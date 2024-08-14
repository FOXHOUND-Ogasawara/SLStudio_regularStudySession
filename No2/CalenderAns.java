public class CalenderAns {
    public static void main(String[] args) {

        int[][] days = {
                { 0, 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12, 13 },
                { 14, 15, 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25, 26, 27 },
                { 28, 29, 30 }
        };

        for (int[] week : days) {
            for (int d : week) {
                if (d == 0) {
                    System.out.print("- ");
                    continue;
                }
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }
}
