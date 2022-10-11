package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        BorderPane layout = new BorderPane();
        
        TextArea centre = new TextArea();
        HBox bottom = new HBox();
        Label first = new Label("Letters: 0");
        Label second = new Label("Words: 0");
        Label third = new Label("The longest word is:");
        
        bottom.getChildren().add(first);
        bottom.getChildren().add(second);
        bottom.getChildren().add(third);
        
        layout.setCenter(centre);
        layout.setBottom(bottom);
        
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
        
    }

    
}
