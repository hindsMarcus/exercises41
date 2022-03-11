package Task2;

public class Room {

    private int walls;
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int walls, int numOfDoors, int numOfLamps, int numOfWindows){
        this.walls = walls;
        this.numberOfDoors = numOfDoors;
        this.numberOfLamps = numOfLamps;
        this.numberOfWindows = numOfWindows;
    }

    public int getWalls(){
        return this.walls;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    public int getNumberOfLamps(){
        return numberOfLamps;
    }

    public int getNumberOfWindows(){
        return numberOfWindows;
    }
}

