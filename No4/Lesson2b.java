class Lesson2b {
    public static void main(String[] args) {
        Bird bird = new Duck("ぴーちゃん");
        bird.speak();
        bird.fly();

        // Bird型のため、swim()は実行できない
        Duck duck = (Duck) bird;
        duck.swim();

        // インターフェースにダウンキャストしても実行できる
        ISwimmable ism = (ISwimmable) bird;
        ism.swim();
    }
}