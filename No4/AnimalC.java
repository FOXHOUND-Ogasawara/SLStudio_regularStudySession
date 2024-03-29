public abstract class AnimalC {
    protected String name;

    public AnimalC(String name) {
        this.name = name;
    }

    // 抽象メソッド
    public abstract void speak();

    // 具象メソッド
    public void sleep() {
        System.out.println(name + "は寝ています");
    }
}