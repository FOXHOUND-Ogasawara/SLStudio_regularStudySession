public class Sample02b {
    public static void main(String[] args) {
        // インスタンス化
        Person2 taro = new Person2("太郎", 30, "東京都");

        // メソッドの実行
        taro.showProfile();

        // privetのフィールドへはアクセスできない
        // taro.name = "二郎";

        // setterを利用する
        // taro.setName("二郎");
        // taro.showProfile();
    }
}