package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application implements EventHandler<ActionEvent> {

    Button button;
    static Rectangle rect1 = new Rectangle();
    static Rectangle rect2 = new Rectangle();
    static Rectangle rect3 = new Rectangle();
    static Circle circ1 = new Circle();
    static Circle circ2 = new Circle();
    static Circle circ3 = new Circle();

   static Building  building = new Building();


    static int i;
    public static void SetI(int ii)
    {
        i  = ii;
    }

    public static void main(String[] args) {

        building.Work();
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Timeline timeline = new Timeline();
        Group root = new Group();
        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        root.getChildren().add(FXMLLoader.load(getClass().getResource("sample.fxml")));

        circ1.setCenterX(133);
        circ1.setCenterY(155);
        circ1.setRadius(5);
        circ1.setFill(Color.BLACK);

        circ2.setCenterX(248);
        circ2.setCenterY(155);
        circ2.setRadius(5);
        circ2.setFill(Color.BLACK);

        circ3.setCenterX(360);
        circ3.setCenterY(155);
        circ3.setRadius(5);
        circ3.setFill(Color.BLACK);


        //Первый лифт
        rect1.setX(118);
        rect1.setY(475);
        //rect.setY(Building.queue.get(0).curFloor);
        rect1.setWidth(30);
        rect1.setHeight(40);
        rect1.setFill(Color.BLACK);

        //Второй лифт
        rect2.setX(233);
        rect2.setY(475);
        rect2.setWidth(30);
        rect2.setHeight(40);
        rect2.setFill(Color.BLACK);

        //Третий лифт
        rect3.setX(345);
        rect3.setY(475);
        rect3.setWidth(30);
        rect3.setHeight(40);
        rect3.setFill(Color.BLACK);

        root.getChildren().add(rect1);
        root.getChildren().add(rect2);
        root.getChildren().add(rect3);

        root.getChildren().add(circ1);
        root.getChildren().add(circ2);
        root.getChildren().add(circ3);

        //KeyFrame end=new KeyFrame(Duration.millis(2000),new KeyValue(rect.yProperty(),rect.getY()-(abs(Building.queue.get(0).desiredFloor-Building.queue.get(0).curFloor)*100)));

        KeyValue xVal=new KeyValue(rect1.yProperty(),rect1.getY());
        KeyFrame end1=new KeyFrame(Duration.millis(2000),xVal);

        KeyValue xVal1=new KeyValue(rect2.yProperty(),rect2.getY());
        KeyFrame end2=new KeyFrame(Duration.millis(2000),xVal1);

        KeyValue xVal2=new KeyValue(rect3.yProperty(),rect3.getY());
        KeyFrame end3=new KeyFrame(Duration.millis(2000),xVal2);


        timeline.getKeyFrames().addAll(end1);
        timeline.getKeyFrames().addAll(end2);
        timeline.getKeyFrames().addAll(end3);

        timeline.play();

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 600));





        primaryStage.show();

    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==button)
        {
            System.out.println("asdf");
            //rect.setFill(Color.BLACK);
        }
    }
}
