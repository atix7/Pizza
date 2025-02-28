import java.util.ArrayList;

public class Order {

    private int orderId;
    static int lastOrderID;
    private final ArrayList<Drinks> drinks;
    private int numberOfDrinks;
    private Recepies recepie;

    private ArrayList<Pizza> pizzas;

    public Order(Drinks drink, int numberOfDrinks, Pizza pizza) {
        lastOrderID++;
        this.orderId = lastOrderID;
        this.pizzas = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.pizzas.add(pizza);
        for (int i = 0; i < numberOfDrinks; i++) {
            this.drinks.add(drink);
        }
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void addDrink(Drinks drink, int numberOfDrinks) {
        for (int i = 0; i < numberOfDrinks; i++) {
            this.drinks.add(drink);
        }
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

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public int getNumberOfDrinks() {
        return numberOfDrinks;
    }

    public void setNumberOfDrinks(int numberOfDrinks) {
        this.numberOfDrinks = numberOfDrinks;
    }

    public ArrayList<Drinks> getDrinks() {
        return drinks;
    }

    public double getTotalPrice() {
        double total = 0;
        for (Pizza pizza : pizzas) {
            switch (pizza.getpSize()) {
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
        }

        for (Drinks d : drinks) {
            total += d.getPrice();
        }
        return total;
    }

}