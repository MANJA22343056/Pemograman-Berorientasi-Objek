
package jobsheet9;

/*
Programmer  :Manja Fani Oktavia
Nim         :22343056
 */
public class ElevatorTest {
    public static void main(String args[]){
        Elevator myElevator = new Elevator();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.goUp(); 
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown(); 
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.setFloor(myElevator.TOP_FLOOR);
        myElevator.openDoor();
    }
    
}
