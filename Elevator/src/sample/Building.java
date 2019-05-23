package sample;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class Building {

    public static ArrayList <Call> queue = new ArrayList();
    public static ArrayList <Elevator> elevNumber = new ArrayList<>();
    public static int floorNumber;

    public static int getElevatorsNumber() {
        return elevatorsNumber;
    }

    public static int elevatorsNumber;
    Thread1 thread1 = new Thread1();
    Thread2 thread2 = new Thread2();
    Building()
    {
        floorNumber = 4;
        elevatorsNumber =3;
        Random rand = new Random();
        for (int i=0; i< elevatorsNumber; i++)
        {
            int floor1 = rand.nextInt(floorNumber)+1;
            Elevator elev = new Elevator(floor1);
            elevNumber.add(elev);
        }
    }

    static synchronized void Add(Call call)
    {
        Building.queue.add(call);
    }

    void Work()
    {
        thread1.start();
        thread2.start();
    }



}
