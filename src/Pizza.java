public class Pizza {
    private String name;
    private int price;
    private Toppings top;
    private Size pSize;

    public Pizza(String name, int price, Size size) {
        this.name = name;
        this.price = price;
        this.pSize = size;
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

    public Toppings getTop() {
        return top;
    }

    public void setTop(Toppings top) {
        this.top = top;
    }

    public Size getSize() {
        return pSize;
    }

    public void setpSize(Size pSize) {
        this.pSize = pSize;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
