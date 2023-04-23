public class Pizza {
    private String name;
    private int price;
    private Toppings top;
    private Size pSize;
    Recepies recepie;

    public Pizza(String name, int price,Recepies recepie) {
        this.name = name;
        this.price = price;
        this.recepie= recepie;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Size getSize() {
        return pSize;
    }

    public void storageMinus(){

    }

}
