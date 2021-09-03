package ui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignInWindow extends Stage
{
	// UI Components
	
	Button signUpBtn, logInBtn;
	TextField nameInput, passInput;
	
	public SignInWindow()
	{
		try
		{
			FXMLLoader loader = new FXMLLoader(getClass().getResource("signInWindow.FXML"));
			Parent root = loader.load();
			
			signUpBtn = (Button) loader.getNamespace().get("signUpBtn");
			logInBtn = (Button) loader.getNamespace().get("logInBtn");
			
			nameInput = (TextField) loader.getNamespace().get("nameInput");
			passInput = (TextField) loader.getNamespace().get("passInput");
			
			Scene scene = new Scene(root, 458, 254);
			setScene(scene);
			
			init();
		}catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void init()
	{
		signUpBtn.setOnAction(event->
		{
			
		});
		logInBtn.setOnAction(event->
		{
			
		});
	}
}
