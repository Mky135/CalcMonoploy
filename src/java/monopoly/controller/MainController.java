package monopoly.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable
{
    @FXML
    private ImageView imageView;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        URL url = getClass().getClassLoader().getResource("monopoly/Board.png");

        Image image = new Image(url.toString());

        imageView.setImage(image);
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(720);
        imageView.setFitWidth(720);
    }
}
