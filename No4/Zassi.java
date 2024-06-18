public abstract class Zassi implements Product2 {
    private String name;
    private int stock;
    private String type;

    public Zassi(String name, String type) {
        this.name = name;
        this.type = type;
        this.stock = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }





}
