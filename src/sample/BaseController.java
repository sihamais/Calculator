package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import com.jfoenix.controls.JFXButton;
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


    protected double result;
    protected double nombre_temp1;
    protected double nombre_temp2;
    protected String operateur;
    Boolean status_champ = false;

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
                else
                    champ_view.setText((champ_view.getText() + ","));
            } else {
                if (champ_view.getText() == "")
                    champ_view.setText("0,");
                else
                {champ_view.setText((champ_view.getText() + ",")); status_champ=false;}
            }
        }
    }

    @FXML
    public void bouton_mult_click() {
        nombre_temp1 = Double.parseDouble(champ_view.getText().replaceAll(",","."));
        operateur = "*";
        champ_view.setText("");
    }
    @FXML
    public void bouton_add_click() {
       try {
           nombre_temp1 = Double.parseDouble(champ_view.getText().replaceAll(",","."));
           operateur = "+";
           champ_view.setText("");
       }catch (NumberFormatException e){
            e.getMessage();
       }

    }

    @FXML
    public void bouton_div_click() {
        nombre_temp1 = Double.parseDouble(champ_view.getText().replaceAll(",","."));
        operateur = "/";
        champ_view.setText("");
    }

    @FXML
    public void bouton_minus_click() {
        nombre_temp1 = Double.parseDouble(champ_view.getText().replaceAll(",","."));
        operateur = "-";
        champ_view.setText("");
    }

    @FXML
    public void bouton_clear_click(ActionEvent event) {

        if (event.getSource() == clear) {
            champ_view.setPromptText("0");
            champ_view.setText("");
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
    public void bouton_equal_click() {
        nombre_temp2 = Double.parseDouble(champ_view.getText().replaceAll(",","."));
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
        }
    }



}