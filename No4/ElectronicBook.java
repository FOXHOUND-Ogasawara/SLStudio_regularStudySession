public class ElectronicBook extends Book {
    public ElectronicBook(String category) {
        super(category);
        this.type = "電子書籍";
    }

    @Override
    public void read() {
        System.out.println(type + "の" + category + "をスワイプして読みます");
    }
}