import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstFX extends Application {

  public void start(Stage stage){
    Text hello = new Text(50, 50, "This is a snowman.");
    Circle circle1 = new Circle(250, 50, 20);
    Circle circle2 = new Circle(250, 90, 30);
    Circle circle3 = new Circle(250, 150, 40);
    Ellipse ellipse1 = new Ellipse(30,180,70,20);
    Ellipse ellipse2 = new Ellipse(170,180,70,20);
    Ellipse ellipse3 = new Ellipse(310,180,70,20);
    Ellipse ellipse4 = new Ellipse(450,180,70,20);
    Rectangle rectangle = new Rectangle(0,185,500,20);


    circle1.setStroke(Color.BLUE);
    circle1.setFill(Color.BLUE);
    circle2.setStroke(Color.BLUE);
    circle2.setFill(Color.BLUE);
    circle3.setStroke(Color.BLUE);
    circle3.setFill(Color.BLUE);
    ellipse1.setStroke(Color.GREEN);
    ellipse1.setFill(Color.GREEN);
    ellipse2.setStroke(Color.DARKGREEN);
    ellipse2.setFill(Color.DARKGREEN);
    ellipse3.setStroke(Color.GREEN);
    ellipse3.setFill(Color.GREEN);
    ellipse4.setStroke(Color.DARKGREEN);
    ellipse4.setFill(Color.DARKGREEN);
    rectangle.setStroke(Color.GREEN);
    rectangle.setFill(Color.GREEN);

    Group root = new Group(hello, circle1, circle2, circle3, ellipse1, ellipse2,
    ellipse3, ellipse4, rectangle);
    Scene scene = new Scene(root, 500, 195, Color.LIGHTBLUE);

    stage.setTitle("FirstFX");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
