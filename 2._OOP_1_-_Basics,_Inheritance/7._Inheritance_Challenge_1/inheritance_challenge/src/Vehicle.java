public class Vehicle {
    public float speed; // every vehicle has some speed

    public Vehicle(float speed) {
        this.speed = speed;
    }

    public Vehicle() {
        this(0.0F);
    }

    public void changeSpeed(float speed) {
        float AbsSpeed = speed > 0 ? speed : -speed;
        if (AbsSpeed >= 0.0 && AbsSpeed < 3E8) {
            this.speed = speed;
            System.out.println("Current speed: " + this.speed);
        }
    }
}
