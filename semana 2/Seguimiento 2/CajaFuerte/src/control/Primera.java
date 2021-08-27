package control;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class Primera {

	//Constantes
	public static final String NUM1="12";
	public static final String NUM2="12";
	public static final String NUM3="12";
	public static final String NUM4="12";
	public static final String NUM5="12";
	public static final String NUM6="12";
	
	@FXML
	PasswordField n1,n2,n3,n4,n5,n6;
	
	@FXML
	Label mensaje;
	
	public Stage build() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Primera.fxml"));
			Scene scene = new Scene(root, 600, 400);
			Stage stage = new Stage();
			stage.setScene(scene);
			return stage;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

	public void next() {
		
		if(n1.getText().equals(NUM1) && n2.getText().equals(NUM2) && n3.getText().equals(NUM3)&& n4.getText().equals(NUM4) && n5.getText().equals(NUM5) && n6.getText().equals(NUM6)) {
			Segunda s = new Segunda();
		    s.build().show();
		}
		else {
			mensaje.setText("LA COMBINACION ES INCORRECTA");
		}
		
	}

}
