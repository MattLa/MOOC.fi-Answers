package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class SmileyApplication extends Application {


    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        //Setting up the initial window to paint in
        Canvas paintingCanvas = new Canvas(320, 320);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        BorderPane window = new BorderPane();
        window.setCenter(paintingCanvas);
        
        //Draw the required squares to make the face
        painter.fillRect(80, 40, 40, 40);
        painter.fillRect(200, 40, 40, 40);
        painter.fillRect(40, 160, 40, 40);
        painter.fillRect(80, 200, 40, 40);
        painter.fillRect(120, 200, 40, 40);
        painter.fillRect(160, 200, 40, 40);
        painter.fillRect(200, 200, 40, 40);
        painter.fillRect(240, 160, 40, 40);
        
        Scene view = new Scene(window);
        
        stage.setScene(view);
        stage.show();
    }

    
}
