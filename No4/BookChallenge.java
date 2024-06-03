public class BookChallenge {
    private String name;
    private int stock;
    private String type;

    public abstract void read();

    public BookChallenge(String name, String type) {
        this.name = name;
        this.type = type;
        this.stock = 0;
    }

    @Override
    public void order(int stock) {
        System.out.println(this.name + "を" + stock + "冊注文します。");
        addStock(stock);
        showStock();
    }

    // showStockの実装
    // addStockの実装
    // getTypeの実装
    /*
     * ・Productインターフェースを実装した抽象クラスであるBookクラスを定義する
     * ・showStock() の実装
     * 「現在の在庫は○○です」というフォーマットで現在の在庫数を表示する
     * ・addStock()の実装
     * フィールド stock に引数の値を加算する
     * ・getType()の実装
     * フィールド stock を返す
     */
}