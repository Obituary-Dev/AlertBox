
package alertbox;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Obituary
 */
public class Main extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("the new boston");

        button = new Button("Click me");
        button.setOnAction(e -> AlertBox.display("Title of the window", "wow this alertbox is awesome"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 500, 400);
        window.setScene(scene);
        window.show();
    }
}
