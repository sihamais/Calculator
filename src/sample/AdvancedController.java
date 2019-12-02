package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;

public class AdvancedController extends BaseController{

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
    private JFXButton bouton_racine3;

    @FXML
    private JFXButton bouton_1surx;

    @FXML
    private JFXButton bouton_decimal;

    @FXML
    private JFXButton bouton_bin;

    @FXML
    private JFXButton bouton_octal;

    @FXML
    private JFXButton bouton_hexa;

    @FXML
    private JFXButton bouton_and;

    @FXML
    private JFXButton bouton_or;

    @FXML
    private JFXButton bouton_nor;

    @FXML
    private JFXButton bouton_xor;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    @FXML
    public void bouton_xp2_click(ActionEvent event) {

        if (event.getSource() == bouton_xp2) {
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
                valeur_num = Math.pow(valeur_num,2);
                champ_view.setText(String.valueOf(valeur_num));
            }
        }
    }

    @FXML
    public void bouton_xp3_click(ActionEvent event) {

        if (event.getSource() == bouton_xp3) {
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
                valeur_num = Math.pow(valeur_num,3);
                champ_view.setText(String.valueOf(valeur_num));
            }
        }
    }

    @FXML
    public void bouton_10px_click(ActionEvent event) {

        if (event.getSource() == bouton_10px) {
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
                valeur_num = Math.pow(10,valeur_num);
                champ_view.setText(String.valueOf(valeur_num));
            }
        }
    }

    @FXML
    public void bouton_xpy_click(ActionEvent event) {
        nombre_temp1 = Double.valueOf(champ_view.getText());
        operateur = "xpy";
        champ_view.setText("");
    }

    @FXML
    public void bouton_cos_click(ActionEvent event) {

        if (event.getSource() == bouton_cos) {
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
                valeur_num = Math.cos(valeur_num);
                champ_view.setText(String.valueOf(valeur_num));
            }
        }
    }

    @FXML
    public void bouton_sin_click(ActionEvent event) {

        if (event.getSource() == bouton_sin) {
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
                valeur_num = Math.sin(valeur_num);
                champ_view.setText(String.valueOf(valeur_num));
            }
        }
    }

    @FXML
    public void bouton_tan_click(ActionEvent event) {

        if (event.getSource() == bouton_tan) {
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
                valeur_num = Math.tan(valeur_num);
                champ_view.setText(String.valueOf(valeur_num));
            }
        }
    }

    @FXML
    public void bouton_pi_click(ActionEvent event) {

        if (event.getSource() == bouton_pi) {
            champ_view.setPromptText("");
            if(!status_champ)
                champ_view.setText((champ_view.getText() + "3.14159265359"));
            else
                champ_view.setText("3.14159265359");
        }
    }

    @FXML
    public void bouton_racine2_click(ActionEvent event) {

        if (event.getSource() == bouton_racine2) {
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
                valeur_num = Math.sqrt(valeur_num);
                champ_view.setText(String.valueOf(valeur_num));
            }
        }
    }

    @FXML
    public void bouton_racine3_click(ActionEvent event) {

        if (event.getSource() == bouton_racine3) {
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
                valeur_num = Math.pow(valeur_num,1/3);
                champ_view.setText(String.valueOf(valeur_num));
            }
        }
    }

    @FXML
    public void bouton_1surx_click(ActionEvent event) {

        if (event.getSource() == bouton_1surx) {
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
                valeur_num = 1/valeur_num;
                champ_view.setText(String.valueOf(valeur_num));
            }
        }
    }

    @FXML
    public void bouton_factoriel_click(ActionEvent event) {

        if (event.getSource() == bouton_factoriel) {
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
                for (int i = valeur_num.intValue()-1; i>1; i--) {
                    valeur_num = valeur_num * i;
                }
                champ_view.setText(String.valueOf(valeur_num));
            }
        }
    }

//    @FXML
//    public void bouton_binaire_click(ActionEvent event) {
//
//        if (event.getSource() == bouton_bin) {
//            if(champ_view.getText() == "")
//                champ_view.setText("0,00");
//            else
//            {
//                Double valeur_num = 0.00;
//                String valeur_text = champ_view.getText();
//                try{
//                    valeur_num = Double.parseDouble(valeur_text);
//                }catch (Exception e){
//                    e.getMessage();
//                }
//                for (int i = valeur_num-1; i>1; i--) {
//                    valeur_num = valeur_num.byteValue();
//                }
//                champ_view.setText(String.valueOf(valeur_num);
//            }
//        }
//    }

    @FXML
    public void bouton_equal_click() {
        nombre_temp2 = Double.valueOf(champ_view.getText());
        switch (operateur)
        {
            case "+":
                result = nombre_temp1 + nombre_temp2;
                champ_view.setText(String.valueOf(result));
                status_champ = true;
                break;

            case "-":
                result = nombre_temp1 - nombre_temp2;
                champ_view.setText(String.valueOf(result));
                status_champ = true;
                break;

            case "*":
                result = nombre_temp1 * nombre_temp2;
                champ_view.setText(String.valueOf(result));
                status_champ = true;
                break;

            case "/":
                result = nombre_temp1 / nombre_temp2;
                champ_view.setText(String.valueOf(result));
                status_champ = true;
                break;

            case "xpy":
                result = Math.pow(nombre_temp1,nombre_temp2);
                champ_view.setText(String.valueOf(result));
                status_champ = true;
                break;
        }
    }
}