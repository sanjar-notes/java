public class Car extends Vehicle {
    private float steering;
    private int gear;

    public Car(float speed, float steering, int gear) {
        super(speed);
        this.steering = steering;
        this.gear = gear;
    }

    public Car() {
        this(0, 0, 0);
    }

    public void changeGear(int gear) {
        if (gear > 0 && gear < 6)
            this.gear = gear;
        System.out.println("Current gear: " + this.gear);
    }

    public void changeSteering(float steering) {
        if (steering > 0.0F && steering < 360.0F)
            this.steering = steering;
        System.out.println("Current steering angle: " + this.steering);
    }
}
