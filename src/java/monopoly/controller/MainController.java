package monopoly.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class MainController implements Initializable
{
    @FXML
    private ImageView imageView;

    @FXML
    private AnchorPane problemPane;

    @FXML
    private Label question;

    @FXML
    private Label answer;

    @FXML
    private Line line;

    @FXML
    private Button correctButton;

    @FXML
    private Button wrongButton;

    @FXML private Button b1House; @FXML private Button b1Hotel; @FXML private Button b2House; @FXML private Button b2Hotel;

    private HashMap<String, Button> buttonMap = new HashMap<>();

    private String button;

    @FXML
    private void close()
    {
        problemPane.setVisible(false);
        answer.setVisible(false);
        line.setVisible(false);
        correctButton.setVisible(false);
        wrongButton.setVisible(false);
    }

    @FXML
    private void setQuestion(MouseEvent event)
    {
        System.out.println(event.getSource().toString());
        problemPane.setVisible(true);
        button = event.getSource().toString();

    }

    @FXML
    private void showAnswer()
    {
        answer.setVisible(true);
        line.setVisible(true);
        correctButton.setVisible(true);
        wrongButton.setVisible(true);
    }

    @FXML
    private void correct()
    {
        buttonMap.get(button).setVisible(false);
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

        answer.setVisible(false);
        line.setVisible(false);
        correctButton.setVisible(false);
        wrongButton.setVisible(false);

        problemPane.setVisible(false);

        setButtonMap();
    }

    private void setButtonMap()
    {
        buttonMap.put("Button[id:b1House, styleClass=button]''", b1House);
        buttonMap.put("Button[id:b2House, styleClass=button]''", b2House);
//        buttonMap.put("Button[id:lb3House, styleClass=button]''", lb3House);
//        buttonMap.put("Button[id:lb4House, styleClass=button]''", lb4House);
//        buttonMap.put("Button[id:lb5House, styleClass=button]''", lb5House);
//        buttonMap.put("Button[id:p6House, styleClass=button]''", p6House);
//        buttonMap.put("Button[id:p7House, styleClass=button]''", p7House);
//        buttonMap.put("Button[id:p8House, styleClass=button]''", p8House);
//        buttonMap.put("Button[id:o9House, styleClass=button]''", o9House);
//        buttonMap.put("Button[id:o10House, styleClass=button]''", o10House);
//        buttonMap.put("Button[id:o11House, styleClass=button]''", o11House);
//        buttonMap.put("Button[id:r12House, styleClass=button]''", r12House);
//        buttonMap.put("Button[id:r13House, styleClass=button]''", r13House);
//        buttonMap.put("Button[id:r14House, styleClass=button]''", r14House);
//        buttonMap.put("Button[id:y15House, styleClass=button]''", y15House);
//        buttonMap.put("Button[id:y16House, styleClass=button]''", y16House);
//        buttonMap.put("Button[id:y17House, styleClass=button]''", y17House);
//        buttonMap.put("Button[id:g18House, styleClass=button]''", g18House);
//        buttonMap.put("Button[id:g19House, styleClass=button]''", g19House);
//        buttonMap.put("Button[id:g20House, styleClass=button]''", g20House);
//        buttonMap.put("Button[id:lb21House, styleClass=button]''", bl21House);
//        buttonMap.put("Button[id:lb22House, styleClass=button]''", bl22House);

        buttonMap.put("Button[id=b1Hotel, styleClass=button]''", b1Hotel);
        buttonMap.put("Button[id=b2Hotel, styleClass=button]''", b2Hotel);
//        buttonMap.put("Button[id=lb3Hotel, styleClass=button]''", lb3Hotel);
//        buttonMap.put("Button[id=lb4Hotel, styleClass=button]''", lb4Hotel);
//        buttonMap.put("Button[id=lb5Hotel, styleClass=button]''", lb5Hotel);
//        buttonMap.put("Button[id=p6Hotel, styleClass=button]''", p6Hotel);
//        buttonMap.put("Button[id=p7Hotel, styleClass=button]''", p7Hotel);
//        buttonMap.put("Button[id=p8Hotel, styleClass=button]''", p8Hotel);
//        buttonMap.put("Button[id=o9Hotel, styleClass=button]''", o9Hotel);
//        buttonMap.put("Button[id=o10Hotel, styleClass=button]''", o10Hotel);
//        buttonMap.put("Button[id=o11Hotel, styleClass=button]''", o11Hotel);
//        buttonMap.put("Button[id=r12Hotel, styleClass=button]''", r12Hotel);
//        buttonMap.put("Button[id=r13Hotel, styleClass=button]''", r13Hotel);
//        buttonMap.put("Button[id=r14Hotel, styleClass=button]''", r14Hotel);
//        buttonMap.put("Button[id=y15Hotel, styleClass=button]''", y15Hotel);
//        buttonMap.put("Button[id=y16Hotel, styleClass=button]''", y16Hotel);
//        buttonMap.put("Button[id=y17Hotel, styleClass=button]''", y17Hotel);
//        buttonMap.put("Button[id=g18Hotel, styleClass=button]''", g18Hotel);
//        buttonMap.put("Button[id=g19Hotel, styleClass=button]''", g19Hotel);
//        buttonMap.put("Button[id=g20Hotel, styleClass=button]''", g20Hotel);
//        buttonMap.put("Button[id=bl21Hotel, styleClass=button]''", bl21Hotel);
//        buttonMap.put("Button[id=bl22Hotel, styleClass=button]''", bl22Hotel);
    }
//    @FXML private Button lb3House;@FXML private Button lb4House;@FXML private Button lb5House;@FXML private Button p6House;@FXML private Button p7House;@FXML private Button p8House;@FXML private Button o9House;@FXML private Button o10House;@FXML private Button o11House;@FXML private Button r12House;@FXML private Button r13House;@FXML private Button r14House;@FXML private Button y15House;@FXML private Button y16House;@FXML private Button y17House;@FXML private Button g18House;@FXML private Button g19House;@FXML private Button g20House;@FXML private Button bl21House;@FXML private Button bl22House;
//    @FXML private Button lb3Hotel;@FXML private Button lb4Hotel;@FXML private Button lb5Hotel;@FXML private Button p6Hotel;@FXML private Button p7Hotel;@FXML private Button p8Hotel;@FXML private Button o9Hotel;@FXML private Button o10Hotel;@FXML private Button o11Hotel;@FXML private Button r12Hotel;@FXML private Button r13Hotel;@FXML private Button r14Hotel;@FXML private Button y15Hotel;@FXML private Button y16Hotel;@FXML private Button y17Hotel;@FXML private Button g18Hotel;@FXML private Button g19Hotel;@FXML private Button g20Hotel;@FXML private Button bl21Hotel;@FXML private Button bl22Hotel;
}
