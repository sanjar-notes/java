public class DeskPhone implements ITelephone {
    private int myNumber;
    public boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action takes, no power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber)
            isRinging = true;
        else
            isRinging = false;
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
