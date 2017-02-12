package org.cartilage.bermuda;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Launches the UI of the client
 * @author Cartilage
 */
public class Launcher extends Application {

	/**
	 * The main entry point for all JavaFX applications.
	 * The start method is called after the init method has returned,
	 * and after the system is ready for the application to begin running.
	 * <p>
	 * <p>
	 * NOTE: This method is called on the JavaFX Application Thread.
	 * </p>
	 *
	 * @param primaryStage the primary stage for this application, onto which
	 *                     the application scene can be set. The primary stage will be embedded in
	 *                     the browser if the application was launched as an applet.
	 *                     Applications may create other stages, if needed, but they will not be
	 *                     primary stages and will not be embedded in the browser.
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Bermuda");

		GridPane pane = new GridPane();
		pane.setAlignment(Pos.TOP_CENTER);
		pane.setVgap(4);
		pane.setHgap(4);
		pane.setPadding(new Insets(8, 8, 8, 8));

		Image logo = new Image("https://dl.dropboxusercontent.com/u/65089966/logo.png");
		ImageView imgView = new ImageView();
		imgView.setImage(logo);
		pane.add(imgView, 0, 0);

		Text welcomeText = new Text("Welcome to Bermuda!");
		welcomeText.setFont(Font.font(22));
		pane.add(welcomeText, 0, 1);

		Label username = new Label("Username:");
		pane.add(username, 0, 2);
		TextField usernameField = new TextField();
		pane.add(usernameField, 1, 2);

		Label password = new Label("Password:");
		pane.add(password, 0, 3);
		PasswordField passwordField = new PasswordField();
		pane.add(passwordField, 1, 3);

		//TODO: Fix the text fields and make the pane about 250x280
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}
}
