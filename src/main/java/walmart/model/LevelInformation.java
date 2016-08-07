package walmart.model;

import java.util.List;

public class LevelInformation {

    private int levelId;
    private String levelName;
    private double price;
    private int rows;
    private int seatsInRow;

    private List<SeatInformation> availableSeats;

    public LevelInformation(int levelId, String levelName, double price, int rows, int seatsInRow){

        this.levelId = levelId;
        this.levelName = levelName;
        this.price = price;
        this.rows = rows;
        this.seatsInRow = seatsInRow;

        for(int i= 0; i<rows;i++){
            for(int j=0; j<seatsInRow; j++){
                SeatInformation totalSeats = new SeatInformation(levelId,i,j);
                this.getAvailableSeats().add(totalSeats);
            }
        }
    }


    public int getlevelId() {
        return levelId;
    }

    public String getlevelName() {
        return levelName;
    }

    public int getrows() {
        return rows;
    }

    public int getSeatsInRow() {
        return seatsInRow;
    }

    public int getSeatsInLevel() {
        return rows * seatsInRow;
    }

    public double getprice() {
        return price;
    }


    public List<SeatInformation> getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(List<SeatInformation> availableSeats) {
        this.availableSeats = availableSeats;
    }
}
