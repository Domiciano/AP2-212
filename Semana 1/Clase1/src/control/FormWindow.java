package control;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FormWindow {
	
	
	//Referencias de los objetos
	
	@FXML
	TextField nameTF;
	
	@FXML
	PasswordField passTF;
	
	@FXML
	Label output;
	
	
	
	public Stage build() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("FormWindow.fxml"));
			Scene scene = new Scene(root, 600, 400);
			Stage stage = new Stage();
			stage.setScene(scene);
			return stage;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}	
	
	
	@FXML
	public void submit() {
		String name = nameTF.getText();
		String pass = passTF.getText();
		
		int A = Integer.parseInt(name);
		int B = Integer.parseInt(pass);
		int sum = A+B;
		
		output.setText(""+sum);
	}
	
	
	
	
	
	
	
	
	
	
	

}
