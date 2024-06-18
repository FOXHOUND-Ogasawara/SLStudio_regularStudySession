public class Product {
    private String name;
    private String price;
    private String category;

    public Product(String name, String price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void showPropaties() {
        System.err.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
