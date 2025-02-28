public class Pizza {
    private String name;
    private int price;
    private Size pSize;
    private Recepies recepie;
    private static int numberOfPizzas=0;

    public Pizza(String name, int price,Recepies recepie, Size pSize) {
        this.name = name;
        this.price = price;
        this.recepie= recepie;
        this.pSize = pSize;
        numberOfPizzas++;
    }
    public static int getNumberOfPizzas(){
        return numberOfPizzas;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Size getpSize() {
        return pSize;
    }

    public void setpSize(Size pSize) {
        this.pSize = pSize;
    }

    public Recepies getRecepie() {
        return recepie;
    }

    public void setRecepie(Recepies recepie) {
        this.recepie = recepie;
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
