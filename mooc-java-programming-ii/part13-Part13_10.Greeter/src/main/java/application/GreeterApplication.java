package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        //The first view should have a text field that's used to ask for the user's name.
        
        Label instructionText = new Label("Enter your name and start.");
        TextField textField = new TextField();
        Button startButton = new Button("Start");
        
        GridPane first = new GridPane();
        first.add(instructionText, 0, 0);
        first.add(textField, 0, 1);
        first.add(startButton, 0, 2);
        
        /*The second view then shows the user a greeting text. The greeting 
        should be of the form "Welcome name!" where the user's name is inserted 
        in place of 'name'.
        */
        
        Label welcomeText = new Label();
        GridPane second = new GridPane();
        second.add(welcomeText, 0, 1);
        
        Scene scene = new Scene(first);
        Scene welcomeScene = new Scene(second);
        stage.setScene(scene);
        
        startButton.setOnAction((event) -> {
            String name = textField.getText();
            welcomeText.setText("Welcome " + name + "!");
            stage.setScene(welcomeScene);
        });
        
        stage.show();
    }
    
    
}
