public abstract class Book2 implements Product2 {
    private String name;
    private int stock;
    private String type;

    public abstract void read();

    public Book2(String name, String type) {
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

    @Override
    public void showStock() {
        System.out.println("現在の在庫は" + this.stock + "です");
    }

    @Override
    public void addStock(int stock) {
        this.stock += stock;
    }

    public String getType() {
        return this.type;
    }
}
