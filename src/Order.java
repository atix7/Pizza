import java.util.ArrayList;

public class Order {

    private int orderId;
    static int lastOrderID;
    private Size sizeOfPizza;
    private Toppings topOfPizza;

    private ArrayList<Pizza> pizzas;

    public Order(Toppings top, Size size) {
        lastOrderID++;
        pizzas = new ArrayList<Pizza>();
        this.orderId = lastOrderID;
        this.sizeOfPizza = size;
        this.topOfPizza = top;
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getTotalPrice() {
        double total = 0;
        for (Pizza pizza : pizzas) {
            switch (sizeOfPizza) {
                case small -> {
                    total += 0.5 * pizza.getPrice();
                }
                case medium -> {
                    total += pizza.getPrice();
                }
                case large -> {
                    total += 1.5 * pizza.getPrice();
                }
            }
            switch (topOfPizza){
                case meat -> total+=1000;
                case cheese -> total+=1100;
                case vega -> total+=800;
                case tomato -> total+=500;
            }
        }
        return total;
    }
}