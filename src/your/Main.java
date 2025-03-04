package your;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        try {
            //Loads the XML file
            Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));


            Scene scene = new Scene(root);

            //set the height and width of the scene

            String css = this.getClass().getResource("application.css").toExternalForm();
            scene.getStylesheets().add(css);

            VBox vbox = new VBox();

            Rectangle rectangle = new Rectangle(10,10,Color.BLUE);

            vbox.getChildren().add(rectangle);





            stage.setScene(scene);



            stage.show();



        }catch(Exception e){
            e.printStackTrace();
        }





    }

    public static void main(String[] args) {
        launch(args);
    }
}
