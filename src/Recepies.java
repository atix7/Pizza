public class Recepies {
    private String name;
    private double flour;    // All ingredients are meant in grams
    private double salt;
    private double water;

    public Recepies(String name, double flour, double salt, double water) {
        this.name = name;
        this.flour = flour;
        this.salt = salt;
        this.water = water;

    }
    public double getFlour() {
        return flour;
    }

    public void setFlour(double flour) {
        this.flour = flour;
    }

    public double getSalt() {
        return salt;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }
}
