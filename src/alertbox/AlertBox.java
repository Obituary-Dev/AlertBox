package alertbox;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Obituary
 */
public class AlertBox {

    public static void display(String title, String message) {
        Stage window = new Stage();

        // Block input events or user interactions until this new window is taken care of
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);
        Button closeButton = new Button("Close the window");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 200, 250);
        window.setScene(scene);
        // display this window and before you go back to main you have to close 
        window.showAndWait();

    }
}
