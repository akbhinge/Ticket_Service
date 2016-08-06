package walmartTest.model;

public class LevelInformation {

    private int levelId;
    private String levelName;
    private int price;
    private int rows;
    private int seatsInRow;

    public LevelInformation(int levelId, String levelName, int price, int rows, int seatsInRow){

        this.levelId = levelId;
        this.levelName = levelName;
        this.price = price;
        this.rows = rows;
        this.seatsInRow = seatsInRow;
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

    public int getprice() {
        return price;
    }


}
