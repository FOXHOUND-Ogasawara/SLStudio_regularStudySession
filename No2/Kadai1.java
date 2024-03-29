public class Kadai1 {
    public static void main(String[] args) {
        int[][] matrix = {
            { 4, 2, 7, 1 },
            { 8, 5, 3, 9 },
            { 6, 10, 2, 3 }
        };

        // 行ごとにバブルソートを実行
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                for (int k = 0; k < matrix[i].length - j - 1; k++) {
                    // 隣接する要素を比較して順序が逆なら交換
                    if (matrix[i][k] > matrix[i][k + 1]) {
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = temp;
                    }
                }
            }
        }

        // 2次元配列の各要素を出力する
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}