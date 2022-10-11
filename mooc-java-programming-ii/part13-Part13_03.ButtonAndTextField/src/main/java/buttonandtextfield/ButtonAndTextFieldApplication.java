package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        Button button = new Button("The Button!");
        TextField field = new TextField();
        
        FlowPane pane = new FlowPane();
        
        pane.getChildren().add(button);
        pane.getChildren().add(field);
        
        Scene scene = new Scene(pane);
        
        stage.setScene(scene);
        stage.show();
    }

    
}
