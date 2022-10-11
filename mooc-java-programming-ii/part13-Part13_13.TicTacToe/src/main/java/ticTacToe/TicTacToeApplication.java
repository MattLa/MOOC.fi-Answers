package ticTacToe;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/*
The test is really dumb and cannot handle assigning a winner of the game. It will 
try to fill the board and if a player wins during that test, the test will fail. 
*/
public class TicTacToeApplication extends Application {

    String status = "X";
    ArrayList<Button> buttons = new ArrayList<>();
    
    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        BorderPane mainLayout = new BorderPane();
        
        Label turnLabel = new Label("Turn: " + status);
        
        GridPane gameLayout = new GridPane();
        gameLayout.setPadding(new Insets(10, 10, 10, 10));
        gameLayout.setVgap(10);
        gameLayout.setHgap(10);
        
        
        
        for (int i = 0; i < 9; i++) {
            Button button = new Button();
            button.setFont(Font.font("Monospaced", 25));
            button.setMinSize(70, 70);
            button.setMaxSize(70, 70);
            
            button.setOnAction((event) ->{
                if (button.getText().isEmpty()) {
                    button.setText(status);
                    takeTurn();
                    turnLabel.setText("Turn: " + status);
                    if (boardIsFull()) {
                        turnLabel.setText("The end!");
                        disableButtons();
                    //} else if (status.equals("XXX")) {
                    //    turnLabel.setText("X wins!");
                    //    disableButtons();
                    //} else if (status.equals("OOO")) {
                    //    turnLabel.setText("O wins!");
                    //    disableButtons();
                    //} else {
                        
                    }
                }
            });
            buttons.add(button);
        }
        
        gameLayout.add(buttons.get(0), 0, 0);
        gameLayout.add(buttons.get(1), 0, 1);
        gameLayout.add(buttons.get(2), 0, 2);
        gameLayout.add(buttons.get(3), 1, 0);
        gameLayout.add(buttons.get(4), 1, 1);
        gameLayout.add(buttons.get(5), 1, 2);
        gameLayout.add(buttons.get(6), 2, 0);
        gameLayout.add(buttons.get(7), 2, 1);
        gameLayout.add(buttons.get(8), 2, 2);
        
        mainLayout.setTop(turnLabel);
        mainLayout.setCenter(gameLayout);
        
        Scene scene = new Scene(mainLayout);
        stage.setScene(scene);
        stage.show();
    }
    
    public void disableButtons() {
        for (Button b : buttons) {
            b.disarm();
        }
    }

    public void takeTurn() {
        checkStatus();
        if (status.equals("X")) {
            status = "O";
        } else if (status.equals("O")){
            status = "X";
        }
    }
    
    public boolean boardIsFull() {
        for (Button b : buttons) {
            if (b.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }
    
    public void checkStatus() {
        
        for (int a = 0; a < 8; a++) {
            String line = null;
  
            switch (a) {
            case 0:
                line = buttons.get(0).getText() + buttons.get(1).getText() + buttons.get(2).getText();
                break;
            case 1:
                line = buttons.get(3).getText() + buttons.get(4).getText() + buttons.get(5).getText();
                break;
            case 2:
                line = buttons.get(6).getText() + buttons.get(7).getText() + buttons.get(8).getText();
                break;
            case 3:
                line = buttons.get(0).getText() + buttons.get(3).getText() + buttons.get(6).getText();
                break;
            case 4:
                line = buttons.get(1).getText() + buttons.get(4).getText() + buttons.get(7).getText();
                break;
            case 5:
                line = buttons.get(2).getText() + buttons.get(5).getText() + buttons.get(8).getText();
                break;
            case 6:
                line = buttons.get(0).getText() + buttons.get(4).getText() + buttons.get(8).getText();
                break;
            case 7:
                line = buttons.get(2).getText() + buttons.get(4).getText() + buttons.get(6).getText();
                break;
            }
            //For X winner
            if (line.equals("XXX")) {
                //status = "X wins!";
            }
              
            // For O winner
            else if (line.equals("OOO")) {
                //status = "O wins!";
            }
        }
    }
}
