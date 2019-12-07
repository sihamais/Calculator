package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
           Parent mode_base = FXMLLoader.load(getClass().getResource("CalculatriceBase.fxml"));
           primaryStage.setTitle("Calculatrice (Base)");
           primaryStage.setScene(new Scene(mode_base));
           primaryStage.setResizable(false);
           primaryStage.show();

    }



    public static void main(String[] args) {
        launch(args);
    }
}
