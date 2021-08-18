package main;

import control.FormWindow;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		
		//Paso 1
		launch(args);
	

	}

	
	//Paso 2 se ejecuta el start
	@Override
	public void start(Stage primaryStage) throws Exception {
		FormWindow window = new FormWindow();
		window.build().show();
		
	}


}
