package walmart.service;


import walmart.model.LevelInformation;
import walmart.model.SeatHold;
import walmart.model.SeatInformation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;



/**
 *  TicketService implementation abstract class to implement TicketService interface
 *
 */

public class TicketServiceImpl implements TicketService {

    private HashMap<Integer, LevelInformation> availableVenue;
    private List<SeatInformation> heldSeats;


    public TicketServiceImpl(){

        availableVenue = new HashMap<Integer, LevelInformation>();

        LevelInformation level1 = new LevelInformation(1,"Orchestra",100.00,25,50);
        LevelInformation level2 = new LevelInformation(2,"Main",75.00,20,100);
        LevelInformation level3 = new LevelInformation(3,"Balcony1",50.00,15,100);
        LevelInformation level4 = new LevelInformation(4,"Balcony2",40.00,15,100);

        availableVenue.put(level1.getlevelId(),level1);
        availableVenue.put(level2.getlevelId(),level2);
        availableVenue.put(level3.getlevelId(),level3);
        availableVenue.put(level4.getlevelId(),level4);

        heldSeats= new ArrayList<SeatInformation>();
    }

    /**
     *
     * @param venueLevel a numeric venue level identifier to limit the search
     * @return
     */

    public int numSeatsAvailable(Optional<Integer> venueLevel){

        if(venueLevel.get() < 1  || venueLevel.get()> 4)
        {
            System.out.println("Unauthorized Venue Level");
        }

        if(venueLevel.isPresent()){
            return availableVenue.get(venueLevel.get()).getAvailableSeats().size();

        }else{

           int totalSeats = 0;

            /*
                Get total available seats from all the levels
             */
           for(int i=0;i<4;i++){
               totalSeats += availableVenue.get(venueLevel.get()).getAvailableSeats().size();
            }
            return totalSeats;
        }
    }

    public SeatHold findAndHoldSeats(int numSeats, Optional<Integer> minLevel, Optional<Integer> maxLevel, String customerEmail){

        SeatHold seatHold;

        if(minLevel.get() < 1 || minLevel.get() > 4 || minLevel.get() > maxLevel.get()){
                System.out.println("Unauthorized Min level");
            }
             if( maxLevel.get() <1 || maxLevel.get() > 4){
                 System.out.println("Unauthorized Max level");
             }

        /*
         *  Assumption: A customer can hold only 20 seats per reservation
         */
        if(minLevel.isPresent() && maxLevel.isPresent()){

            if(numSeats <0 && numSeats > 20){
                System.out.println(" You can select maximum 20 seats per reservation ");
            }

            for(int i = minLevel.get(); i <= maxLevel.get();i++){

                if(availableVenue.get(i).getAvailableSeats().size() > numSeats){
                    LevelInformation level = availableVenue.get(i);

                    for(int j=0 ; j<numSeats;j++)
                    {
                        if(availableVenue.get(j).getAvailableSeats().size() > 0){
                            heldSeats.add(level.getAvailableSeats().get(j));
                            level.getAvailableSeats().remove(j);
                        }
                    }
                }
            }
            seatHold = new SeatHold(customerEmail,heldSeats);
            return seatHold;
        }
        return null;
    }


    /*
     Method to reserve seats based on customer request*/
    public String reserveSeats(int seatHoldId, String customerEmail){

    }

}
