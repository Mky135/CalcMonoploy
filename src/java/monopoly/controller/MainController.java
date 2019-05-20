package monopoly.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import monopoly.Main;

import java.net.URL;
import java.util.*;

public class MainController implements Initializable
{
    @FXML
    private ImageView imageView;

    @FXML
    private AnchorPane problemPane;

    @FXML
    private ImageView question;

    @FXML
    private ImageView answer;

    @FXML
    private Line line;

    @FXML
    private Button correctButton;

    @FXML
    private Button wrongButton;

    @FXML private Button b1Base;@FXML private Button b1House; @FXML private Button b1Hotel; @FXML private Button b2Base;@FXML private Button b2House; @FXML private Button b2Hotel;

    private HashMap<String, Button> buttonMap = new HashMap<>();

    private HashMap<Button, Image> questionMap = new HashMap<>();

    private HashMap<Button, Image> answerMap = new HashMap<>();

    private HashMap<Button, Boolean> graphMap = new HashMap<>();

    private ArrayList<Button> buttons = new ArrayList<>();

    private String button;

    @FXML
    private void close()
    {
        problemPane.setVisible(false);
        answer.setVisible(false);
        line.setVisible(false);
        correctButton.setVisible(false);
        wrongButton.setVisible(false);
        Main.showGraphStage(false);
    }

    @FXML
    private void setQuestion(MouseEvent event)
    {
        System.out.println(event.getSource().toString());
        problemPane.setVisible(true);
        button = event.getSource().toString();

        question.setImage(questionMap.get(buttonMap.get(button)));
        answer.setImage(answerMap.get(buttonMap.get(button)));
        if(graphMap.get(buttonMap.get(button)))
        {
            Main.showGraphStage(true);
        }
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
        close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(720);
        imageView.setFitWidth(720);

        close();

        setButtonMap();
        setQuestionMap();
        setAnswerMap();
        setGraphMap();
    }

    private void setButtonMap()
    {
        setButtons(b1Base, b1House, b1Hotel, b2Base, b2House, b2Hotel, lb1Base, lb1House, lb1Hotel, lb2Base,lb2House, lb2Hotel, lb3Base,lb3House, lb3Hotel, p1Base, p1House, p1Hotel, p2Base, p2House, p2Hotel, p3Base, p3House, p3Hotel, o1Base, o1House, o1Hotel, o2Base, o2House, o2Hotel, o3Base, o3House, o3Hotel, r1Base, r1House, r1Hotel, r2Base, r2House, r2Hotel, r3Base, r3House, r3Hotel, y1Base, y1House, y1Hotel, y2Base, y2House, y2Hotel, y3Base, y3House, y3Hotel, g1Base, g1House, g1House, g2Base, g2House, g2Hotel, g3Base, g3House, g3Hotel, bl1Base, bl1House, bl1Hotel, bl2Base, bl2House, bl2Hotel);

        buttonMap.put("Button[id=b1Base, styleClass=button]''", b1Base);
        buttonMap.put("Button[id=b1House, styleClass=button]''", b1House);
        buttonMap.put("Button[id=b1Hotel, styleClass=button]''", b1Hotel);
        buttonMap.put("Button[id=b2Base, styleClass=button]''", b2Base);
        buttonMap.put("Button[id=b2House, styleClass=button]''", b2House);
        buttonMap.put("Button[id=b2Hotel, styleClass=button]''", b2Hotel);

        buttonMap.put("Button[id=lb1Base, styleClass=button]''", lb1Base);
        buttonMap.put("Button[id=lb1House, styleClass=button]''", lb1House);
        buttonMap.put("Button[id=lb1Hotel, styleClass=button]''", lb1Hotel);
        buttonMap.put("Button[id=lb2Base, styleClass=button]''", lb2Base);
        buttonMap.put("Button[id=lb2House, styleClass=button]''", lb2House);
        buttonMap.put("Button[id=lb2Hotel, styleClass=button]''", lb2Hotel);
        buttonMap.put("Button[id=lb3Base, styleClass=button]''", lb3Base);
        buttonMap.put("Button[id=lb3House, styleClass=button]''", lb3House);
        buttonMap.put("Button[id=lb3Hotel, styleClass=button]''", lb3Hotel);

        buttonMap.put("Button[id=p1Base, styleClass=button]''", p1Base);
        buttonMap.put("Button[id=p1House, styleClass=button]''", p1House);
        buttonMap.put("Button[id=p1Hotel, styleClass=button]''", p1Hotel);
        buttonMap.put("Button[id=p2Base, styleClass=button]''", p2Base);
        buttonMap.put("Button[id=p2House, styleClass=button]''", p2House);
        buttonMap.put("Button[id=p2Hotel, styleClass=button]''", p2Hotel);
        buttonMap.put("Button[id=p3Base, styleClass=button]''", p3Base);
        buttonMap.put("Button[id=p3House, styleClass=button]''", p3House);
        buttonMap.put("Button[id=p3Hotel, styleClass=button]''", p3Hotel);

        buttonMap.put("Button[id=o1House, styleClass=button]''", o1House);
        buttonMap.put("Button[id=o1Hotel, styleClass=button]''", o1Hotel);
        buttonMap.put("Button[id=o2House, styleClass=button]''", o2House);
        buttonMap.put("Button[id=o2Hotel, styleClass=button]''", o2Hotel);
        buttonMap.put("Button[id=o3House, styleClass=button]''", o3House);
        buttonMap.put("Button[id=o3Hotel, styleClass=button]''", o3Hotel);

        buttonMap.put("Button[id=r1Base, styleClass=button]''", r1Base);
        buttonMap.put("Button[id=r1House, styleClass=button]''", r1House);
        buttonMap.put("Button[id=r1Hotel, styleClass=button]''", r1Hotel);
        buttonMap.put("Button[id=r2Base, styleClass=button]''", r2Base);
        buttonMap.put("Button[id=r2House, styleClass=button]''", r2House);
        buttonMap.put("Button[id=r2Hotel, styleClass=button]''", r2Hotel);
        buttonMap.put("Button[id=r3Base, styleClass=button]''", r3Base);
        buttonMap.put("Button[id=r3House, styleClass=button]''", r3House);
        buttonMap.put("Button[id=r3Hotel, styleClass=button]''", r3Hotel);

        buttonMap.put("Button[id=y1Base, styleClass=button]''", y1Base);
        buttonMap.put("Button[id=y1House, styleClass=button]''", y1House);
        buttonMap.put("Button[id=y1Hotel, styleClass=button]''", y1Hotel);
        buttonMap.put("Button[id=y2Base, styleClass=button]''", y2Base);
        buttonMap.put("Button[id=y2House, styleClass=button]''", y2House);
        buttonMap.put("Button[id=y2Hotel, styleClass=button]''", y2Hotel);
        buttonMap.put("Button[id=y3Base, styleClass=button]''", y3Base);
        buttonMap.put("Button[id=y3House, styleClass=button]''", y3House);
        buttonMap.put("Button[id=y3Hotel, styleClass=button]''", y3Hotel);

        buttonMap.put("Button[id=g1Base, styleClass=button]''", g1Base);
        buttonMap.put("Button[id=g1House, styleClass=button]''", g1House);
        buttonMap.put("Button[id=g1Hotel, styleClass=button]''", g1Hotel);
        buttonMap.put("Button[id=g2Base, styleClass=button]''", g2Base);
        buttonMap.put("Button[id=g2House, styleClass=button]''", g2House);
        buttonMap.put("Button[id=g2Hotel, styleClass=button]''", g2Hotel);
        buttonMap.put("Button[id=g3Base, styleClass=button]''", g3Base);
        buttonMap.put("Button[id=g3House, styleClass=button]''", g3House);
        buttonMap.put("Button[id=g3Hotel, styleClass=button]''", g3Hotel);

        buttonMap.put("Button[id=bl1Base, styleClass=button]''", bl1Base);
        buttonMap.put("Button[id=bl1House, styleClass=button]''", bl1House);
        buttonMap.put("Button[id=bl1Hotel, styleClass=button]''", bl1Hotel);
        buttonMap.put("Button[id=bl2Base, styleClass=button]''", bl2Base);
        buttonMap.put("Button[id=bl2House, styleClass=button]''", bl2House);
        buttonMap.put("Button[id=bl2Hotel, styleClass=button]''", bl2Hotel);
    }

    private void setButtons(Button... buttons)
    {
        this.buttons.addAll(Arrays.asList(buttons));
    }

    private void setQuestionMap()
    {
        setMap(questionMap, "questions");
    }

    private void setAnswerMap()
    {
        setMap(answerMap, "answers");
    }

    private void setMap(HashMap<Button, Image> map, String directory)
    {
        for(int i = 0; i < buttons.size(); i++)
        {
           //Todo: Set map with images
            map.put(buttons.get(i), new Image(String.valueOf(getClass().getClassLoader().getResource("monopoly/" + directory + "/0.png"))));
//            map.put(buttons.get(i), new Image(String.valueOf(getClass().getClassLoader().getResource("monopoly/" + directory + "/" + i +".png"))));
        }
    }

    private void setGraphMap()
    {
       for(Button button : buttons)
       {
           graphMap.put(button, false);
       }

       graphMap.put(buttons.get(1), true);
    }

    @FXML private Button lb1Base;@FXML private Button lb2Base;@FXML private Button lb3Base;@FXML private Button p1Base;@FXML private Button p2Base;@FXML private Button p3Base;@FXML private Button o1Base;@FXML private Button o2Base;@FXML private Button o3Base;@FXML private Button r1Base;@FXML private Button r2Base;@FXML private Button r3Base;@FXML private Button y1Base;@FXML private Button y2Base;@FXML private Button y3Base;@FXML private Button g1Base;@FXML private Button g2Base;@FXML private Button g3Base;@FXML private Button bl1Base;@FXML private Button bl2Base;
    @FXML private Button lb1House;@FXML private Button lb2House;@FXML private Button lb3House;@FXML private Button p1House;@FXML private Button p2House;@FXML private Button p3House;@FXML private Button o1House;@FXML private Button o2House;@FXML private Button o3House;@FXML private Button r1House;@FXML private Button r2House;@FXML private Button r3House;@FXML private Button y1House;@FXML private Button y2House;@FXML private Button y3House;@FXML private Button g1House;@FXML private Button g2House;@FXML private Button g3House;@FXML private Button bl1House;@FXML private Button bl2House;
    @FXML private Button lb1Hotel;@FXML private Button lb2Hotel;@FXML private Button lb3Hotel;@FXML private Button p1Hotel;@FXML private Button p2Hotel;@FXML private Button p3Hotel;@FXML private Button o1Hotel;@FXML private Button o2Hotel;@FXML private Button o3Hotel;@FXML private Button r1Hotel;@FXML private Button r2Hotel;@FXML private Button r3Hotel;@FXML private Button y1Hotel;@FXML private Button y2Hotel;@FXML private Button y3Hotel;@FXML private Button g1Hotel;@FXML private Button g2Hotel;@FXML private Button g3Hotel;@FXML private Button bl1Hotel;@FXML private Button bl2Hotel;
}
