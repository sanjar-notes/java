public interface ITelephone {
    void powerOn();

    void dial(int phoneNumber);

    void answer();

    boolean callPhone(int phoneNumber);

    boolean isRinging();
}

// All the subclasses(implements) of the interface must implement the methods
// Access modifiers public are not needed
