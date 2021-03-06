package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import com.jfoenix.controls.JFXButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class BaseController implements Initializable {

    @FXML
    protected JFXButton bouton_percent;

    @FXML
    protected JFXButton bouton_suppr;

    @FXML
    protected JFXButton bouton_nine;

    @FXML
    protected JFXButton bouton_four;

    @FXML
    protected JFXButton bouton_one;

    @FXML
    protected JFXButton bouton_zero;

    @FXML
    protected JFXButton bouton_eight;

    @FXML
    protected JFXButton bouton_five;

    @FXML
    protected JFXButton bouton_equal;

    @FXML
    protected JFXButton bouton_virgule;

    @FXML
    protected JFXButton bouton_add;

    @FXML
    protected JFXButton bouton_three;

    @FXML
    protected JFXButton bouton_minus;

    @FXML
    protected JFXButton bouton_six;

    @FXML
    protected JFXButton bouton_mult;

    @FXML
    protected JFXButton bouton_seven;

    @FXML
    protected JFXButton bouton_div;

    @FXML
    protected JFXButton clear;

    @FXML
    protected JFXButton bouton_two;

    @FXML
    protected JFXButton bouton_plusMoins;

    @FXML
    protected TextField champ_view;

    @FXML
    protected TextField historique_view;

    @FXML
    protected MenuButton bouton_menu;

    @FXML
    public MenuItem bouton_modeScientifique;

    @FXML
    public MenuItem bouton_quitter;


    protected Double result_float;
    protected Integer result_int;
    protected Double nbre_float1;
    protected Double nbre_float2;
    protected Integer nbre_int1;
    protected Integer nbre_int2;
    protected String operateur;
    protected String hist;
    protected Boolean status_champ = false;


    @FXML
    public void bouton_scientifique_click(ActionEvent event) {
        if (event.getSource() == bouton_modeScientifique) {

        }
    }


        @FXML
    public void bouton_one_click(ActionEvent event) {

        if (event.getSource() == bouton_one) {
            champ_view.setPromptText("");
            if(!status_champ)
                champ_view.setText((champ_view.getText() + "1"));
            else
            {
                champ_view.setText("1");
                status_champ = false;
            }
        }
    }





    @FXML
    void disbleButton(ActionEvent event)
    {
        bouton_one.setDisable(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //bouton_one.setDisable(true);
        historique_view.setPromptText("");
    }


    @FXML
    public void bouton_two_click(ActionEvent event) {

        if (event.getSource() == bouton_two) {
            champ_view.setPromptText("");
            if(!status_champ)
                champ_view.setText((champ_view.getText() + "2"));
            else
            {
                champ_view.setText("2");
                status_champ = false;
            }
        }
    }

    @FXML
    public void bouton_three_click(ActionEvent event) {

        if (event.getSource() == bouton_three) {
            champ_view.setPromptText("");
            if(!status_champ)
                champ_view.setText((champ_view.getText() + "3"));
            else
            {
                champ_view.setText("3");
                status_champ = false;
            }
        }
    }

    @FXML
    public void bouton_four_click(ActionEvent event) {

        if (event.getSource() == bouton_four) {
            champ_view.setPromptText("");
            if(!status_champ)
                champ_view.setText((champ_view.getText() + "4"));
            else
            {
                champ_view.setText("4");
                status_champ = false;
            }
        }
    }

    @FXML
    public void bouton_five_click(ActionEvent event) {

        if (event.getSource() == bouton_five) {
            champ_view.setPromptText("");
            if(!status_champ)
                champ_view.setText((champ_view.getText() + "5"));
            else
            {
                champ_view.setText("5");
                status_champ = false;
            }
        }
    }

    @FXML
    public void bouton_six_click(ActionEvent event) {

        if (event.getSource() == bouton_six) {
            champ_view.setPromptText("");
            if(!status_champ)
                champ_view.setText((champ_view.getText() + "6"));
            else
            {
                champ_view.setText("6");
                status_champ = false;
            }
        }
    }

    @FXML
    public void bouton_seven_click(ActionEvent event) {

        if (event.getSource() == bouton_seven) {
            champ_view.setPromptText("");
            if(!status_champ)
                champ_view.setText((champ_view.getText() + "7"));
            else
            {
                champ_view.setText("7");
                status_champ = false;
            }
        }
    }

    @FXML
    public void bouton_height_click(ActionEvent event) {

        if (event.getSource() == bouton_eight) {
            champ_view.setPromptText("");
            if(!status_champ)
                champ_view.setText((champ_view.getText() + "8"));
            else
            {
                champ_view.setText("8");
                status_champ = false;
            }
        }
    }

    @FXML
    public void bouton_nine_click(ActionEvent event) {

        if (event.getSource() == bouton_nine) {
            champ_view.setPromptText("");
            if(!status_champ)
                champ_view.setText((champ_view.getText() + "9"));
            else
            {
                champ_view.setText("9");
                status_champ = false;
            }
        }
    }

    @FXML
    public void bouton_plusMoins_click(ActionEvent event) {

        if (event.getSource() == bouton_plusMoins) {
            champ_view.setPromptText("");
            if(!status_champ)
                champ_view.setText(("-" + champ_view.getText()));
            else
            {
                champ_view.setText("-");
                status_champ = false;
            }
        }
    }


    @FXML
    public void bouton_zero_click(ActionEvent event) {

        if (event.getSource() == bouton_zero) {
            champ_view.setPromptText("");
            if(!status_champ)
                champ_view.setText((champ_view.getText() + "0"));
            else
                champ_view.setText("0");
        }
    }

    @FXML
    public void bouton_virgule_click(ActionEvent event) {

        if (event.getSource() == bouton_virgule) {
            champ_view.setPromptText("");
            if (!status_champ) {
                if (champ_view.getText() == "")
                    champ_view.setText("0,");
                else {
                    String temp = champ_view.getText();
                    temp += ",";
                    champ_view.setText(temp);
                }
            }
            else {
                if (champ_view.getText() == "")
                    champ_view.setText("0,");
                else
                {
                    String temp = champ_view.getText();
                    temp += ",";
                    champ_view.setText(temp);
                    status_champ=false;
                }
            }
        }
    }

    @FXML
    public void bouton_mult_click() {
        try {
            nbre_float1 = Double.parseDouble(champ_view.getText().replaceAll(",","."));
            nbre_int1 = Integer.parseInt(champ_view.getText().replaceAll(",","."));
            operateur = "*";
            //historique_view.setText(champ_view.getText()+operateur);
            champ_view.setText("");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void bouton_add_click() {
       try {
           nbre_float1 = Double.parseDouble(champ_view.getText().replaceAll(",","."));
           nbre_int1 = Integer.parseInt(champ_view.getText().replaceAll(",","."));
           operateur = "+";
           champ_view.setText("");
       }catch (NumberFormatException e){
            e.getMessage();
       }

    }

    @FXML
    public void bouton_div_click() {
        try {
            nbre_float1 = Double.parseDouble(champ_view.getText().replaceAll(",","."));
            nbre_int1 = Integer.parseInt(champ_view.getText().replaceAll(",","."));
            operateur = "/";
            champ_view.setText("");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void bouton_minus_click() {
        try {
            nbre_float1 = Double.parseDouble(champ_view.getText().replaceAll(",","."));
            nbre_int1 = Integer.parseInt(champ_view.getText().replaceAll(",","."));
            operateur = "-";
            champ_view.setText("");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void bouton_clear_click(ActionEvent event) {

        if (event.getSource() == clear) {
            champ_view.setPromptText("0");
            champ_view.setText("");
            historique_view.setText("");
        }
    }

    @FXML
    public void bouton_suppr_click(ActionEvent event) {

        if (event.getSource() == bouton_suppr) {
            String temp = champ_view.getText();
            Integer taille = temp.length();
            if(taille < 1)
            {
                champ_view.setPromptText("0");
            }
            else
            {
                temp = temp.substring(0, taille-1);
                if(temp == "")
                    champ_view.setPromptText("0");
                else
                    champ_view.setText(temp);
            }
        }
    }

    @FXML
    public void bouton_percent_click(ActionEvent event) {

        if (event.getSource() == bouton_percent) {
            if(champ_view.getText() == "")
                champ_view.setText("0,00");
            else
            {
                Double valeur_num = 0.00;
                String valeur_text = champ_view.getText();
                try{
                    valeur_num = Double.parseDouble(valeur_text);
                }catch (Exception e){
                    e.getMessage();
                }
                valeur_num = valeur_num/100;
                champ_view.setText(String.valueOf(valeur_num));
            }
        }
    }

    @FXML
    public void bouton_equal_click() throws NullPointerException, NumberFormatException {
        nbre_float2 = Double.parseDouble(champ_view.getText().replaceAll(",","."));
        nbre_int2 = Integer.parseInt(champ_view.getText().replaceAll(",","."));
        switch (operateur)
        {
            case "+":
                result_float = nbre_float1 + nbre_float2;
                result_int = nbre_int1 + nbre_int2;
                if(result_float == result_int.doubleValue()) {
                    champ_view.setText(String.valueOf(result_int));
                    hist = nbre_int1.toString();
                    hist += "+";
                    hist += nbre_int2.toString();
                    hist += "=";
                    hist += result_int.toString();
                    historique_view.setText(hist);
                    nbre_int1 = 0;
                    nbre_int2 = 0;
                } else {
                    champ_view.setText(String.valueOf(result_float));
                    hist = nbre_float1.toString();
                    hist += "+";
                    hist += nbre_float2.toString();
                    hist += "=";
                    hist += result_float.toString();
                    historique_view.setText(hist);
                    nbre_float1 = 0.0;
                    nbre_float2 = 0.0;
                }

                status_champ = true;
                break;

            case "-":
                result_float = nbre_float1 - nbre_float2;
                result_int = nbre_int1 - nbre_int2;
                if(result_float == result_int.doubleValue()) {
                    champ_view.setText(String.valueOf(result_int));
                    hist = nbre_int1.toString();
                    hist += "-";
                    hist += nbre_int2.toString();
                    hist += "=";
                    hist += result_int.toString();
                    historique_view.setText(hist);
                    nbre_int1 = 0;
                    nbre_int2 = 0;
                } else {
                    champ_view.setText(String.valueOf(result_float));
                    hist = nbre_float1.toString();
                    hist += "-";
                    hist += nbre_float2.toString();
                    hist += "=";
                    hist += result_float.toString();
                    historique_view.setText(hist);
                    nbre_float1 = 0.0;
                    nbre_float2 = 0.0;
                }
                break;

            case "*":
                result_float = nbre_float1 * nbre_float2;
                result_int = nbre_int1 * nbre_int2;
                if(result_float == result_int.doubleValue()) {
                    champ_view.setText(String.valueOf(result_int));
                    hist = nbre_int1.toString();
                    hist += "*";
                    hist += nbre_int2.toString();
                    hist += "=";
                    hist += result_int.toString();
                    historique_view.setText(hist);
                    nbre_int1 = 0;
                    nbre_int2 = 0;
                } else {
                    champ_view.setText(String.valueOf(result_float));
                    hist = nbre_float1.toString();
                    hist += "*";
                    hist += nbre_float2.toString();
                    hist += "=";
                    hist += result_float.toString();
                    historique_view.setText(hist);
                    nbre_float1 = 0.0;
                    nbre_float2 = 0.0;
                }

                status_champ = true;
                break;

            case "/":
                result_float = nbre_float1 / nbre_float2;
                result_int = nbre_int1 / nbre_int2;
                if(result_float == result_int.doubleValue()) {
                    champ_view.setText(String.valueOf(result_int));
                    hist = nbre_int1.toString();
                    hist += "/";
                    hist += nbre_int2.toString();
                    hist += "=";
                    hist += result_int.toString();
                    historique_view.setText(hist);
                    nbre_int1 = 0;
                    nbre_int2 = 0;
                } else {
                    champ_view.setText(String.valueOf(result_float));
                    hist = nbre_float1.toString();
                    hist += "/";
                    hist += nbre_float2.toString();
                    hist += "=";
                    hist += result_float.toString();
                    historique_view.setText(hist);
                    nbre_float1 = 0.0;
                    nbre_float2 = 0.0;
                }
                nbre_int1 = 0;
                nbre_int2 = 0;
                nbre_float1 = 0.0;
                nbre_float2 = 0.0;
                status_champ = true;
                break;

//                default:
//                    if(nbre_int2==null || nbre_float2==null)
//                        throw new NullPointerException("Op??rateur inconnu, ou second op??rand non renseign?? !");
//                    if(nbre_int1==null || nbre_float1==null)
//                        throw new NumberFormatException("Op??rateur inconnu, ou second op??rand non renseign?? !");
        }
    }


    @FXML
    public void changeToScientifque(ActionEvent e) throws IOException {
        Parent mode_scientifique= FXMLLoader.load(getClass().getResource("Scientifique(new).fxml"));
        Stage stage_scientifique = new Stage();
        stage_scientifique.setTitle("Calculatrice (Mode Scientifique)");
        stage_scientifique.setResizable(false);
        stage_scientifique.centerOnScreen();
        stage_scientifique.setScene(new Scene(mode_scientifique));

        // stage_programmeur.show();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            stage_scientifique.showAndWait();
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();

    }

    @FXML
    public void changeToProgrammeur(ActionEvent e) throws IOException {
        Parent mode_programmeur = FXMLLoader.load(getClass().getResource("Programmeur.fxml"));
        Stage stage_programmeur = new Stage();
        stage_programmeur.setTitle("Calculatrice (Mode Programmeur)");
        stage_programmeur.setResizable(false);
        stage_programmeur.centerOnScreen();
        stage_programmeur.setScene(new Scene(mode_programmeur));

        // stage_programmeur.show();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            stage_programmeur.showAndWait();
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();

    }

    @FXML
    public void quitter(ActionEvent e)
    {
        Platform.exit();
    }
}