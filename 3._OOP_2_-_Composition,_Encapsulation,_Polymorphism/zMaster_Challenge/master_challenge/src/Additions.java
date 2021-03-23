public class Additions {
    protected float price;
    protected String name;

    public Additions(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public void add_intro() {
        System.out.println(name + " : " + price);
    }
}
