public class HealthyHamburger extends Hamburger {
    private int num_additions = 0;
    private Additions add1, add2, add3, add4, add5, add6;
    private float add_price = 0;

    public HealthyHamburger(String meat, String roll_type, float price) {
        super("Healthy Hamburger", meat, roll_type, price);
        num_additions = 0;
        add1 = add2 = add3 = add4 = add5 = add6 = null;
    }

    public void add_additions(Additions addition) {
        switch (num_additions) {
            case 0:
                add1 = addition;

                add_price += addition.price;
                break;
            case 1:
                add2 = addition;
                add_price += addition.price;
                break;
            case 2:
                add3 = addition;
                add_price += addition.price;
                break;
            case 3:
                add4 = addition;
                add_price += addition.price;
                break;
            case 4:
                add5 = addition;
                add_price += addition.price;
                break;
            case 5:
                add6 = addition;
                add_price += addition.price;
                break;
            default:
                num_additions -= 1;
        }
        num_additions += 1;
    }

    public void calculatePrice() {
        System.out.println("Base price : " + this.burger_price);
        switch (num_additions) {
            case 6:
                add6.add_intro();
            case 5:
                add5.add_intro();
            case 4:
                add4.add_intro();
            case 3:
                add3.add_intro();
            case 2:
                add3.add_intro();
            case 1:
                add1.add_intro();
                break;
            default:
                System.out.println("No additions");
                break;
        }
        System.out.println("Additions price total: " + this.add_price);
        System.out.println("Grand Total: " + (this.add_price + this.burger_price));
    }
}
