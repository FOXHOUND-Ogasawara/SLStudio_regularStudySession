public class PaperBook extends Book{
    public PaperBook(String category) {
        super(category);
        this.type = "紙の書籍";
    }

    @Override
    public void read() {
        System.out.println(type + "の" + category + "をめくりながら読みます");
    }
}