import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RegistrationForm extends Application {

    @Override
    public void start(Stage stage) {

        // UI Components
        TextField rollNoField = new TextField();
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField emailField = new TextField();

        Button submitBtn = new Button("Submit");

        // Layout
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);

        grid.add(new Label("Roll No:"), 0, 0);
        grid.add(rollNoField, 1, 0);

        grid.add(new Label("Name:"), 0, 1);
        grid.add(nameField, 1, 1);

        grid.add(new Label("Age:"), 0, 2);
        grid.add(ageField, 1, 2);

        grid.add(new Label("Email:"), 0, 3);
        grid.add(emailField, 1, 3);

        grid.add(submitBtn, 1, 4);

        // Button action
        submitBtn.setOnAction(e -> {

            String rollText = rollNoField.getText();
            String name = nameField.getText();
            String ageText = ageField.getText();
            String email = emailField.getText();

            try {
                // Validate Roll No
                int rollNo = Integer.parseInt(rollText);

                // Validate Age
                int age = Integer.parseInt(ageText);

                // Validate Email
                if (!email.contains("@") || !email.contains(".")) {
                    throw new IllegalArgumentException("Invalid email format");
                }

                // Success Alert
                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Registration Successful");
                success.setContentText(
                        "Roll No: " + rollNo +
                        "\nName: " + name +
                        "\nAge: " + age +
                        "\nEmail: " + email
                );
                success.showAndWait();

                // Save to file
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt", true))) {
                    bw.write(rollNo + "," + name + "," + age + "," + email);
                    bw.newLine();
                } catch (IOException ex) {
                    System.out.println("File error: " + ex.getMessage());
                }

            } catch (NumberFormatException ex) {

                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Validation Error");
                error.setContentText("Roll No and Age must be numeric!");
                error.showAndWait();

            } catch (IllegalArgumentException ex) {

                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Validation Error");
                error.setContentText(ex.getMessage());
                error.showAndWait();
            }
        });

        Scene scene = new Scene(grid, 400, 250);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
