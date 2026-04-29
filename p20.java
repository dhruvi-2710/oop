import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class BouncingBallApp extends Application {

    private double dx = 2; // speed in x direction
    private boolean running = false;

    @Override
    public void start(Stage stage) {

        // Pane for animation
        Pane pane = new Pane();

        // Ball
        Circle ball = new Circle(20, Color.BLUE);
        ball.setCenterX(50);
        ball.setCenterY(100);

        pane.getChildren().add(ball);

        // Buttons
        Button startBtn = new Button("Start");
        Button stopBtn = new Button("Stop");

        // Slider for speed control
        Slider speedSlider = new Slider(1, 10, 2);

        HBox controls = new HBox(10, startBtn, stopBtn, speedSlider);

        BorderPane root = new BorderPane();
        root.setCenter(pane);
        root.setBottom(controls);

        Scene scene = new Scene(root, 500, 300);

        // Animation Timer (for smooth movement)
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (running) {

                    // Update speed from slider
                    dx = speedSlider.getValue();

                    // Move ball
                    ball.setCenterX(ball.getCenterX() + dx);

                    // Bounce at boundaries (responsive to resize)
                    if (ball.getCenterX() >= pane.getWidth() - ball.getRadius()
                            || ball.getCenterX() <= ball.getRadius()) {
                        dx = -dx;
                    }
                }
            }
        };

        timer.start();

        // Button actions
        startBtn.setOnAction(e -> running = true);
        stopBtn.setOnAction(e -> running = false);

        stage.setTitle("Bouncing Ball");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
