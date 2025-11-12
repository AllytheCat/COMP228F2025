package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

//top HBox with image
public class CustomHorizontalTop extends HBox {
    public CustomHorizontalTop() {
        try {
            //Load image from resources
            Image image = new Image(getClass().getResourceAsStream("book.jpg"));

            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(455);
            imageView.setFitWidth(500);
            imageView.setPreserveRatio(true);

            getChildren().add(imageView);
            setSpacing(10);
            setStyle("-fx-border-color: blue;");
        } catch (Exception e) {
            System.out.println("Image not found. Make sure book.jpg is in src/application.");
        }
    }
}

