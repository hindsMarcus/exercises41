package Task2;

import java.util.ArrayList;

public class Main {

    static ArrayList<Room> listOfRooms = new ArrayList<>();
    public static void main(String args[]) {

        Room room1 = new Room(6,1,2,5);
        Room room2 = new Room(2,4,8,2);
        Room room3 = new Room(3,2,3,3);

        listOfRooms.add(room1);
        listOfRooms.add(room2);
        listOfRooms.add(room3);

        Building building1 = new Building(listOfRooms,5,7,true);

        System.out.println(building1.getRooms().get(0).getNumberOfWindows() + building1.getRooms().get(1).getNumberOfWindows() + building1.getRooms().get(2).getNumberOfWindows());

        int numOfFloors = building1.getNumberOfFloors();
        int amountOfRooms = listOfRooms.size();
        /*int numOfAllLamps = building1.getRooms();*/

        System.out.println(building1.getRooms().get(0).getNumberOfLamps() + building1.getRooms().get(1).getNumberOfLamps() + building1.getRooms().get(2).getNumberOfLamps());
        System.out.println(amountOfRooms);

        if(numOfFloors > amountOfRooms){
            System.out.println("This is an odd building");
        }
    }
}
