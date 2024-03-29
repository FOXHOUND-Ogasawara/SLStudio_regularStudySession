public class Book {
    public String category;
    public String type;

    public Book(String category) {
        this.category = category;
    }

    public void read() {
        System.out.println("本を読みます");
    }
}