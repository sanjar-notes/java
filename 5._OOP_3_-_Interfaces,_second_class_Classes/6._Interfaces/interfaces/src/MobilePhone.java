public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        if (this.isOn == false) {
            this.isOn = true;
            System.out.println("Mobile phone powered up");
        }
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on mobile phone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && this.isOn)
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
