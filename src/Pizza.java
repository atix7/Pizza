public class Pizza {
    private String name;
    private int price;
    private Toppings top;
    private Size pSize;

    /*public Pizza(String name, int price, Size size) {
        this.name = name;
        this.price = price;
        this.pSize = size;
    }*/
    public Pizza(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
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

}
