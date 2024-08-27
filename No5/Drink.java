public class Drink {
    private String name;
    private int price;
    private String maker;

    public Drink(String name, int price, String maker) {
        this.name = name;
        this.price = price;
        this.maker = maker;
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