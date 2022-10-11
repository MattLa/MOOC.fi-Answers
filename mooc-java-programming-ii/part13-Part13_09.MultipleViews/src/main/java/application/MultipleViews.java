package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        /*
        The layout of the first view is done with the help of the BorderPane 
        class. At the top there is the text "First view!". The center of the view 
        contains a button with the text "To the second view!". By pressing that 
        button the application swithces to the second view.
        */
        
        BorderPane firstPane = new BorderPane();
        firstPane.setTop(new Label("First view!"));
        Button toSecond = new Button("To the second view!");
        firstPane.setCenter(toSecond);
        
        /*
        The layout of the second view is done with the help of the VBox class. 
        The first element in the layout is a button with the text "To the third 
        view!" in it — by pressing the button the application switches to the 
        third view. The button is followed by the text "Second view!".
        */
        
        Button toThird = new Button("To the third view!");
        Label secondLabel = new Label("Second view!");
        VBox secondPane = new VBox(toThird, secondLabel);
        
        /*
        The third view uses the GridPane class for its layout. At the 
        coordinates(0, 0) there is a text that reads "Third view!". At 
        coordinates(1, 1) there is a button with the text "To the first view!". 
        Pressing this button brings back the first view.
        */
        
        GridPane thirdPane = new GridPane();
        thirdPane.add(new Label("Third view!"), 0, 0);
        Button toFirst = new Button("To the first view!");
        thirdPane.add(toFirst, 1, 1);
        
        Scene first = new Scene(firstPane);
        Scene second = new Scene(secondPane);
        Scene third = new Scene(thirdPane);
        
        toFirst.setOnAction((event) -> {
            stage.setScene(first);
        });
        
        toSecond.setOnAction((event) -> {
            stage.setScene(second);
        });
        
        toThird.setOnAction((event) -> {
            stage.setScene(third);
        });
        
        stage.setScene(first);
        stage.show();
    }
}
