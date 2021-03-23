import java.util.Comparator;

public class Seat implements Comparable {
    private int seatNumber;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    // @Override
    // public int compare(Object arg0, Object arg1) {
    // if (((Seat) arg0).seatNumber < ((Seat) arg1).seatNumber)
    // return -1;
    // else if (((Seat) arg0).seatNumber > ((Seat) arg1).seatNumber)
    // return 1;
    // return 0;
    // }

    @Override
    public int compareTo(Object arg0) {
        if (this.seatNumber < ((Seat) arg0).seatNumber)
            return -1;
        else if (this.seatNumber > ((Seat) arg0).seatNumber)
            return 1;
        return 0;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }
}
