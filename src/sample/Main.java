package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Group root = new Group();
        primaryStage.setTitle("Sup");
        primaryStage.setScene(new Scene(root, 300, 275));

        Text txt = new Text("Sup?");

        TextField inputField = new TextField();

        Button btn  = new Button();
        btn.setText("Say sup!");
        btn.setOnAction(evt -> System.out.printf("Sup %s?%n", inputField.getText()));

        VBox vBox = new VBox();
        vBox.getChildren().addAll(txt, inputField, btn);

        root.getChildren().add(vBox);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
