package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("Text element");
        Button button = new Button("This is a button");
        
        FlowPane pane = new FlowPane();
        pane.getChildren().add(label);
        pane.getChildren().add(button);
        
        Scene view = new Scene(pane);
        
        stage.setScene(view);
        stage.show();
    }

    
}
