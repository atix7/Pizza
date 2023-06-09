public class Main {

    public static void main(String[] args) {
        Recepies Piedone = new Recepies("Piedone",1.5,0.2,0.6);  //Ez egy recept
        Recepies Margaritha = new Recepies("Margaritha",1.5,0.2,0.6);  //Ez egy recept

        Storage s1 = new Storage(10,10,100);   //Ez a raktár

        Cook c1 = new Cook("Johny", 5);     //Ez lesz a szakács

        Pizza p1 = new Pizza("Piedone", 2000,Piedone);
        Pizza p2 = new Pizza("Margaritha", 2500,Margaritha);

        System.out.println("The cook " + c1.getName() + ", and his skill level is : " + c1.getKnowledgeLevel());

        Order o1 = new Order(Toppings.meat, Size.small,Piedone);
        Order o2 = new Order(Toppings.tomato, Size.medium,Margaritha);
        o1.addPizza(p1);
        o1.addPizza(p1);
        printOrder(o1);
        o2.addPizza(p2);
        o2.addPizza(p1);
        o2.addPizza(p1);
        o2.addPizza(p2);
        printOrder(o2);
        System.out.println("The amount of flour in storage: "+ Storage.flour);
        System.out.println("The amount of salt in storage: "+ Storage.salt);
        System.out.println("The amount of water in storage: "+ Storage.water);

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