package data.models;

public enum Offense {
    ONE_WAY ("One way", 35000),
    DRUNK_DRIVING("Drunk Driving", 10000),
    OVER_SPEEDING("Over speeding", 5000);

    private final String name;
    private final int amount;
    Offense(String name,int amount ){
        this.amount = amount;
        this.name = name;
    }
}