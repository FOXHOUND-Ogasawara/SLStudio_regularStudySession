public class Sample02a {
    public static void main(String[] args) {
        ElectronicBook eBook = new ElectronicBook("絶対合格！▲▲資格取得完全攻略");
        PaperBook pBook = new PaperBook("日常に潜む危険なルーティーン");

        eBook.read();
        pBook.read();

        // 本を注文する処理の実装
        eBook.order(10);
        pBook.order(5);
    }
}
