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
    private JFXButton bouton_percent;

    @FXML
    private JFXButton bouton_suppr;

    @FXML
    private JFXButton bouton_nine;

    @FXML
    private JFXButton bouton_four;

    @FXML
    private JFXButton bouton_one;

    @FXML
    private JFXButton bouton_zero;

    @FXML
    private JFXButton bouton_eight;

    @FXML
    private JFXButton bouton_five;

    @FXML
    private JFXButton bouton_equal;

    @FXML
    private JFXButton bouton_virgule;

    @FXML
    private JFXButton bouton_add;

    @FXML
    private JFXButton bouton_three;

    @FXML
    private JFXButton bouton_minus;

    @FXML
    private JFXButton bouton_six;

    @FXML
    private JFXButton bouton_mult;

    @FXML
    private JFXButton bouton_seven;

    @FXML
    private JFXButton bouton_div;

    @FXML
    private JFXButton clear;

    @FXML
    private JFXButton bouton_two;

    @FXML
    private JFXButton bouton_plusMoins;

    @FXML
    private TextField champ_view;

    @FXML
    private TextField historique_view;


    private double result;
    private double nombre_temp1;
    private double nombre_temp2;
    private String operateur;
    Boolean status = false;

    @FXML
    public void bouton_one_click(ActionEvent event) {

        if (event.getSource() == bouton_one) {
            champ_view.setPromptText("");
            if(!status)
                champ_view.setText((champ_view.getText() + "1"));
            else
                champ_view.setText("1");
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
            if(!status)
                champ_view.setText((champ_view.getText() + "2"));
            else
                champ_view.setText("2");
        }
    }

    @FXML
    public void bouton_three_click(ActionEvent event) {

        if (event.getSource() == bouton_three) {
            champ_view.setPromptText("");
            if(!status)
                champ_view.setText((champ_view.getText() + "3"));
            else
                champ_view.setText("3");
        }
    }

    @FXML
    public void bouton_four_click(ActionEvent event) {

        if (event.getSource() == bouton_four) {
            champ_view.setPromptText("");
            if(!status)
                champ_view.setText((champ_view.getText() + "4"));
            else
                champ_view.setText("4");
        }
    }

    @FXML
    public void bouton_five_click(ActionEvent event) {

        if (event.getSource() == bouton_five) {
            champ_view.setPromptText("");
            if(!status)
                champ_view.setText((champ_view.getText() + "5"));
            else
                champ_view.setText("5");
        }
    }

    @FXML
    public void bouton_six_click(ActionEvent event) {

        if (event.getSource() == bouton_six) {
            champ_view.setPromptText("");
            if(!status)
                champ_view.setText((champ_view.getText() + "6"));
            else
                champ_view.setText("6");
        }
    }

    @FXML
    public void bouton_seven_click(ActionEvent event) {

        if (event.getSource() == bouton_seven) {
            champ_view.setPromptText("");
            if(!status)
                champ_view.setText((champ_view.getText() + "7"));
            else
                champ_view.setText("7");
        }
    }

    @FXML
    public void bouton_height_click(ActionEvent event) {

        if (event.getSource() == bouton_eight) {
            champ_view.setPromptText("");
            if(!status)
                champ_view.setText((champ_view.getText() + "8"));
            else
                champ_view.setText("8");
        }
    }

    @FXML
    public void bouton_nine_click(ActionEvent event) {

        if (event.getSource() == bouton_nine) {
            champ_view.setPromptText("");
            if(!status)
                champ_view.setText((champ_view.getText() + "9"));
            else
                champ_view.setText("9");
        }
    }

    @FXML
    public void bouton_zero_click(ActionEvent event) {

        if (event.getSource() == bouton_zero) {
            champ_view.setPromptText("");
            if(!status)
                champ_view.setText((champ_view.getText() + "0"));
            else
                champ_view.setText("0");
        }
    }

    @FXML
    public void bouton_virgule_click(ActionEvent event) {

        if (event.getSource() == bouton_virgule) {
            champ_view.setPromptText("");
            if (!status) {
                if (champ_view.getText() == "")
                    champ_view.setText("0,");
                else
                    champ_view.setText((champ_view.getText() + ","));
            } else {
                if (champ_view.getText() == "")
                    champ_view.setText("0,");
                else
                {champ_view.setText((champ_view.getText() + ",")); status=false;}
            }
        }
    }

    @FXML
    public void bouton_mult_click() {
        nombre_temp1 = Double.valueOf(champ_view.getText());
        operateur = "*";
        champ_view.setText("");
    }
    @FXML
    public void bouton_add_click() {
       try {
           nombre_temp1 = Double.parseDouble(champ_view.getText());
           operateur = "+";
           champ_view.setText("");
       }catch (NumberFormatException e){
            e.getMessage();
       }

    }

    @FXML
    public void bouton_div_click() {
        nombre_temp1 = Double.valueOf(champ_view.getText());
        operateur = "/";
        champ_view.setText("");
    }

    @FXML
    public void bouton_minus_click() {
        nombre_temp1 = Double.valueOf(champ_view.getText());
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
        nombre_temp2 = Double.valueOf(champ_view.getText());
        switch (operateur)
        {
            case "+":
                result = nombre_temp1 + nombre_temp2;
                champ_view.setText(String.valueOf(result));
                status = true;
                break;

            case "-":
                result = nombre_temp1 - nombre_temp2;
                champ_view.setText(String.valueOf(result));
                status = true;
                break;

            case "*":
                result = nombre_temp1 * nombre_temp2;
                champ_view.setText(String.valueOf(result));
                status = true;
                break;

            case "/":
                result = nombre_temp1 / nombre_temp2;
                champ_view.setText(String.valueOf(result));
                status = true;
                break;
        }
    }



}