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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdvancedController extends BaseController{

    protected boolean bin_active = false;
    protected boolean decimal_active = true;
    protected boolean octal_active = false;
    protected boolean hexa_active = false;

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
                valeur_num = Math.pow(valeur_num,(1/3));
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

    @FXML
    public void bouton_bin_click(ActionEvent event) {
        if (event.getSource() == bouton_bin) {

            if(champ_view.getText() == "")
                champ_view.setText("0,00");
            else
            {
                if(decimal_active){
                    Integer valeur_num = 0;
                    String valeur_text = champ_view.getText();
                    try{
                        valeur_num = Integer.parseInt(valeur_text);
                    }catch (Exception e){
                        e.getMessage();
                    }
                    champ_view.setText(Integer.toBinaryString(valeur_num));
                }
                else if(octal_active){
                    Integer valeur_num = 0;
                    String valeur_text = champ_view.getText();
                    try{
                        valeur_num = Integer.parseInt(valeur_text,8);
                    }catch (Exception e){
                        e.getMessage();
                    }
                    champ_view.setText(Integer.toBinaryString(valeur_num));
                }
                else if(hexa_active){
                    Integer valeur_num = 0;
                    String valeur_text = champ_view.getText();
                    try{
                        valeur_num = Integer.parseInt(valeur_text,16);
                    }catch (Exception e){
                        e.getMessage();
                    }
                    champ_view.setText(Integer.toBinaryString(valeur_num));
                }

                octal_active = false;
                decimal_active = false;
                hexa_active = false;
                bin_active = true;

                bouton_two.setDisable(true);
                bouton_three.setDisable(true);
                bouton_four.setDisable(true);
                bouton_five.setDisable(true);
                bouton_six.setDisable(true);
                bouton_seven.setDisable(true);
                bouton_eight.setDisable(true);
                bouton_nine.setDisable(true);
                bouton_xp2.setDisable(true);
                bouton_xp3.setDisable(true);
                bouton_xpy.setDisable(true);
                bouton_10px.setDisable(true);
                bouton_factoriel.setDisable(true);
                bouton_racine2.setDisable(true);
                bouton_racine3.setDisable(true);
                bouton_1surx.setDisable(true);
                bouton_sin.setDisable(true);
                bouton_cos.setDisable(true);
                bouton_tan.setDisable(true);
                bouton_pi.setDisable(true);
            }
        }
    }

    @FXML
    public void bouton_decimal_click(ActionEvent event) {

        if (event.getSource() == bouton_decimal) {
            if(champ_view.getText() == "")
                champ_view.setText("0,00");
            else
            {
                if(hexa_active){
                    Integer valeur_num = 0;
                    String valeur_text = champ_view.getText();
                    try{
                        valeur_num = Integer.parseInt(valeur_text,16);
                    }catch (Exception e){
                        e.getMessage();
                    }
                    champ_view.setText(Integer.toHexString(valeur_num));
                }
                else if(octal_active){
                    Integer valeur_num = 0;
                    String valeur_text = champ_view.getText();
                    try{
                        valeur_num = Integer.parseInt(valeur_text,8);
                    }catch (Exception e){
                        e.getMessage();
                    }
                    champ_view.setText(Integer.toHexString(valeur_num));
                }
                else if(bin_active){
                    Integer valeur_num = 0;
                    String valeur_text = champ_view.getText();
                    try{
                        valeur_num = Integer.parseInt(valeur_text,2);
                    }catch (Exception e){
                        e.getMessage();
                    }
                    champ_view.setText(Integer.toHexString(valeur_num));
                }

                octal_active = false;
                decimal_active = true;
                hexa_active = false;
                bin_active = false;

                bouton_two.setDisable(false);
                bouton_three.setDisable(false);
                bouton_four.setDisable(false);
                bouton_five.setDisable(false);
                bouton_six.setDisable(false);
                bouton_seven.setDisable(false);
                bouton_eight.setDisable(false);
                bouton_nine.setDisable(false);
                bouton_xp2.setDisable(false);
                bouton_xp3.setDisable(false);
                bouton_xpy.setDisable(false);
                bouton_10px.setDisable(false);
                bouton_factoriel.setDisable(false);
                bouton_racine2.setDisable(false);
                bouton_racine3.setDisable(false);
                bouton_1surx.setDisable(false);
                bouton_sin.setDisable(false);
                bouton_cos.setDisable(false);
                bouton_tan.setDisable(false);
                bouton_pi.setDisable(false);
            }
        }
    }

    @FXML
    public void bouton_hexa_click(ActionEvent event) {

        if (event.getSource() == bouton_hexa) {
            if(champ_view.getText() == "")
                champ_view.setText("0,00");
            else
            {
                if(decimal_active){
                    Integer valeur_num = 0;
                    String valeur_text = champ_view.getText();
                    try{
                        valeur_num = Integer.parseInt(valeur_text);
                    }catch (Exception e){
                        e.getMessage();
                    }
                    champ_view.setText(Integer.toHexString(valeur_num));
                }
                else if(octal_active){
                    Integer valeur_num = 0;
                    String valeur_text = champ_view.getText();
                    try{
                        valeur_num = Integer.parseInt(valeur_text,8);
                    }catch (Exception e){
                        e.getMessage();
                    }
                    champ_view.setText(Integer.toHexString(valeur_num));
                }
                else if(bin_active){
                    Integer valeur_num = 0;
                    String valeur_text = champ_view.getText();
                    try{
                        valeur_num = Integer.parseInt(valeur_text,2);
                    }catch (Exception e){
                        e.getMessage();
                    }
                    champ_view.setText(Integer.toHexString(valeur_num));
                }

                octal_active = false;
                decimal_active = false;
                hexa_active = true;
                bin_active = false;

                bouton_xp2.setDisable(true);
                bouton_xp3.setDisable(true);
                bouton_xpy.setDisable(true);
                bouton_10px.setDisable(true);
                bouton_factoriel.setDisable(true);
                bouton_racine2.setDisable(true);
                bouton_racine3.setDisable(true);
                bouton_1surx.setDisable(true);
                bouton_sin.setDisable(true);
                bouton_cos.setDisable(true);
                bouton_tan.setDisable(true);
                bouton_pi.setDisable(true);
            }
        }
    }

    @FXML
    public void bouton_octal_click(ActionEvent event) {

        if (event.getSource() == bouton_octal) {
            if(champ_view.getText() == "")
                champ_view.setText("0,00");
            else
            {
                if(bin_active){
                    Integer valeur_num = 0;
                    String valeur_text = champ_view.getText();
                    try{
                        valeur_num = Integer.parseInt(valeur_text,2);
                    }catch (Exception e){
                        e.getMessage();
                    }
                    champ_view.setText(Integer.toBinaryString(valeur_num));
                }
                else if(octal_active){
                    Integer valeur_num = 0;
                    String valeur_text = champ_view.getText();
                    try{
                        valeur_num = Integer.parseInt(valeur_text,8);
                    }catch (Exception e){
                        e.getMessage();
                    }
                    champ_view.setText(Integer.toBinaryString(valeur_num));
                }
                else if(hexa_active){
                    Integer valeur_num = 0;
                    String valeur_text = champ_view.getText();
                    try{
                        valeur_num = Integer.parseInt(valeur_text,16);
                    }catch (Exception e){
                        e.getMessage();
                    }
                    champ_view.setText(Integer.toBinaryString(valeur_num));
                }

                octal_active = true;
                decimal_active = false;
                hexa_active = false;
                bin_active = false;

                bouton_eight.setDisable(true);
                bouton_nine.setDisable(true);
                bouton_xp2.setDisable(true);
                bouton_xp3.setDisable(true);
                bouton_xpy.setDisable(true);
                bouton_10px.setDisable(true);
                bouton_factoriel.setDisable(true);
                bouton_racine2.setDisable(true);
                bouton_racine3.setDisable(true);
                bouton_1surx.setDisable(true);
                bouton_sin.setDisable(true);
                bouton_cos.setDisable(true);
                bouton_tan.setDisable(true);
                bouton_pi.setDisable(true);
            }
        }
    }

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

}