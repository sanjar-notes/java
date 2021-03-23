public class App {
    public static void main(String[] args) throws Exception {
        Additions drink = new Additions("Coke", 20.0F);
        Additions chips = new Additions("Cheetos", 10.0F);
        DeluxeBurger deb = new DeluxeBurger("Beef", "bread", 40.0F, drink, chips);

        Additions lettuce = new Additions("Lettuce", 5.0F);
        HealthyHamburger heb = new HealthyHamburger("Beef", "Multigrain bread", 40.0F);
        heb.add_additions(lettuce);
        heb.calculatePrice();
    }
}
