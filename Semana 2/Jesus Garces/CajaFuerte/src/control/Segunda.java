package control;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Segunda {
	
	public Stage build() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Segunda.fxml"));
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
	
	public void cambiar() {
		
		Tercera t = new Tercera();
		t.build().show();
	}
	
	public void cerrar( ) {
		System.exit(0);
	}

}
