public class Duck extends Bird implements ISwimmable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + "は「ガーガー」と鳴きます");
    }

    @Override
    public void swim() {
        System.out.println(name + "は水を泳ぎます");
    }
}