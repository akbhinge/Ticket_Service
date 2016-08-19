package reservation.model;

/*
    Class containing all the necessary seat information for the theatre
*/
public class SeatInformation {

    private int seatLevel;
    private int row;
    private int seatNumber;

    public SeatInformation(int seatLevel, int row, int seatNumber){

        this.seatLevel = seatLevel;
        this.row = row;
        this.seatNumber = seatNumber;

    }

    public int getSeatLevel(){
        return seatLevel;
    }

    public int getrow(){
        return row;
    }

    public int getSeatNumber(){
        return seatNumber;
    }
}
