import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Recepies Piedone = new Recepies("Piedone", 1.5, 0.2, 0.6);  //Ez egy recept
        Recepies Margaritha = new Recepies("Margaritha", 1.5, 0.2, 0.6);  //Ez egy recept
        Recepies Havai = new Recepies("Havai", 1.5, 0.2, 0.6);  //Ez egy recept

        Storage s1 = new Storage(10, 10, 100);   //Ez a raktár

        //Cook c1 = new Cook("Johny", 5);     //Ez lesz a szakács

        Pizza p1 = new Pizza("Piedone", 2000, Piedone, Size.medium);
        Pizza p2 = new Pizza("Margaritha", 2500, Margaritha, Size.medium);
        Pizza p3 = new Pizza("Havai", 3000, Havai, Size.large);
        Pizza p4 = new Pizza("Havai", 3000, Havai, Size.small);

        //System.out.println("The cook " + c1.getName() + ", and his skill level is : " + c1.getKnowledgeLevel());

        Order o1 = new Order(Drinks.VINE, 3, p1);
        o1.addPizza(p2);
        o1.addPizza(p3);
        o1.addDrink(Drinks.WATER, 2);

        Order o2 = new Order(Drinks.BEER, 2,p2);
        o2.addPizza(p1);
        o2.addPizza(p4);

        printOrder(o1);
        printOrder(o2);
        //System.out.println("Pizzák száma: " + Pizza.getNumberOfPizzas());
    }
    public static void printOrder(Order order) {
        int i = 0;
        System.out.println("Order ID: " + order.getOrderId());
        for (Pizza p : order.getPizzas()) {
            i++;
            System.out.format("\tPizza %d. is:\t%-15s\tin size:\t%-10s\tand the price is:\t%d%n", i, p.getName(), p.getpSize(), p.getPrice());
        }
        System.out.println("Drinks:");
        Map<Drinks, Integer> drinkCounts = new HashMap<>();
        for (Drinks d : order.getDrinks()) {
            drinkCounts.put(d, drinkCounts.getOrDefault(d, 0) + 1);
        }
        for (Map.Entry<Drinks, Integer> entry : drinkCounts.entrySet()) {
            Drinks drink = entry.getKey();
            int count = entry.getValue();
            System.out.println("\t"+ drink + "\tprice: " + drink.getPrice() + "\tquantity: " + count);
        }
        System.out.println("  --------------------------------------  \nThe total price is: " + order.getTotalPrice());
        System.out.println();
    }
}
//2nd try