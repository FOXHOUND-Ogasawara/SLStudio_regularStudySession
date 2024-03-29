public class CatB extends AnimalB {
    // 抽象メソッドはオーバーライドしなければいけない
    @Override
    public void speak() {
        System.out.println("にゃん");
    }

    @Override
    public void showClassName() {
        System.out.println("このクラスはCatです");
    }
}