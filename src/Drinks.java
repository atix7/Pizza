public enum Drinks {
    VINE(100, 750),  // Az amount a mennyiség ml-ben
    BEER(50, 500),
    COLA(20, 330),
    WATER(10, 1000);

    private final int price;
    private final int amount;

    Drinks(int price, int amount) {
        this.price = price;
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}
