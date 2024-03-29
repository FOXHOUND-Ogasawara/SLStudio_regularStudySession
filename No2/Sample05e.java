public class Sample05e {
    public static void main(String[] args) {

        for (int i=0; i<5; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(j);
                // System.out.print(i % 2 == 1 ? 1 : 0);
            }
            System.out.println();
        }
    }
}