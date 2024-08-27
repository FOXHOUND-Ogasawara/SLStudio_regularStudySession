public class Product {
    private int id;
    private String name;
    private int price;
    private String maker;

    public Product(int id, String name, int price, String maker) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.maker = maker;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}