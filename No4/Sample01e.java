import java.util.ArrayList;

import java.util.List;

public class Sample01e {
    public static void main(String[] args) {

        // インスタンス化
        Book pBook = new PaperBook("参考書");
        Book eBook = new ElectronicBook("マンガ");

        reading(pBook);
        reading(eBook);

        // ArrayListを使えばこのような処理も可能です
        List<Book> books = new ArrayList<>();
        books.add(new PaperBook("辞典"));
        books.add(new ElectronicBook("小説"));

        for (Book book : books) {
            reading(book);
        }
    }

    public static void reading(Book book) {
        book.read();
    }
}