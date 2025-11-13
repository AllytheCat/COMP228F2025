package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.sql.*;

public class EmploymentForm extends Application {

    private TextField nameField = new TextField();
    private TextField emailField = new TextField();
    private TextField positionField = new TextField();
    private TextField salaryField = new TextField();
    private TextArea outputArea = new TextArea();

    private final String DB_URL = "jdbc:sqlite:week9_lab6_Alekah.db";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        createTableIfNotExists();

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);

        grid.add(new Label("Name:"), 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(new Label("Email:"), 0, 1);
        grid.add(emailField, 1, 1);
        grid.add(new Label("Position:"), 0, 2);
        grid.add(positionField, 1, 2);
        grid.add(new Label("Salary:"), 0, 3);
        grid.add(salaryField, 1, 3);

        Button submitButton = new Button("Submit");
        Button readButton = new Button("Read");

        grid.add(submitButton, 0, 4);
        grid.add(readButton, 1, 4);
        grid.add(outputArea, 0, 5, 2, 1);

        submitButton.setOnAction(e -> insertRecord());
        readButton.setOnAction(e -> readRecords());

        Scene scene = new Scene(grid, 500, 400);
        stage.setTitle("Employment Form");
        stage.setScene(scene);
        stage.show();
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }

    private void createTableIfNotExists() {
        String sql = """
            CREATE TABLE IF NOT EXISTS applicants (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                name TEXT,
                email TEXT,
                position TEXT,
                salary REAL
            );
        """;
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            outputArea.setText("Table creation failed: " + e.getMessage());
        }
    }

    private void insertRecord() {
        String sql = "INSERT INTO applicants (name, email, position, salary) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nameField.getText());
            stmt.setString(2, emailField.getText());
            stmt.setString(3, positionField.getText());
            stmt.setDouble(4, Double.parseDouble(salaryField.getText()));
            stmt.executeUpdate();
            outputArea.setText("Record inserted successfully.");
        } catch (Exception e) {
            outputArea.setText("Insert failed: " + e.getMessage());
        }
    }

    private void readRecords() {
        String sql = "SELECT * FROM applicants";
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            StringBuilder sb = new StringBuilder();
            while (rs.next()) {
                sb.append("ID: ").append(rs.getInt("id")).append("\n")
                  .append("Name: ").append(rs.getString("name")).append("\n")
                  .append("Email: ").append(rs.getString("email")).append("\n")
                  .append("Position: ").append(rs.getString("position")).append("\n")
                  .append("Salary: ").append(rs.getDouble("salary")).append("\n\n");
            }
            outputArea.setText(sb.toString());
        } catch (Exception e) {
            outputArea.setText("Read failed: " + e.getMessage());
        }
    }
}

