package ui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CreateAccWindow extends Stage
{
	public CreateAccWindow()
	{
		try
		{
			FXMLLoader loader = new FXMLLoader(getClass().getResource("CreateAccWindow.FXML"));
			Parent root = loader.load();
			
			Scene scene = new Scene(root, 453, 520);
			setScene(scene);
			
			init();
		}catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void init()
	{
		
	}
}
