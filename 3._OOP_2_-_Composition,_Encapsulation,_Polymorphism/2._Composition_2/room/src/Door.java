public class Door {
    private boolean isLocked;
    private String material;
    private String doorStyle;

    public Door(boolean isLocked, String material, String doorStyle) {
        this.isLocked = isLocked;
        this.material = material;
        this.doorStyle = doorStyle;
    }

    public Door() {
        this.isLocked = false;
        this.material = "Wood";
        this.doorStyle = "Silver finish";
    }

    public void lockDoor() {
        isLocked = true;
    }

    public void openDoor() {
        isLocked = false;
    }
}
