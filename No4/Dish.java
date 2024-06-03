public abstract class Dish implements Product2 {
    private String name;
    private int stock;
    private String category;
    private String[] ingredient;

    public abstract void eat();

    public Dish(String name, String category, String[] ingredient) {
        this.name = name;
        this.category = category;
        this.ingredient = ingredient;
        this.stock = 0;
    }

    @Override
    public void order(int stock) {
        System.out.println(this.name + "を" + stock + "食分注文します");
        addStock(stock);
        showStock();
    }

    @Override
    public void showStock() {
        System.out.println("現在の在庫は" + this.stock + "食です");
    }

    @Override
    public void addStock(int stock) {
        this.stock += stock;
    }

    public String getCategory() {
        return this.category;
    }

    public void showIngredient() {
        System.out.println(this.name + "の材料一覧を表示します");
        for (String ingredient : this.ingredient) {
            System.out.print(ingredient + " ");
        }
    }
}
