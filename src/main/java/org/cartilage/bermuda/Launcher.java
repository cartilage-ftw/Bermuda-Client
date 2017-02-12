package org.cartilage.bermuda;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 * Launches the UI of the client
 * @author Cartilage
 */
public class Launcher extends Application {

	/**
	 * A {@link Text} that appears at the bottom of the login screen and
	 * informs the user of server responses
	 */
	public static Text info = new Text();

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
		ColumnConstraints zerothColumn = new ColumnConstraints();
		zerothColumn.setPrefWidth(50);
		zerothColumn.setHgrow(Priority.SOMETIMES);
		pane.getColumnConstraints().add(zerothColumn);

		Image logo = new Image("https://dl.dropboxusercontent.com/u/65089966/logo.png");
		ImageView imgView = new ImageView();
		imgView.setImage(logo);
		pane.add(imgView, 0, 0);

		Text welcomeText = new Text("Welcome to Bermuda!");
		welcomeText.setFont(Font.font(19));
		pane.add(welcomeText, 0, 1);

		Label username = new Label("Username:");
		pane.add(username, 0, 2);
		TextField usernameField = new TextField();
		pane.add(usernameField, 1, 2);

		Label password = new Label("Password:");
		pane.add(password, 0, 3);
		PasswordField passwordField = new PasswordField();
		pane.add(passwordField, 1, 3);

		Button button = new Button("Sign in");
		button.setAlignment(Pos.BOTTOM_RIGHT);
		button.setOnAction(evt -> System.out.println("A sign in was attempted!"));
		pane.add(button, 1, 4);

		info.setText("Enter your username and password to login");
		info.setWrappingWidth(230);
		info.setTextAlignment(TextAlignment.CENTER);
		pane.add(info, 0, 5);

		Scene scene = new Scene(pane, 250, 280);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/**
	 * The entry point of this client
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
