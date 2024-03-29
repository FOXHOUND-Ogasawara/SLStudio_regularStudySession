public class Cat extends Animal {
    private String breed;

    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    // メソッドのオーバーライド
    @Override
    public void speak() {
        System.out.println(breed + "の" + getName() + "が何かを伝えています");
    }
}