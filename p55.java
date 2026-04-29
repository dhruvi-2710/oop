import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GradeBarChart extends Application {

    @Override
    public void start(Stage stage) {

        // Scaling factor for height
        double scale = 3;

        // --- Projects (20%) ---
        Rectangle projects = new Rectangle(50, 20 * scale);
        projects.setFill(Color.RED);
        VBox pBox = new VBox(projects, new Text("Projects - 20%"));

        // --- Quizzes (10%) ---
        Rectangle quizzes = new Rectangle(50, 10 * scale);
        quizzes.setFill(Color.BLUE);
        VBox qBox = new VBox(quizzes, new Text("Quizzes - 10%"));

        // --- Midterm (30%) ---
        Rectangle midterm = new Rectangle(50, 30 * scale);
        midterm.setFill(Color.GREEN);
        VBox mBox = new VBox(midterm, new Text("Midterm - 30%"));

        // --- Final Exam (40%) ---
        Rectangle finalExam = new Rectangle(50, 40 * scale);
        finalExam.setFill(Color.ORANGE);
        VBox fBox = new VBox(finalExam, new Text("Final - 40%"));

        // Arrange bars horizontally
        HBox root = new HBox(20, pBox, qBox, mBox, fBox);
        root.setStyle("-fx-padding: 20; -fx-alignment: bottom-center;");

        // Scene
        Scene scene = new Scene(root, 500, 300);

        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
