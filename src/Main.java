public class Main {

    public static void main(String[] args) {
        /*public Pizza whatWasOrdered () {   ???????
            System.out.println("\nOrder number: " + o1.getOrderId() + " you ordered a pizza: ");
            for (Pizza p : o1.getPizzas()) {
                System.out.println(" the pizza name is " + p.getName() + ", in " + p.getSize());

            }
        }*/
        Pizza pizzaVar;
        //Storage s1 = new Storage(9999, 3,5);
        Cook c1 = new Cook("Johny", 5);

        Pizza p1 = new Pizza("Piedone", 2000, Size.small);
        Pizza p2 = new Pizza("Margaritha", 2500, Size.small);

        System.out.println("The cook " + c1.getName() + ", and his skill level is : " + c1.getKnowledgeLevel());

        Order o1 = new Order(Toppings.meat, Size.large);
        Order o2 = new Order(Toppings.tomato, Size.large);
        o1.addPizza(p1);
        o1.addPizza(p1);
        printOrder(o1);
        o2.addPizza(p2);
        o2.addPizza(p2);
        printOrder(o2);

        /*System.out.println("\nOrder number: " + o1.getOrderId() + " you ordered a pizza: ");
        for (Pizza p : o1.getPizzas()) {
            System.out.println(" the pizza name is " + p.getName() + ", in " + p.getSize());
        }

        System.out.println("\nOrder number: " + o2.getOrderId() + " you ordered a pizza: ");
        for (Pizza p : o2.getPizzas()) {
            System.out.println(" the pizza name is " + p.getName() + ", in " + p.getSize());
        }*/

        System.out.println("\nYou must pay: " + o1.getTotalPrice());
        System.out.println("You must pay: " + o2.getTotalPrice());
        System.out.println(p1.getSize());
    }
    public static void printOrder(Order order) {
        for (Pizza p : order.getPizzas()) {
            System.out.println(" the pizza name is " + p.getName() + ", in " + p.getSize());
        }
        System.out.println();
    }


}