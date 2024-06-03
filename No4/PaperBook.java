public class PaperBook extends Book2 {
    public PaperBook(String name) {
        super(name, "紙の書籍");
    }

    @Override
    public void read() {
        System.out.println(getType() + "なのでページをめくりながら読みます");
    }
}