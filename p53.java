import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

public class RandomTextFX extends Application {

    @Override
    public void start(Stage stage) {

        VBox vbox = new VBox(15); // spacing between texts
        vbox.setStyle("-fx-alignment: center;"); // center horizontally

        Random random = new Random();

        for (int i = 1; i <= 5; i++) {

            Text text = new Text("Text " + i);

            // Set font: Times New Roman, Bold + Italic, size 22
            text.setFont(Font.font("Times New Roman",
                    FontWeight.BOLD,
                    FontPosture.ITALIC,
                    22));

            // Random color
            Color color = Color.color(random.nextDouble(),
                    random.nextDouble(),
                    random.nextDouble());

            // Random opacity (0.3 to 1.0)
            double opacity = 0.3 + (random.nextDouble() * 0.7);

            text.setFill(color);
            text.setOpacity(opacity);

            vbox.getChildren().add(text);
        }

        Scene scene = new Scene(vbox, 400, 300);

        stage.setTitle("Random Styled Texts");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
