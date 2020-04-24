package GRH.Utilisateur;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppUtilisateur extends Application {

	@Override
	public void start(Stage GRH) throws Exception {
		GRH.setTitle("Gestion des utilisateurs");
		GRH.setWidth(500);
		
		GRH.setHeight(500);
		GRH.show();	
		GRH.centerOnScreen();
		GRH.setResizable(true);
	
	}
	
}
