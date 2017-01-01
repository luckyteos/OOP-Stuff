package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainApp extends Application {
	
	private Stage mainStage;
	private AnchorPane rootPane;
	

	@Override
	public void start(Stage primaryStage) {
		
		this.mainStage = primaryStage;
		this.mainStage.setTitle("Aiyah");
		
		showRootLayout();
		
		showBankInt();
		
		
	}
	
	public void showRootLayout(){
		
		try{
			/*Load root layout from FXML*/
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("../view/GamePlay/Aiyah Start-Up.fxml"));
			rootPane = (AnchorPane) loader.load();
			
			/* Show scene containing root layout */
			Scene scene = new Scene (rootPane);
			mainStage.setScene(scene);
			mainStage.show();
			
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}
	
	public void showBankInt (){
		try {
			
			// Load FXML File
			FXMLLoader bankLoader = new FXMLLoader();
			bankLoader.setLocation(getClass().getResource("../view/Tiles/Bank/BankInitialInterface.fxml"));
			AnchorPane bankInt = (AnchorPane) bankLoader.load();
			
			// Creating a new Stage and setting scene to bank interface
			Stage bankStage = new Stage();
			bankStage.setTitle("Bank");
			bankStage.initModality(Modality.WINDOW_MODAL);
			bankStage.initOwner(mainStage);
			Scene scene = new Scene (bankInt);
			bankStage.setScene(scene);
			
			// Showing bank interface
			bankStage.showAndWait();
		
		} catch (IOException e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
