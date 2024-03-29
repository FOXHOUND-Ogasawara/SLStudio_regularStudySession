public abstract class Bird extends AnimalC implements IFlyable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + "はさえずります");
    }

    @Override
    public void fly() {
        System.out.println(name + "は空を飛びます");
    }
}