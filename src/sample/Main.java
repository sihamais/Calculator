package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//import javafx.scene.layout.StackPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.security.spec.ECField;
import java.util.EventListener;
import java.util.List;

import static javafx.application.Platform.exit;

public class Main extends Application {

    //attributs
    private Button bouton_un = new Button("1");
    private Button bouton_deux = new Button("2");
    private Button bouton_trois = new Button("3");
    private Button bouton_quatre = new Button("4");
    private Button bouton_cing = new Button("5");
    private Button bouton_six = new Button("6");
    private Button bouton_sept = new Button("7");
    private Button bouton_huit = new Button("8");
    private Button bouton_neuf = new Button("9");
    private Button bouton_zero = new Button("0");
    private Button bouton_div = new Button("/");
    private Button bouton_pourc = new Button("%");
    private Button bouton_mult = new Button("x");
    private Button bouton_addi = new Button("+");
    private Button bouton_soustr = new Button("-");
    private Button bouton_carree = new Button("X^2");
    private Button bouton_racine_carree = new Button("V2");
    private Button bouton_egal = new Button("=");
    private Button bouton_plusMoins = new Button("+/-");
    private Button bouton_virgule = new Button(",");
    private Button bouton_supp_car = new Button("<-");
    private Button bouton_ce = new Button("CE"); // effacer le tout (historique compris)
    private Button bouton_c = new Button("C"); //effacer le champ
    private Button bouton_quitter = new Button("Q");


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Calculatrice");
        primaryStage.setScene(new Scene(root, 500, 375));

        //root1.getChildren().add(label);
        Label zone_resultat = new Label();
        VBox root_chiffreV1 = new VBox(2);
        VBox root_chiffreV2 = new VBox(2);
        VBox root_chiffreV3 = new VBox(2);
        VBox root_chiffreV4 = new VBox(2);
        VBox root_chiffreV5 = new VBox(2);
        VBox root_chiffreV6 = new VBox(2);

        GridPane grid_bouton = new GridPane();

        bouton_un.setMinSize(40,40);
        bouton_deux.setMinSize(40,40);
        bouton_trois.setMinSize(40,40);
        bouton_quatre.setMinSize(40,40);
        bouton_cing.setMinSize(40,40);
        bouton_six.setMinSize(40,40);
        bouton_sept.setMinSize(40,40);
        bouton_huit.setMinSize(40,40);
        bouton_neuf.setMinSize(40,40);
        bouton_zero.setMinSize(40,40);
        bouton_div.setMinSize(40,40);
        bouton_mult.setMinSize(40,40);
        bouton_soustr.setMinSize(40,40);
        bouton_addi.setMinSize(40,40);
        bouton_egal.setMinSize(40,40);
        bouton_racine_carree.setMinSize(40,40);
        bouton_carree.setMinSize(40,40);
        bouton_ce.setMinSize(40,40);
        bouton_c.setMinSize(40,40);
        bouton_supp_car.setMinSize(40,40);
        bouton_virgule.setMinSize(40,40);
        bouton_quitter.setMinSize(40,40);
        bouton_plusMoins.setMinSize(40,40);
        bouton_pourc.setMinSize(40,40);

        root_chiffreV1.getChildren().addAll(bouton_sept, bouton_quatre, bouton_un, bouton_plusMoins);
        root_chiffreV2.getChildren().addAll(bouton_huit, bouton_cing, bouton_deux, bouton_zero);
        root_chiffreV3.getChildren().addAll(bouton_neuf, bouton_six, bouton_trois, bouton_virgule);
        root_chiffreV4.getChildren().addAll(bouton_ce, bouton_c, bouton_supp_car, bouton_egal);
        root_chiffreV5.getChildren().addAll(bouton_div, bouton_mult, bouton_soustr, bouton_addi);
        root_chiffreV6.getChildren().addAll(bouton_pourc, bouton_racine_carree, bouton_carree, bouton_quitter);

        grid_bouton.addColumn(1, root_chiffreV1);
        grid_bouton.addColumn(2, root_chiffreV2);
        grid_bouton.addColumn(3, root_chiffreV3);
        grid_bouton.addColumn(4, root_chiffreV4);
        grid_bouton.addColumn(5, root_chiffreV5);
        grid_bouton.addColumn(6, root_chiffreV6);

        AnchorPane zone_affichage = new AnchorPane();
        //StackPane root1 = new StackPane();
        Label label = new Label("Calculatrice Andi & Siham");





        /*
            crétaion des fonctions pour les boutons
        */
        //------bouton_quiter-------
        bouton_quitter.setOnAction((e) -> {
            exit();
        });




        Scene scene = new Scene(grid_bouton, 300, 275);

        String text = "";
        bouton_un.setOnAction((e) -> {
           zone_resultat.setText( text + "1" );
       });


        primaryStage.setScene(scene);


        primaryStage.show();


        Stage otherStage = new Stage();
        otherStage.setTitle("Historique");
        otherStage.setWidth(primaryStage.getWidth());
        otherStage.setHeight(primaryStage.getHeight());
        otherStage.setResizable(false);
        //otherStage.centerOnScreen();
        otherStage.setX(200);
        otherStage.setY(350);
        /*
            ceci est à ne pas faire !
            Thread.sleep(5000);
            otherStage.show();
        */

        /*
            new Thread(() -> {

         */

        new Thread( () -> {
            try {
                Thread.sleep(5000);
                Platform.runLater(() -> {
                        System.out.println(Thread.currentThread().getName());
                        otherStage.show();
                    });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        /*
            new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            System.out.println(Thread.currentThread().getName());
                            otherStage.show();
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        */



    }
    /*
        Permet d'implémenter le code d'un certain élément node de la scene
    */
     private class ButtonHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent actionEvent) {

        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
