package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        //Create the main layout
        BorderPane layout = new BorderPane();
        
        /*
        The application offers a menu consisting of three buttons, and the 
        contents that can be changed by clicking on these buttons. The first 
        button (containing the text "Joke") shows a question that is related to a 
        joke. The second button (text "Answer") show the related answer. The 
        third and the final button ("Explanation") brings up the explanation for 
        the joke.

        By default (when it starts) the program should show a joke-related 
        question. Use the following string as the question: "What do you call a 
        bear with no teeth?". The answer should be "A gummy bear." You can come 
        up with a suitable explanation by yourself.
        */
        
        //Create the buttons
        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button explanation = new Button("Explanation");
        
        //Create a layout to hold the buttons
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        menu.getChildren().addAll(joke, answer, explanation);
        
        //Menu goes on top of the main layout
        layout.setTop(menu);
        
        //Create the center subviews
        StackPane jokePane = createView("What do you call a bear with no teeth?");
        StackPane answerPane = createView("A gummy bear.");
        StackPane explanationPane = createView("Heh, the bear has no teeth.");
        
        //Set the initial view
        layout.setCenter(jokePane);
        
        //Set button behaviour
        joke.setOnAction((event) -> layout.setCenter(jokePane));
        answer.setOnAction((event) -> layout.setCenter(answerPane));
        explanation.setOnAction((event) -> layout.setCenter(explanationPane));
        
        Scene scene = new Scene(layout);
        
        stage.setScene(scene);
        stage.show();
    }
    
    private StackPane createView(String text) {

        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }
}
