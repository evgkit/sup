package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Group root = new Group();
        primaryStage.setTitle("Sup");
        primaryStage.setScene(new Scene(root, 300, 275));

        Text txt = new Text("Sup?");
        txt.setY(50);
        txt.setX(10);

        root.getChildren().add(txt);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
