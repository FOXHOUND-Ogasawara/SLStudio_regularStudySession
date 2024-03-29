public class Sample02a {
    public static void main(String[] args) {
        // インスタンス化
        Person taro = new Person();

        // フィールドに値を代入する
        taro.name = "太郎";
        taro.age = 30;
        taro.address = "東京都";

        // メソッドの呼び出し
        taro.showProfile();

        // Person jiro = new Person();
        // jiro.name = "二郎";
        // jiro.age = 20;
        // jiro.address = "東京都";
        // jiro.showProfile();

        // taroのインスタンスには影響がでない
        // taro.showProfile();
    }
}