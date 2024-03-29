public class Sample05b {
    public static void main(String[] args) {

        int count = 1;
        boolean flag = true;

        while (flag) {
            System.out.println(count);

            if (count >= 5) {
                System.out.println("countの数値が5を超えました");
                flag = false;
            }
            count++;
        }
    }
}