// Sample02.java
public class Sample02 {
    public static void main(String[] args) {

        /*
         * ------------
         * else if の注意点
         * ------------
         */
        int deposit = 10000;

        // どちらが出力される？？
        if (deposit >= 1000) {
            System.out.println("預金は1,000円を超えています");
        } else if (deposit >= 10000) {
            System.out.println("預金は10,000円を超えています");
        }

        /*
         * ------------
         * 条件指定を分割してみる
         * ------------
         */
        int age = 25;
        int height = 165;

        if (age >= 10 && height >= 120) {
            System.out.println("ご利用いただけます");
        }

        if (age >= 10) {
            if (height >= 120) {
                System.out.println("ご利用いただけます");
            } else {
                System.out.println("身長が" + (120 - height) + "cm足りていません");
            }
        }

        boolean flag1 = false;
        boolean flag2 = false;

        if (age >= 10) {
            flag1 = true;
            System.out.println("年齢OKです");
        }

        if (height >= 120) {
            flag2 = true;
            System.out.println("身長OKです");
        }

        if (flag1 && flag2) {
            System.out.println("ご利用いただけます");
        }
    }
}