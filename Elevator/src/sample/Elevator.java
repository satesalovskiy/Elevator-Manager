package sample;

public class Elevator {
    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getStatus() {
        return status;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int currentFloor;
    public  int destinationFloor;
    public int dest;
   public int status;

    Elevator(int currentFloor)
    {
        this.currentFloor = currentFloor;
        status = 0;
    }
}
