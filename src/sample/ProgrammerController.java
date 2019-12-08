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

public class ProgrammerController extends BaseController {

    @FXML
    private JFXButton bouton_a;

    @FXML
    private JFXButton bouton_b;

    @FXML
    private JFXButton bouton_c;

    @FXML
    private JFXButton bouton_d;

    @FXML
    private JFXButton bouton_e;

    @FXML
    private JFXButton bouton_f;

    @FXML
    private JFXButton bouton_decimal;

    @FXML
    private JFXButton bouton_bin;

    @FXML
    private JFXButton bouton_octal;

    @FXML
    private JFXButton bouton_hexa;

    @FXML
    private JFXButton bouton_AND;

    @FXML
    private JFXButton bouton_OR;

    @FXML
    private JFXButton bouton_NOT;

    @FXML
    private JFXButton bouton_XOR;

    @FXML
    private JFXButton bouton_xp2;

    @FXML
    private JFXButton bouton_xp3;

    @FXML
    private JFXButton bouton_xpy;

    @FXML
    private JFXButton bouton_10px;

    protected boolean bin_active = false;
    protected boolean decimal_active = true;
    protected boolean octal_active = false;
    protected boolean hexa_active = false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void bouton_a_click(ActionEvent event) {

        if (event.getSource() == bouton_a) {
            champ_view.setPromptText("");
            if(!status_champ)
                champ_view.setText((champ_view.getText() + "a"));
            else
            {
                champ_view.setText("a");
                status_champ = false;
            }
        }
    }

    @FXML
    public void bouton_b_click(ActionEvent event) {

        if (event.getSource() == bouton_b) {
            champ_view.setPromptText("");
            if(!status_champ)
                champ_view.setText((champ_view.getText() + "b"));
            else
            {
                champ_view.setText("b");
                status_champ = false;
            }
        }
    }

    @FXML
    public void bouton_c_click(ActionEvent event) {

        if (event.getSource() == bouton_c) {
            champ_view.setPromptText("");
            if(!status_champ)
                champ_view.setText((champ_view.getText() + "c"));
            else
            {
                champ_view.setText("c");
                status_champ = false;
            }
        }
    }

    @FXML
    public void bouton_d_click(ActionEvent event) {

        if (event.getSource() == bouton_d) {
            champ_view.setPromptText("");
            if(!status_champ)
                champ_view.setText((champ_view.getText() + "d"));
            else
            {
                champ_view.setText("d");
                status_champ = false;
            }
        }
    }

    @FXML
    public void bouton_e_click(ActionEvent event) {

        if (event.getSource() == bouton_e) {
            champ_view.setPromptText("");
            if(!status_champ)
                champ_view.setText((champ_view.getText() + "e"));
            else
            {
                champ_view.setText("e");
                status_champ = false;
            }
        }
    }

    @FXML
    public void bouton_f_click(ActionEvent event) {

        if (event.getSource() == bouton_f) {
            champ_view.setPromptText("");
            if(!status_champ)
                champ_view.setText((champ_view.getText() + "f"));
            else
            {
                champ_view.setText("f");
                status_champ = false;
            }
        }
    }

    @FXML
    public void bouton_and_click() {
        try {
            nbre_float1 = Integer.parseInt(champ_view.getText().replaceAll(",","."));
            operateur = "and";
            champ_view.setText("");
        }catch (NumberFormatException e){
            e.getMessage();
        }
    }

    @FXML
    public void bouton_or_click() {
        try {
            nbre_float1 = Integer.parseInt(champ_view.getText().replaceAll(",","."));
            operateur = "or";
            champ_view.setText("");
        }catch (NumberFormatException e){
            e.getMessage();
        }
    }

    @FXML
    public void bouton_not_click(ActionEvent event) {
        if (event.getSource() == bouton_NOT) {
            if(champ_view.getText() == "")
                champ_view.setText("0,00");
            else
            {
                Integer valeur_num = 0;
                String valeur_text = champ_view.getText();
                try{
                    valeur_num = Integer.parseInt(valeur_text);
                }catch (Exception e){
                    e.getMessage();
                }
                String result = Integer.toBinaryString(-valeur_num);

                if (decimal_active) {
                    champ_view.setText(String.valueOf(-valeur_num));
                    status_champ = true;
                } else if (bin_active) {
                    champ_view.setText(String.valueOf(Integer.parseInt(result, 2)));
                    status_champ = true;
                } else if (octal_active) {
                    champ_view.setText(String.valueOf(Integer.parseInt(result, 8)));
                    status_champ = true;
                } else if (hexa_active) {
                    champ_view.setText(String.valueOf(Integer.parseInt(result, 16)));
                    status_champ = true;
                }
            }
        }
    }

    @FXML
    public void bouton_xor_click() {
        try {
            nbre_float1 = Integer.parseInt(champ_view.getText().replaceAll(",","."));
            operateur = "xor";
            champ_view.setText("");
        }catch (NumberFormatException e){
            e.getMessage();
        }
    }

    @FXML
    public void bouton_xp2_click(ActionEvent event) {

        if (event.getSource() == bouton_xp2) {
            if(champ_view.getText() == "")
                champ_view.setText("0,00");
            else
            {
                Integer valeur_num = 0;
                String valeur_text = champ_view.getText();
                try{
                    valeur_num = Integer.parseInt(valeur_text);
                }catch (Exception e){
                    e.getMessage();
                }
                valeur_num = valeur_num*valeur_num;
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
                Integer valeur_num = 0;
                String valeur_text = champ_view.getText();
                try{
                    valeur_num = Integer.parseInt(valeur_text);
                }catch (Exception e){
                    e.getMessage();
                }
                valeur_num = valeur_num*valeur_num*valeur_num;
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
                Integer valeur_num1 = valeur_num.intValue();
                champ_view.setText(String.valueOf(valeur_num1));
            }
        }
    }

    @FXML
    public void bouton_xpy_click(ActionEvent event) {
        nbre_float1 = Integer.valueOf(champ_view.getText());
        operateur = "xpy";
        champ_view.setText("");
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
                    champ_view.setText(Integer.toString(valeur_num,10));
                }
                else if(octal_active){
                    Integer valeur_num = 0;
                    String valeur_text = champ_view.getText();
                    try{
                        valeur_num = Integer.parseInt(valeur_text,8);
                    }catch (Exception e){
                        e.getMessage();
                    }
                    champ_view.setText(Integer.toString(valeur_num,10));
                }
                else if(bin_active){
                    Integer valeur_num = 0;
                    String valeur_text = champ_view.getText();
                    try{
                        valeur_num = Integer.parseInt(valeur_text,2);
                    }catch (Exception e){
                        e.getMessage();
                    }
                    champ_view.setText(Integer.toString(valeur_num,10));
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
                bouton_xp2.setDisable(true);
                bouton_xp3.setDisable(true);
                bouton_xpy.setDisable(true);
                bouton_10px.setDisable(true);
                bouton_a.setDisable(true);
                bouton_b.setDisable(true);
                bouton_c.setDisable(true);
                bouton_d.setDisable(true);
                bouton_e.setDisable(true);
                bouton_f.setDisable(true);

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
                    champ_view.setText(Integer.toString(valeur_num,2));
                }
                else if(octal_active){
                    Integer valeur_num = 0;
                    String valeur_text = champ_view.getText();
                    try{
                        valeur_num = Integer.parseInt(valeur_text,8);
                    }catch (Exception e){
                        e.getMessage();
                    }
                    champ_view.setText(Integer.toString(valeur_num,2));
                }
                else if(hexa_active){
                    Integer valeur_num = 0;
                    String valeur_text = champ_view.getText();
                    try{
                        valeur_num = Integer.parseInt(valeur_text,16);
                    }catch (Exception e){
                        e.getMessage();
                    }
                    champ_view.setText(Integer.toString(valeur_num,2));
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
                bouton_a.setDisable(true);
                bouton_b.setDisable(true);
                bouton_c.setDisable(true);
                bouton_d.setDisable(true);
                bouton_e.setDisable(true);
                bouton_f.setDisable(true);
                bouton_xp2.setDisable(false);
                bouton_xp3.setDisable(false);
                bouton_xpy.setDisable(false);
                bouton_10px.setDisable(false);

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

                bouton_two.setDisable(false);
                bouton_three.setDisable(false);
                bouton_four.setDisable(false);
                bouton_five.setDisable(false);
                bouton_six.setDisable(false);
                bouton_seven.setDisable(false);
                bouton_eight.setDisable(false);
                bouton_nine.setDisable(false);
                bouton_a.setDisable(false);
                bouton_b.setDisable(false);
                bouton_c.setDisable(false);
                bouton_d.setDisable(false);
                bouton_e.setDisable(false);
                bouton_f.setDisable(false);
                bouton_xp2.setDisable(false);
                bouton_xp3.setDisable(false);
                bouton_xpy.setDisable(false);
                bouton_10px.setDisable(false);
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
                    champ_view.setText(Integer.toOctalString(valeur_num));
                }
                else if(decimal_active){
                    Integer valeur_num = 0;
                    String valeur_text = champ_view.getText();
                    try{
                        valeur_num = Integer.parseInt(valeur_text,10);
                    }catch (Exception e){
                        e.getMessage();
                    }
                    champ_view.setText(Integer.toString(valeur_num,8));
                }
                else if(hexa_active){
                    Integer valeur_num = 0;
                    String valeur_text = champ_view.getText();
                    try{
                        valeur_num = Integer.parseInt(valeur_text,16);
                    }catch (Exception e){
                        e.getMessage();
                    }
                    champ_view.setText(Integer.toString(valeur_num,8));
                }

                octal_active = true;
                decimal_active = false;
                hexa_active = false;
                bin_active = false;

                bouton_two.setDisable(false);
                bouton_three.setDisable(false);
                bouton_four.setDisable(false);
                bouton_five.setDisable(false);
                bouton_six.setDisable(false);
                bouton_seven.setDisable(false);
                bouton_eight.setDisable(true);
                bouton_nine.setDisable(true);
                bouton_a.setDisable(true);
                bouton_b.setDisable(true);
                bouton_c.setDisable(true);
                bouton_d.setDisable(true);
                bouton_e.setDisable(true);
                bouton_f.setDisable(true);
                bouton_xp2.setDisable(false);
                bouton_xp3.setDisable(false);
                bouton_xpy.setDisable(false);
                bouton_10px.setDisable(false);

            }
        }
    }

    @FXML
    public void bouton_mult_click(){
        nbre_float1 = Integer.parseInt(champ_view.getText().replaceAll(",","."),10);
        operateur = "*";
        champ_view.setText("");
    }

    @FXML
    public void bouton_add_click() {
        try {
            nbre_float1 = Integer.parseInt(champ_view.getText().replaceAll(",","."),10);
            operateur = "+";
            historique = historique + champ_view.getText() + operateur;
            historique_view.setText(historique);
            champ_view.setText("");
        }catch (NumberFormatException e){
            e.getMessage();
        }
    }

    @FXML
    public void bouton_div_click() {
        nbre_float1 = Integer.parseInt(champ_view.getText().replaceAll(",","."),10);
        operateur = "/";
        historique = historique + champ_view.getText() + operateur;
        historique_view.setText(historique);
        champ_view.setText("");
    }

    @FXML
    public void bouton_minus_click() {
        nbre_float1 = Integer.parseInt(champ_view.getText().replaceAll(",","."),10);
        operateur = "-";
        historique = historique + champ_view.getText() + operateur;
        historique_view.setText(historique);
        champ_view.setText("");
    }

    @FXML
    public void bouton_equal_click() {
        nbre_float2 = Integer.parseInt(champ_view.getText(),10);
        switch (operateur)
        {
            case "+":
                result = nbre_float1 + nbre_float2;
                if (decimal_active) {
                    champ_view.setText(String.valueOf(result));
                    status_champ = true;
                }
                else if(bin_active){
                    String result_string = String.valueOf(result);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,2)));
                    status_champ = true;
                }
                else if(octal_active){
                    String result_string = String.valueOf(result);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,8)));
                    status_champ = true;
                }
                else if(hexa_active){
                    String result_string = String.valueOf(result);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,16)));
                    status_champ = true;
                }
                break;

            case "-":
                result = nbre_float1 - nbre_float2;
                if (decimal_active) {
                    champ_view.setText(String.valueOf(result));
                    status_champ = true;
                }
                else if(bin_active){
                    String result_string = String.valueOf(result);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,2)));
                    status_champ = true;
                }
                else if(octal_active){
                    String result_string = String.valueOf(result);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,8)));
                    status_champ = true;
                }
                else if(hexa_active){
                    String result_string = String.valueOf(result);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,16)));
                    status_champ = true;
                }
                break;

            case "*":
                result = nbre_float1 * nbre_float2;
                if (decimal_active) {
                    champ_view.setText(String.valueOf(result));
                    status_champ = true;
                }
                else if(bin_active){
                    String result_string = String.valueOf(result);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,2)));
                    status_champ = true;
                }
                else if(octal_active){
                    String result_string = String.valueOf(result);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,8)));
                    status_champ = true;
                }
                else if(hexa_active){
                    String result_string = String.valueOf(result);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,16)));
                    status_champ = true;
                }
                break;

            case "/":
                result = nbre_float1 / nbre_float2;
                if (decimal_active) {
                    champ_view.setText(String.valueOf(result));
                    status_champ = true;
                }
                else if(bin_active){
                    String result_string = String.valueOf(result);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,2)));
                    status_champ = true;
                }
                else if(octal_active){
                    String result_string = String.valueOf(result);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,8)));
                    status_champ = true;
                }
                else if(hexa_active){
                    String result_string = String.valueOf(result);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,16)));
                    status_champ = true;
                }
                break;

            case "xpy":
                result = Math.pow(nbre_float1,nbre_float2);
                if (decimal_active) {
                    champ_view.setText(String.valueOf(result));
                    status_champ = true;
                }
                else if(bin_active){
                    String result_string = String.valueOf(result);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,2)));
                    status_champ = true;
                }
                else if(octal_active){
                    String result_string = String.valueOf(result);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,8)));
                    status_champ = true;
                }
                else if(hexa_active){
                    String result_string = String.valueOf(result);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,16)));
                    status_champ = true;
                }
                break;

            case "and":
                String result = Integer.toBinaryString((int)nbre_float1 & (int)nbre_float2);
                if (decimal_active) {
                    champ_view.setText(String.valueOf(result));
                    status_champ = true;
                }
                else if(bin_active){
                    String result_string = String.valueOf(result);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,2)));
                    status_champ = true;
                }
                else if(octal_active){
                    String result_string = String.valueOf(result);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,8)));
                    status_champ = true;
                }
                else if(hexa_active){
                    String result_string = String.valueOf(result);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,16)));
                    status_champ = true;
                }
                break;

            case "or":
                String result1 = Integer.toBinaryString((int)nbre_float1 | (int)nbre_float2);
                if (decimal_active) {
                    champ_view.setText(String.valueOf(result1));
                    status_champ = true;
                }
                else if(bin_active){
                    String result_string = String.valueOf(result1);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,2)));
                    status_champ = true;
                }
                else if(octal_active){
                    String result_string = String.valueOf(result1);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,8)));
                    status_champ = true;
                }
                else if(hexa_active){
                    String result_string = String.valueOf(result1);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,16)));
                    status_champ = true;
                }
                break;

            case "xor":
                String result2 = Integer.toBinaryString((int)nbre_float1 ^ (int)nbre_float2);
                if (decimal_active) {
                    champ_view.setText(String.valueOf(result2));
                    status_champ = true;
                }
                else if(bin_active){
                    String result_string = String.valueOf(result2);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,2)));
                    status_champ = true;
                }
                else if(octal_active){
                    String result_string = String.valueOf(result2);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,8)));
                    status_champ = true;
                }
                else if(hexa_active){
                    String result_string = String.valueOf(result2);
                    champ_view.setText(String.valueOf(Integer.parseInt(result_string,16)));
                    status_champ = true;
                }
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

    @FXML
    public void changeToScientifique(ActionEvent e) throws IOException {
        Parent mode_base = FXMLLoader.load(getClass().getResource("CalculatriceScientifique(new).fxml"));
        Stage stage_base = new Stage();
        stage_base.setTitle("Calculatrice (Mode Scientifique)");
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