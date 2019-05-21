package monopoly.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class GraphController implements Initializable
{
    @FXML
    ImageView graphic;

    private static ImageView graphic1;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        graphic1 = graphic;
    }

    static void changeGraphic(Image image)
    {
        graphic1.setImage(image);
    }
}
