package ui;

import java.io.File;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class CreateAccWindow extends Stage
{
	
	// UI Components
	
	TextField nameInput, passInput, imagePath;
	Button browseImageBtn, createAccBtn, signInBtn;
	RadioButton maleOpt, femaleOpt, otherOpt, sysIng, teleIng, indIng, chromeOpt, explorerOpt, mozillaOpt;
	DatePicker birthdayInput;
	
	
	
	public CreateAccWindow()
	{
		final ToggleGroup genderGroup = new ToggleGroup();
		final ToggleGroup carrerGroup = new ToggleGroup();
		final ToggleGroup explorersGroup = new ToggleGroup();
		
		try
		{
			FXMLLoader loader = new FXMLLoader(getClass().getResource("CreateAccWindow.FXML"));
			Parent root = loader.load();
			
			nameInput = (TextField) loader.getNamespace().get("nameInput");
			passInput = (TextField) loader.getNamespace().get("passInput");
			imagePath = (TextField) loader.getNamespace().get("imagePath");
			
			browseImageBtn = (Button) loader.getNamespace().get("browseImageBtn");
			createAccBtn = (Button) loader.getNamespace().get("createAccBtn");
			signInBtn = (Button) loader.getNamespace().get("signInBtn");
			
			birthdayInput = (DatePicker) loader.getNamespace().get("birthdayInput");
			
			maleOpt = (RadioButton) loader.getNamespace().get("maleOpt");
			maleOpt.setText("Male");
			maleOpt.setToggleGroup(genderGroup);
			maleOpt.setSelected(true);
			femaleOpt = (RadioButton) loader.getNamespace().get("femaleOpt");
			femaleOpt.setText("Female");
			femaleOpt.setToggleGroup(genderGroup);
			otherOpt = (RadioButton) loader.getNamespace().get("otherOpt");
			otherOpt.setText("Other");
			otherOpt.setToggleGroup(genderGroup);
			
			sysIng = (RadioButton) loader.getNamespace().get("sysIng");
			sysIng.setText("Ingenieria de Sistemas");
			sysIng.setToggleGroup(carrerGroup);
			sysIng.setSelected(true);
			teleIng = (RadioButton) loader.getNamespace().get("teleIng");
			teleIng.setText("Ingenieria Telematica");
			teleIng.setToggleGroup(carrerGroup);
			indIng = (RadioButton) loader.getNamespace().get("indIng");
			indIng.setText("Ingenieria Industrial");
			indIng.setToggleGroup(carrerGroup);
			
			chromeOpt = (RadioButton) loader.getNamespace().get("chromeOpt");
			chromeOpt.setText("Google Chrome");
			chromeOpt.setToggleGroup(explorersGroup);
			chromeOpt.setSelected(true);
			explorerOpt = (RadioButton) loader.getNamespace().get("explorerOpt");
			explorerOpt.setText("Internet Explorer");
			explorerOpt.setToggleGroup(explorersGroup);
			mozillaOpt = (RadioButton) loader.getNamespace().get("mozillaOpt");
			mozillaOpt.setText("Mozilla Firefox");
			mozillaOpt.setToggleGroup(explorersGroup);
					
			Scene scene = new Scene(root, 454, 619);
			setScene(scene);
			
			init();
		}catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void init()
	{
		browseImageBtn.setOnAction(event->
		{
			FileChooser fileChooser = new FileChooser();
	        fileChooser.setTitle("Buscar Imagen");

	        fileChooser.getExtensionFilters().addAll
	        (
	                new FileChooser.ExtensionFilter("All Images", "*.*"),
	                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
	                new FileChooser.ExtensionFilter("PNG", "*.png")
	        );

	        File imgFile = fileChooser.showOpenDialog(this);
	        if(imgFile != null)
	        {
	        	imagePath.setText(imgFile.getAbsolutePath());
	        }
		});
		createAccBtn.setOnAction(event->
		{
			String username, password, photoPath, gender, career, browser, birthdate;
			
			
		});
	}
}
