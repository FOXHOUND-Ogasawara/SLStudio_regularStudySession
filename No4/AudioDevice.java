public abstract class AudioDevice implements Product2 {
    private String name;
    private String productNumber;
    private int stock;

    public abstract void connect();

    public AudioDevice(String name, String productNumber) {
        this.name = name;
        this.productNumber = productNumber;
        this.stock = 0;
    }

    @Override
    public void order(int stock) {
        System.out.println(this.name + "を" + stock + "個注文します");
        addStock(stock);
        showStock();
    }

    @Override
    public void showStock() {
        System.out.println("現在の在庫は" + this.stock + "個です");
    }

    @Override
    public void addStock(int stock) {
        this.stock += stock;
    }

    public void listen() {
        System.out.println("音を聞きます");
    }

    public void showDeviceData() {
        System.out.println("製品情報");
        System.out.println("製品名: " + this.name);
        System.out.println("製品番号: " + this.productNumber);
    }
}