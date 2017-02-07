package Controler;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControllerBanqueDoc implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Called when the user clicks on the button "+".
	 */
	@FXML
	private void AjoutDoc (ActionEvent event) throws IOException {
		
		 Stage stage;
		 Button b = (Button) event.getSource();
		 stage = (Stage) b.getScene().getWindow();
		 
		 start(stage);
	
}
	
    /**
     * Permet de changer de vue
     *
     * @param view La nouvelle vue voulu
     * @param stage La fenetre pour la quelle la vue est à changer
     * @throws IOException
     */
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../View/AjoutDoc.fxml"));
			Scene scene = new Scene(root);
			stage.setTitle("ERP Jensim - Ajout Document");
			stage.setScene(scene);
			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
    
}

	