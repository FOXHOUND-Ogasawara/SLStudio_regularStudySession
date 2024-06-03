public class ElectronicBook extends Book2 {
    public ElectronicBook(String name) {
        super(name, "電子書籍");
    }

    @Override
    public void read() {
        System.out.println(getType() + "なので画面をスワイプして読みます");
    }
}