package monopoly.controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable
{
    @FXML
    private ImageView imageView;

    @FXML
    private AnchorPane problemPane;

    @FXML
    private void close()
    {
        problemPane.setVisible(false);
    }

    @FXML
    private void setQuestion(MouseEvent event)
    {
        System.out.println(event.getSource().toString());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
//        URL url = getClass().getClassLoader().getResource("monopoly/Board.png");

//        Image image = new Image(url.toString());
//        imageView.setImage(image);
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(720);
        imageView.setFitWidth(720);
    }
}
