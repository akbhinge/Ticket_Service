package walmartTest;


import org.junit.Assert;
import org.junit.Test;
import walmart.model.SeatHoldInformation;
import walmart.service.TicketService;

import java.util.Optional;

public class TicketServiceTest {
/*
    private TicketService ticketService;


    // Test to check if Level 1 returns all the total 1250 seats available

    @Test
    public void testSeatInformationForLevelOne(){
        int totalSeatsAvailable = ticketService.numSeatsAvailable(Optional.of(1));
        Assert.assertEquals(1250, totalSeatsAvailable);

    }

    // Test to get seat information if no venue level is provided

    @Test
    public void testSeatInformationForNoInput(){
        int totalSeatsAvailable = ticketService.numSeatsAvailable(null);
        Assert.assertEquals(6250, totalSeatsAvailable);

    }

    // Test to check if non-existent venue level is provided

    @Test
    public void testSeatInformationForUnauthorizedVenueLevel(){
        int totalSeatsAvailable = ticketService.numSeatsAvailable(Optional.of(15));
        Assert.assertEquals(0, totalSeatsAvailable);

    }


    // Test to check if Seathold is successful and returns appropriate value after test
    @Test
    public void testFindAndHoldSeats()  {
        SeatHoldInformation seatHold = ticketService.findAndHoldSeats(20, Optional.of(1), Optional.of(5), "abhinge@gmail.com");
        final int numSeatsAvailableAfterSeatHold = ticketService.numSeatsAvailable(Optional.of(5));
        Assert.assertEquals(1230, numSeatsAvailableAfterSeatHold);

    }*/
}
