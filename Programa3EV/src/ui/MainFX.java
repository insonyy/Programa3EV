package ui;

import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class MainFX extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
        ResourceBundle rb = ResourceBundle.getBundle("textosFX", Locale.getDefault());
        FXMLLoader loaderMenu = new FXMLLoader(getClass().getResource("/fxml/principal.fxml"),rb);
        AnchorPane root = loaderMenu.load();
        Scene scene = new Scene(root);
        primaryStage.setTitle(rb.getString("title"));
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(true);
		
	}

}
