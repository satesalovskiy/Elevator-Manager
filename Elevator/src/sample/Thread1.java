package sample;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Thread1 extends Thread
{
    int i =1;
    public Semaphore sem = new Semaphore(1);

    public synchronized void Add(int floor1, int floor2, int weight)
    {
        Call call = new Call(floor1, floor2, weight);
        Building.queue.add(call);

    }

    public void run ()
    {
        while(1==1) {
            try {
                sem.acquire();
                System.out.println("Creating a new call");
            } catch (InterruptedException ex) {
                System.out.println("Exception is handled");
            }
            sem.release();

            Random rand = new Random();
            int floor1 = rand.nextInt(Building.floorNumber) + 1;
            int floor2 = rand.nextInt(Building.floorNumber) + 1;
            int weight = rand.nextInt(5) + 1;

            while (floor1==floor2)
            {
                floor1 = rand.nextInt(Building.floorNumber) + 1;
                floor2 = rand.nextInt(Building.floorNumber) + 1;
                weight = rand.nextInt(5) + 1;
            }
            if(Building.queue.size()<4) {
                Add(floor1, floor2, weight);
            }



            try {
                sem.acquire();
                for (int i = 0; i<Building.queue.size();i++)
                {
                    System.out.println(" From: "+Building.queue.get(i).currentFloor +
                            " To: "+Building.queue.get(i).desiredFloor + " ");
                }
                sem.release();
            } catch (InterruptedException ex) {
                System.out.println("Exception is handled");
            }

            try{
                sleep(5000);

            }
            catch(InterruptedException ex)
            {
                System.out.println("Interapted exc");
            }
        }

    }
}