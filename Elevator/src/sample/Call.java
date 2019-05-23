package sample;

public class Call {
    int currentFloor;
    int desiredFloor;
    int weight;

    Call (int currentFloor, int desiredFloor, int weight)
    {
        this.currentFloor = currentFloor;
        this.desiredFloor = desiredFloor;
        this.weight = weight;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getDesiredFloor() {
        return desiredFloor;
    }




}
