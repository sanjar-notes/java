public class DeluxeBurger extends Hamburger {
    private Additions chips;
    private Additions drink;
    private float add_price;

    public DeluxeBurger(String meat, String roll_type, float price, Additions chips, Additions drink) {
        this(meat, roll_type, price);
        this.chips = chips;
        this.drink = drink;
        add_price += (chips.price + drink.price);
    }

    public DeluxeBurger(String meat, String roll_type, float price) {
        super("Deluxe Hamburger", meat, roll_type, price);
    }

    public void calculatePrice() {
        System.out.println("Base price: " + this.burger_price);
        if (chips != null)
            chips.add_intro();
        if (drink != null)
            drink.add_intro();
        System.out.println("Additions price: " + this.add_price);
        System.out.println("Total price: " + (this.add_price + super.burger_price));
    }
}
