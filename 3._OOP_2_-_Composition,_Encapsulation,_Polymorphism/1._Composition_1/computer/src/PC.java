public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;
    private boolean isOn;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.isOn = false;
    }

    public void switchPC() {
        this.isOn = !this.isOn;
        if (this.isOn)
            System.out.println("PC on");
        else
            System.out.println("PC off");
    }
}
