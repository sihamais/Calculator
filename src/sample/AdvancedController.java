package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import com.jfoenix.controls.JFXButton;
import javafx.stage.Stage;

import java.io.Console;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdvancedController extends BaseController {

    @FXML
    private JFXButton bouton_xp2;

    @FXML
    private JFXButton bouton_xp3;

    @FXML
    private JFXButton bouton_xpy;

    @FXML
    private JFXButton bouton_10px;

    @FXML
    private JFXButton bouton_cos;

    @FXML
    private JFXButton bouton_sin;

    @FXML
    private JFXButton bouton_tan;

    @FXML
    private JFXButton bouton_pi;

    @FXML
    private JFXButton bouton_factoriel;

    @FXML
    private JFXButton bouton_racine2;

    @FXML
    private JFXButton bouton_1surx;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    @FXML
    public void bouton_xp2_click(ActionEvent event) {

        if (event.getSource() == bouton_xp2) {
            if (champ_view.getText() == "")
                champ_view.setText("0");
            else {
                Double valeur_num_float = 0.00;
                Integer valeur_num_int = 0;
                String valeur_text = champ_view.getText();
                try {
                    valeur_num_float = Double.parseDouble(valeur_text);
                    valeur_num_int = Integer.parseInt(valeur_text);
                } catch (Exception e) {
                    e.getMessage();
                }
                valeur_num_float = Math.pow(valeur_num_float, 2);
                valeur_num_int = ((int) Math.pow(valeur_num_int, 2));

                if (valeur_num_float == valeur_num_int.doubleValue()) {
                    champ_view.setText(String.valueOf(valeur_num_int));
                } else {
                    champ_view.setText(String.valueOf(valeur_num_float));
                }
            }
        }
    }

    @FXML
    public void bouton_xp3_click(ActionEvent event) {

        if (event.getSource() == bouton_xp3) {
            if (champ_view.getText() == "")
                champ_view.setText("0,00");
            else {
                Double valeur_num_float = 0.00;
                Integer valeur_num_int = 0;
                String valeur_text = champ_view.getText();
                try {
                    valeur_num_float = Double.parseDouble(valeur_text);
                    valeur_num_int = Integer.parseInt(valeur_text);
                } catch (Exception e) {
                    e.getMessage();
                }
                valeur_num_float = Math.pow(valeur_num_float, 3);
                valeur_num_int = ((int) Math.pow(valeur_num_int, 3));

                if (valeur_num_float == valeur_num_int.doubleValue()) {
                    champ_view.setText(String.valueOf(valeur_num_int));
                } else {
                    champ_view.setText(String.valueOf(valeur_num_float));
                }
            }
        }
    }

    @FXML
    public void bouton_10px_click(ActionEvent event) {

        if (event.getSource() == bouton_10px) {
            if (champ_view.getText() == "")
                champ_view.setText("0,00");
            else {
                Double valeur_num_float = 0.00;
                String valeur_text = champ_view.getText();
                try {
                    valeur_num_float = Double.parseDouble(valeur_text);
                } catch (Exception e) {
                    e.getMessage();
                }
                valeur_num_float = Math.pow(10, valeur_num_float);
                champ_view.setText(String.valueOf(valeur_num_float));
            }
        }
    }

    @FXML
    public void bouton_xpy_click(ActionEvent event) {
        nbre_float1 = Double.valueOf(champ_view.getText());
        nbre_int1 = Integer.valueOf(champ_view.getText());
        operateur = "xpy";
        champ_view.setText("");
    }

    @FXML
    public void bouton_cos_click(ActionEvent event) {

        if (event.getSource() == bouton_cos) {
            if (champ_view.getText() == "")
                champ_view.setText("0,00");
            else {
                Double valeur_num_float = 0.00;
                Integer valeur_num_int = 0;
                String valeur_text = champ_view.getText();
                try {
                    valeur_num_float = Double.parseDouble(valeur_text);
                    valeur_num_int = Integer.parseInt(valeur_text);
                } catch (Exception e) {
                    e.getMessage();
                }
                valeur_num_float = Math.cos(valeur_num_float);
                valeur_num_int = ((int) Math.cos(valeur_num_int.doubleValue()));

                if (valeur_num_float == valeur_num_int.doubleValue()) {
                    champ_view.setText(String.valueOf(valeur_num_int));
                } else {
                    champ_view.setText(String.valueOf(valeur_num_float));
                }
            }
        }
    }

    @FXML
    public void bouton_sin_click(ActionEvent event) {

        if (event.getSource() == bouton_sin) {
            if (champ_view.getText() == "")
                champ_view.setText("0,00");
            else {
                Double valeur_num_float = 0.00;
                Integer valeur_num_int = 0;
                String valeur_text = champ_view.getText();
                try {
                    valeur_num_float = Double.parseDouble(valeur_text);
                    valeur_num_int = Integer.parseInt(valeur_text);
                } catch (Exception e) {
                    e.getMessage();
                }
                valeur_num_float = Math.sin(valeur_num_float);
                valeur_num_int = ((int) Math.sin(valeur_num_int.doubleValue()));

                if (valeur_num_float == valeur_num_int.doubleValue()) {
                    champ_view.setText(String.valueOf(valeur_num_int));
                } else {
                    champ_view.setText(String.valueOf(valeur_num_float));
                }
            }
        }
    }

    @FXML
    public void bouton_tan_click(ActionEvent event) {

        if (event.getSource() == bouton_tan) {
            if (champ_view.getText() == "")
                champ_view.setText("0,00");
            else {
                Double valeur_num_float = 0.00;
                Integer valeur_num_int = 0;
                String valeur_text = champ_view.getText();
                try {
                    valeur_num_float = Double.parseDouble(valeur_text);
                    valeur_num_int = Integer.parseInt(valeur_text);
                } catch (Exception e) {
                    e.getMessage();
                }
                valeur_num_float = Math.tan(valeur_num_float);
                valeur_num_int = ((int) Math.tan(valeur_num_int.doubleValue()));

                if (valeur_num_float == valeur_num_int.doubleValue()) {
                    champ_view.setText(String.valueOf(valeur_num_int));
                } else {
                    champ_view.setText(String.valueOf(valeur_num_float));
                }
            }
        }
    }

    @FXML
    public void bouton_pi_click(ActionEvent event) {

        if (event.getSource() == bouton_pi) {
            champ_view.setPromptText("");
            if (!status_champ)
                champ_view.setText((champ_view.getText() + "3.14159265359"));
            else
                champ_view.setText("3.14159265359");
        }
    }

    @FXML
    public void bouton_racine2_click(ActionEvent event) {

        if (event.getSource() == bouton_racine2) {
            if (champ_view.getText() == "")
                champ_view.setText("0,00");
            else {
                Double valeur_num_float = 0.00;
                Integer valeur_num_int = 0;
                String valeur_text = champ_view.getText();
                try {
                    valeur_num_float = Double.parseDouble(valeur_text);
                    valeur_num_int = Integer.parseInt(valeur_text);
                } catch (Exception e) {
                    e.getMessage();
                }
                valeur_num_float = Math.sqrt(valeur_num_float);
                valeur_num_int = ((int) Math.sqrt(valeur_num_int.doubleValue()));

                if (valeur_num_float == valeur_num_int.doubleValue()) {
                    champ_view.setText(String.valueOf(valeur_num_int));
                } else {
                    champ_view.setText(String.valueOf(valeur_num_float));
                }
            }
        }
    }

    @FXML
    public void bouton_1surx_click(ActionEvent event) {

        if (event.getSource() == bouton_1surx) {
            if (champ_view.getText() == "")
                champ_view.setText("0,00");
            else {
                Double valeur_num_float = 0.00;
                Integer valeur_num_int = 0;
                String valeur_text = champ_view.getText();
                try {
                    valeur_num_float = Double.parseDouble(valeur_text);
                    valeur_num_int = Integer.parseInt(valeur_text);
                } catch (Exception e) {
                    e.getMessage();
                }
                valeur_num_float = 1 / valeur_num_float;
                valeur_num_int = ((int) (1 / valeur_num_int.doubleValue()));

                if (valeur_num_float == valeur_num_int.doubleValue()) {
                    champ_view.setText(String.valueOf(valeur_num_int));
                } else {
                    champ_view.setText(String.valueOf(valeur_num_float));
                }
            }

        }
    }

    @FXML
    public void bouton_factoriel_click(ActionEvent event) {

        if (event.getSource() == bouton_factoriel) {
            if (champ_view.getText() == "")
                champ_view.setText("0,00");
            else {
                Double valeur_num_float = 0.00;
                Integer valeur_num_int = 0;
                String valeur_text = champ_view.getText();
                try {
                    valeur_num_float = Double.parseDouble(valeur_text);
                    valeur_num_int = Integer.parseInt(valeur_text);
                } catch (Exception e) {
                    e.getMessage();
                }
                for (int i = valeur_num_float.intValue() - 1; i > 1; i--) {
                    if (valeur_num_float == valeur_num_int.doubleValue()) {
                        valeur_num_int = valeur_num_int * i;
                        champ_view.setText(String.valueOf(valeur_num_int));
                    } else {
                        valeur_num_float = valeur_num_float * i;
                        champ_view.setText(String.valueOf(valeur_num_float));
                    }

                }
            }

        }
    }

    @FXML
    public void bouton_equal_click() throws NullPointerException {
        super.bouton_equal_click();
//        nbre_float2 = Double.parseDouble(champ_view.getText().replaceAll(",","."));
//        nbre_int2 = Integer.parseInt(champ_view.getText().replaceAll(",","."));
        if (operateur == "xpy") {
            try {

                result_float = Math.pow(nbre_float1, nbre_float2);
                result_int = ((int) Math.pow(nbre_int1, nbre_int2));
                if (result_float == result_int.doubleValue()) {
//                    hist = nbre_int1.toString();
//                    hist += "xpy";
//                    hist += nbre_int2.toString();
//                    hist += "=";
//                    hist += result_int.toString();
//                    System.out.println(hist);

                    champ_view.setText(String.valueOf(result_int));
                    //historique_view.setText(hist);
                } else {

//                    hist = nbre_float1.toString();
//                    hist += "xpy";
//                    hist += nbre_float2.toString();
//                    hist += "=";
//                    hist += result_float.toString();
                    champ_view.setText(String.valueOf(result_float));
                    //historique_view.setText(hist);

                }
                nbre_int1 = 0;
                nbre_int2 = 0;
                nbre_float1 = 0.0;
                nbre_float2 = 0.0;
                status_champ = true;
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }

    @FXML
    public void changeToBase(ActionEvent e) throws IOException {
        Parent mode_base = FXMLLoader.load(getClass().getResource("CalculatriceBase.fxml"));
        Stage stage_base = new Stage();
        stage_base.setTitle("Calculatrice (Mode Base)");
        stage_base.setResizable(false);
        stage_base.centerOnScreen();
        stage_base.setScene(new Scene(mode_base));
        //Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
        //window.show();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            stage_base.show();
                        }
                    });

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }


    @FXML
    public void changeToProgrammer(ActionEvent e) throws IOException {
        Parent mode_programmer = FXMLLoader.load(getClass().getResource("Programmeur.fxml"));
        Stage stage_programmer = new Stage();
        stage_programmer.setTitle("Calculatrice (Mode Programmeur)");
        stage_programmer.setResizable(false);
        stage_programmer.centerOnScreen();
        stage_programmer.setScene(new Scene(mode_programmer));
        //Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
        //window.show();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            stage_programmer.show();
                        }
                    });

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }


    @FXML
    public void quitter(ActionEvent e) {
        Platform.exit();
    }

}