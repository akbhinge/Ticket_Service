package walmart.model;

import java.util.List;

/**
 *  This class consists of all the necessary information to hold seats at the venue
 *
 */

public class SeatHold {

    private String customerEmail;
    private List<SeatInformation> availableSeats;

    public SeatHold(String customerEmail, List<SeatInformation> availableSeats){

        this.customerEmail = customerEmail;
        this.availableSeats = availableSeats;
    }

    public String getCustomerEmail(){
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public List<SeatInformation> getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(List<SeatInformation> availableSeats) {
        this.availableSeats = availableSeats;
    }
}
