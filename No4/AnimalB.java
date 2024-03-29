public abstract class AnimalB {
    // 抽象メソッドを定義
    public abstract void speak();

    // 具象メソッド(従来のメソッド)を定義
    public void showClassName() {
        System.out.println("このクラスはAnimalです");
    }
}