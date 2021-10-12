package control;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FormWindow {

    @FXML
    TextField firstNumber;

    @FXML
    TextField secondNumber;

    @FXML
    Label label;



    public Stage build(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FormWindow.fxml"));
            Scene scene = new Scene(root, 600, 400);
            Stage stage = new Stage();
            stage.setScene(scene);

            return stage;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public void multiply() {
        String num1 = firstNumber.getText();
        String num2 = secondNumber.getText();

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);

        int result = a*b;

        label.setText(""+result);
    }

    public void divide() {
        String result = "";

        String num1 = firstNumber.getText();
        String num2 = secondNumber.getText();

        double a = Double.parseDouble(num1);
        double b = Double.parseDouble(num2);

        if(b == 0){
            result = "you can't divide between zero";
        } else {
            result = String.valueOf(a/b);
        }

        label.setText(""+result);
    }
}
