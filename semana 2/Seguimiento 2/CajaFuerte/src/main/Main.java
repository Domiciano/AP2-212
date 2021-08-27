package main;

import javafx.application.Application;
import javafx.stage.Stage;
import control.Primera;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		Primera window = new Primera();
		window.build().show();
	}

}
