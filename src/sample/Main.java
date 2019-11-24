package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
           Parent root = FXMLLoader.load(getClass().getResource("Calculatrice.fxml"));
           primaryStage.setTitle("Calculatrice");
           primaryStage.setScene(new Scene(root));
           primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
