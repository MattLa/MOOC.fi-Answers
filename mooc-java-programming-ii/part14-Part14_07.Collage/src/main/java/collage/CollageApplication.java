package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();
        int smallerWidth = (int) (sourceImage.getWidth() / 2);
        int smallerHeight = (int) (sourceImage.getHeight() / 2);
 
        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();
        
        //use the smaller image for the loop
        for (int y = 0; y < smallerHeight; y++) {
            for (int x = 0; x < smallerWidth; x++) {
                //Read the original size image to get the colors
                Color color = imageReader.getColor(x * 2, y * 2);

                //Apple the negative colour effect
                Color negativeColor = applyNegativeEffect(color);

                //Write the image 4 times with changes to the x/y coordinates to shift the image around
                imageWriter.setColor(x, y, negativeColor);
                imageWriter.setColor((x + smallerWidth), y, negativeColor);
                imageWriter.setColor(x, (y + smallerHeight), negativeColor);
                imageWriter.setColor((x + smallerWidth), (y + smallerHeight), negativeColor);
            }
        }

        ImageView image = new ImageView(targetImage);
        
        Pane pane = new Pane();
        pane.getChildren().add(image);


        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    private Color applyNegativeEffect(Color colorToChange) {
        double red = 1.0 - colorToChange.getRed();
        double green = 1.0 - colorToChange.getGreen();
        double blue = 1.0 - colorToChange.getBlue();
        double opacity = colorToChange.getOpacity();
        
        return new Color(red, green, blue, opacity);
    }

}
