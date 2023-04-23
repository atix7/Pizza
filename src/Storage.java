public class Storage {
    private double flour;    // All ingredients are meant in grams
    private double salt;
    private double water;

    public Storage(double flour, double salt, double water) {
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
