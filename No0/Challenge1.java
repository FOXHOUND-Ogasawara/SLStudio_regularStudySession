public class Challenge1 {
    public static void main(String[] args) {
        int x = 5;
        int y;
        int z;

        y = x;
        x = 10;
        z = y + x;

        System.out.println("xは" + x + "です");
        System.out.println("yは" + y + "です");
        System.out.println("zは" + z + "です");
    }
}