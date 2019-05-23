package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import static javafx.print.PrintColor.COLOR;

public class Thread2 extends Thread {
    private int sleepN=5000;
    private int min = 21;

    public synchronized void Remove()
    {
        Building.queue.remove(0);
    }

    public synchronized void GoTo(int desiredFloor, int i)
    {
        int k = Building.elevNumber.get(i).currentFloor;
        Building.elevNumber.get(i).setCurrentFloor(desiredFloor);

        if(i==0)
        {
            //Main.rect1.setFill(Color.RED);
            Main.circ1.setFill(Color.RED);
        }
        else if(i==1)
        {
           // Main.rect2.setFill(Color.RED);
            Main.circ2.setFill(Color.RED);
        }
        else if(i==2)
        {
            //Main.rect3.setFill(Color.RED);
            Main.circ3.setFill(Color.RED);
        }


        if(i==0)
        {
            if (desiredFloor==1) {
                //Main.rect1.setY(100);
                Main.rect1.setX(118);
                //Main.rect.setY(808);
                Main.rect1.setFill(Color.YELLOW);
                //System.out.println("======== " + (n));
                KeyValue xVal1 = new KeyValue(Main.rect1.yProperty(), 475);

                KeyFrame end11 = new KeyFrame(Duration.millis(2000), xVal1);
                Timeline timeline = new Timeline();
                timeline.getKeyFrames().addAll(end11);
                timeline.play();
                Main.rect1.setFill(Color.YELLOW);
                try {sleep(1000);}
                catch (InterruptedException e)
                {

                }
                //Main.rect1.setFill(Color.RED);
            }
            else if (desiredFloor==2) {

                //Main.rect1.setY(100);
                Main.rect1.setX(118);
                //Main.rect.setY(808);
                Main.rect1.setFill(Color.YELLOW);
                //System.out.println("======== " + (n));
                KeyValue xVal1 = new KeyValue(Main.rect1.yProperty(), 375);

                KeyFrame end11 = new KeyFrame(Duration.millis(2000), xVal1);
                Timeline timeline = new Timeline();
                timeline.getKeyFrames().addAll(end11);
                timeline.play();
               // Main.rect1.setFill(Color.RED);
                try {sleep(1000);}
                catch (InterruptedException e)
                {

                }
               // Main.rect1.setFill(Color.RED);
            }
            else if (desiredFloor==3) {
                //Main.rect1.setY(100);
                Main.rect1.setX(118);
                //Main.rect.setY(808);
                Main.rect1.setFill(Color.YELLOW);
                //System.out.println("======== " + (n));
                KeyValue xVal1 = new KeyValue(Main.rect1.yProperty(), 275);

                KeyFrame end11 = new KeyFrame(Duration.millis(2000), xVal1);
                Timeline timeline = new Timeline();
                timeline.getKeyFrames().addAll(end11);
                timeline.play();
                //Main.rect1.setFill(Color.RED);
                try {sleep(1000);}
                catch (InterruptedException e)
                {

                }
               // Main.rect1.setFill(Color.RED);
            }
            else if (desiredFloor==4) {
                //Main.rect1.setY(100);
                Main.rect1.setX(118);
                //Main.rect.setY(808);
                Main.rect1.setFill(Color.YELLOW);
                //System.out.println("======== " + (n));
                KeyValue xVal1 = new KeyValue(Main.rect1.yProperty(), 175);

                KeyFrame end11 = new KeyFrame(Duration.millis(2000), xVal1);
                Timeline timeline = new Timeline();
                timeline.getKeyFrames().addAll(end11);
                timeline.play();
               // Main.rect1.setFill(Color.RED);
                try {sleep(1000);}
                catch (InterruptedException e) {

                }
                //Main.rect1.setFill(Color.RED);
            }

        }
        else if(i==1)
        {
            if (desiredFloor==1) {

                //Main.rect1.setY(100);
                Main.rect2.setX(233);
                //Main.rect.setY(808);
                Main.rect2.setFill(Color.YELLOW);
                //System.out.println("======== " + (n));
                KeyValue xVal1 = new KeyValue(Main.rect2.yProperty(), 475);

                KeyFrame end11 = new KeyFrame(Duration.millis(2000), xVal1);
                Timeline timeline = new Timeline();
                timeline.getKeyFrames().addAll(end11);
                timeline.play();
                try {sleep(1000);}
                catch (InterruptedException e)
                {

                }
                //Main.rect1.setFill(Color.RED);
            }
            else if (desiredFloor==2) {

                //Main.rect1.setY(100);
                Main.rect2.setX(233);
                //Main.rect.setY(808);
                Main.rect2.setFill(Color.YELLOW);
                //System.out.println("======== " + (n));
                KeyValue xVal1 = new KeyValue(Main.rect2.yProperty(), 375);

                KeyFrame end11 = new KeyFrame(Duration.millis(2000), xVal1);
                Timeline timeline = new Timeline();
                timeline.getKeyFrames().addAll(end11);
                timeline.play();
                try {sleep(1000);}
                catch (InterruptedException e)
                {

                }
                //Main.rect1.setFill(Color.RED);
            }
            else if (desiredFloor==3) {

                //Main.rect1.setY(100);
                Main.rect2.setX(233);
                //Main.rect.setY(808);
                Main.rect2.setFill(Color.YELLOW);
                //System.out.println("======== " + (n));
                KeyValue xVal1 = new KeyValue(Main.rect2.yProperty(), 275);

                KeyFrame end11 = new KeyFrame(Duration.millis(2000), xVal1);
                Timeline timeline = new Timeline();
                timeline.getKeyFrames().addAll(end11);
                timeline.play();
                try {sleep(1000);}
                catch (InterruptedException e)
                {

                }
                //Main.rect1.setFill(Color.RED);
            }
            else if (desiredFloor==4) {

                //Main.rect1.setY(100);
                Main.rect2.setX(233);
                //Main.rect.setY(808);
                Main.rect2.setFill(Color.YELLOW);
                //System.out.println("======== " + (n));
                KeyValue xVal1 = new KeyValue(Main.rect2.yProperty(), 175);

                KeyFrame end11 = new KeyFrame(Duration.millis(2000), xVal1);
                Timeline timeline = new Timeline();
                timeline.getKeyFrames().addAll(end11);
                timeline.play();
                try {sleep(1000);}
                catch (InterruptedException e) {

                }
                //Main.rect1.setFill(Color.RED);
            }

        }
        else if(i==2)
        {
            if (desiredFloor==1) {

                //Main.rect1.setY(100);
                Main.rect3.setX(345);
                //Main.rect.setY(808);
                Main.rect3.setFill(Color.YELLOW);
                //System.out.println("======== " + (n));

                KeyValue xVal1 = new KeyValue(Main.rect3.yProperty(), 475);

                KeyFrame end11 = new KeyFrame(Duration.millis(2000), xVal1);
                Timeline timeline = new Timeline();
                timeline.getKeyFrames().addAll(end11);
                timeline.play();
                try {sleep(1000);}
                catch (InterruptedException e)
                {

                }
                //Main.rect1.setFill(Color.RED);
            }
            else if (desiredFloor==2) {

                //Main.rect1.setY(100);
                Main.rect3.setX(345);
                //Main.rect.setY(808);
                Main.rect3.setFill(Color.YELLOW);
                //System.out.println("======== " + (n));
                KeyValue xVal1 = new KeyValue(Main.rect3.yProperty(), 375);

                KeyFrame end11 = new KeyFrame(Duration.millis(2000), xVal1);
                Timeline timeline = new Timeline();
                timeline.getKeyFrames().addAll(end11);
                timeline.play();
                try {sleep(1000);}
                catch (InterruptedException e)
                {

                }
                //Main.rect1.setFill(Color.RED);
            }
            else if (desiredFloor==3) {

                //Main.rect1.setY(100);
                Main.rect3.setX(345);
                //Main.rect.setY(808);
                Main.rect3.setFill(Color.YELLOW);
                //System.out.println("======== " + (n));
                KeyValue xVal1 = new KeyValue(Main.rect3.yProperty(), 275);

                KeyFrame end11 = new KeyFrame(Duration.millis(2000), xVal1);
                Timeline timeline = new Timeline();
                timeline.getKeyFrames().addAll(end11);
                timeline.play();
                try {sleep(1000);}
                catch (InterruptedException e)
                {

                }
                //Main.rect1.setFill(Color.RED);
            }
            else if (desiredFloor==4) {

                //Main.rect1.setY(100);
                Main.rect3.setX(345);
                //Main.rect.setY(808);
                Main.rect3.setFill(Color.YELLOW);
                //KeyValue xVal1 = new KeyValue(Main.rect.yProperty(), Main.rect.getY() - (abs(Building.queue.get(0).desiredFloor - Building.queue.get(0).curFloor) * 100));
                KeyValue xVal1 = new KeyValue(Main.rect3.yProperty(), 175);

                KeyFrame end11 = new KeyFrame(Duration.millis(2000), xVal1);
                Timeline timeline = new Timeline();
                timeline.getKeyFrames().addAll(end11);
                timeline.play();
                try {sleep(1000);}
                catch (InterruptedException e) {

                }
                //Main.rect1.setFill(Color.RED);
            }

        }



        if(i==0)
        {
            //Main.rect1.setFill(Color.RED);
            Main.circ1.setFill(Color.BLACK);
        }
        else if(i==1)
        {
            // Main.rect2.setFill(Color.RED);
            Main.circ2.setFill(Color.BLACK);
        }
        else if(i==2)
        {
            //Main.rect3.setFill(Color.RED);
            Main.circ3.setFill(Color.BLACK);
        }

    }

    public void run ()
    {
        while(1==1)
        {
            if (!Building.queue.isEmpty())
            {

                for(int i =0; i<Building.elevatorsNumber;i++)
                    //for(int i =0; i<1;i++)
                {
                    if ((Building.elevNumber.get(i).status == 0)&&(Building.queue.size()>=1))
                    {
                        Building.elevNumber.get(i).setStatus(1);
                        System.out.println("Waiting");

                        int currentFloor = Building.queue.get(0).currentFloor;
                        int desiredFloor = Building.queue.get(0).desiredFloor;
                        int weight = Building.queue.get(0).weight;

                     /*   try {Thread.sleep(1000);}
                        catch (InterruptedException e)
                        {

                        } */

                        this.Remove();

                        if (Building.elevNumber.get(i).getCurrentFloor()==currentFloor)
                        {
                            GoTo(desiredFloor, i);

                            //Move picture here

                            System.out.println("Passenger is delivered by elevator: " + i);

                            Building.elevNumber.get(i).setStatus(0);

                            try {sleep(1000);}
                            catch (InterruptedException e)
                            {

                            }

                           // Building.elevNumber.get(i).setStatus(0);
                        }
                        else
                        {
                            GoTo(currentFloor,i);

                            //And here

                            System.out.println("Elevator: "+i+" is arrived");

                            try{sleep(1000);}
                            catch (InterruptedException ex)
                            {

                            }

                            GoTo(desiredFloor,i);

                            System.out.println("Passenger is delivered by elevator: " + i);

                            Building.elevNumber.get(i).setStatus(0);

                            try {sleep(1000);}
                            catch (InterruptedException e)
                            {

                            }
                            //Building.elevNumber.get(i).setStatus(0);

                        }



                       // Building.elevNumber.get(i).setStatus(0);
                    }

                    Building.elevNumber.get(i).setStatus(0);
                }




                Main.SetI(10);







            }
            try
            {
                sleep(sleepN);
            }
            catch(InterruptedException ex)
            {
                System.out.println("Interapted exc");
            }
        }
    }
}
