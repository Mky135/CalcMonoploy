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
import monopoly.util.Property;

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

    @FXML
    private ImageView calcNeeded;

    @FXML private Button train1; @FXML private Button train2; @FXML private Button train3; @FXML private Button train4;

    @FXML private Button b1Base;@FXML private Button b1House; @FXML private Button b1Hotel; @FXML private Button b2Base;@FXML private Button b2House; @FXML private Button b2Hotel;

    private ArrayList<Property> properties = new ArrayList<>();

    private ArrayList<Image> baseQImages = new ArrayList<>();
    private ArrayList<Image> houseQImages = new ArrayList<>();
    private ArrayList<Image> hotelQImages = new ArrayList<>();

    private ArrayList<Image> baseAImages = new ArrayList<>();
    private ArrayList<Image> houseAImages = new ArrayList<>();
    private ArrayList<Image> hotelAImages = new ArrayList<>();

    private ArrayList<Image> trainQImages = new ArrayList<>();
    private ArrayList<Image> trainAImages = new ArrayList<>();

    private Image blank = getResourceImage("monopoly/answers/trains/blank.png");

    private Property property;

    @FXML
    private void close()
    {
        problemPane.setVisible(false);
        answer.setVisible(false);
        line.setVisible(false);
        correctButton.setVisible(false);
        wrongButton.setVisible(false);
        calcNeeded.setVisible(false);
        Main.showGraphStage(false);
    }

    @FXML
    private void setQuestion(MouseEvent event)
    {
        problemPane.setVisible(true);
        property = getProperty(event.getSource().toString());
        assert property != null;
        question.setImage(property.getQuestion());
        answer.setImage(property.getAnswer());

        if(property.hasGraphic())
        {
            Main.showGraphStage(true);
            GraphController.changeGraphic(property.getGraphic());
        }
        else
            Main.showGraphStage(false);

        if(property.isCalculatorAllowed())
            calcNeeded.setVisible(true);
        else
            calcNeeded.setVisible(false);
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
        property.getButton().setVisible(false);
        close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(720);
        imageView.setFitWidth(720);

        close();

        setProperties();
    }

    private void setProperties()
    {
        setBaseQImages();
        setBaseAImages();
        setHouseQImages();
        setHotelQImages();
        setHouseAImages();
        setHotelAImages();
        setTrainQImages();
        setTrainAImages();

        properties.add(new Property("Button[id=b1Base, styleClass=button]''", b1Base, baseQImages.get(0), baseAImages.get(0)));
        properties.add(new Property("Button[id=b1House, styleClass=button]''", b1House,houseQImages.get(0), houseAImages.get(0)));
        properties.add(new Property("Button[id=b1Hotel, styleClass=button]''", b1Hotel, hotelQImages.get(0), hotelAImages.get(0)));
        properties.add(new Property("Button[id=b2Base, styleClass=button]''", b2Base, baseQImages.get(1), baseAImages.get(1)));
        properties.add(new Property("Button[id=b2House, styleClass=button]''", b2House,houseQImages.get(1), houseAImages.get(1)));
        properties.add(new Property("Button[id=b2Hotel, styleClass=button]''", b2Hotel, hotelQImages.get(1), hotelAImages.get(1)));

        properties.add(new Property("Button[id=lb1Base, styleClass=button]''", lb1Base, baseQImages.get(2), baseAImages.get(2)));
        properties.add(new Property("Button[id=lb1House, styleClass=button]''", lb1House, houseQImages.get(2), houseAImages.get(2)));
        properties.add(new Property("Button[id=lb1Hotel, styleClass=button]''", lb1Hotel,hotelQImages.get(2), hotelAImages.get(2)));
        properties.add(new Property("Button[id=lb2Base, styleClass=button]''", lb2Base, baseQImages.get(3), baseAImages.get(3)));
        properties.add(new Property("Button[id=lb2House, styleClass=button]''", lb2House, houseQImages.get(3), houseAImages.get(3)));
        properties.add(new Property("Button[id=lb2Hotel, styleClass=button]''", lb2Hotel,hotelQImages.get(3), hotelAImages.get(3)));
        properties.add(new Property("Button[id=lb3Base, styleClass=button]''", lb3Base, baseQImages.get(4), baseAImages.get(4)));
        properties.add(new Property("Button[id=lb3House, styleClass=button]''", lb3House, houseQImages.get(4), houseAImages.get(4)));
        properties.add(new Property("Button[id=lb3Hotel, styleClass=button]''", lb3Hotel,hotelQImages.get(4), hotelAImages.get(4)));

        properties.add(new Property("Button[id=p1Base, styleClass=button]''", p1Base, baseQImages.get(5), baseQImages.get(5), getResourceImage("monopoly/graphs/11.png"), true));
        properties.add(new Property("Button[id=p1House, styleClass=button]''", p1House, houseQImages.get(5), houseQImages.get(5), getResourceImage("monopoly/graphs/11.png"), true));
        properties.add(new Property("Button[id=p1Hotel, styleClass=button]''", p1Hotel, hotelQImages.get(5), hotelAImages.get(5), getResourceImage("monopoly/graphs/11.png"), true));
        properties.add(new Property("Button[id=p2Base, styleClass=button]''", p2Base, baseQImages.get(6), baseQImages.get(6), getResourceImage("monopoly/graphs/13.png"), false));
        properties.add(new Property("Button[id=p2House, styleClass=button]''", p2House, houseQImages.get(6), houseQImages.get(6), getResourceImage("monopoly/graphs/13.png"), false));
        properties.add(new Property("Button[id=p2Hotel, styleClass=button]''", p2Hotel, hotelQImages.get(6), hotelAImages.get(6), getResourceImage("monopoly/graphs/13.png"), false));
        properties.add(new Property("Button[id=p3Base, styleClass=button]''", p3Base, baseQImages.get(7), baseQImages.get(7), getResourceImage("monopoly/graphs/14.png"), false));
        properties.add(new Property("Button[id=p3House, styleClass=button]''", p3House, houseQImages.get(7), houseQImages.get(7), getResourceImage("monopoly/graphs/14.png"), false));
        properties.add(new Property("Button[id=p3Hotel, styleClass=button]''", p3Hotel, hotelQImages.get(7), hotelAImages.get(7), getResourceImage("monopoly/graphs/14.png"), false));

        properties.add(new Property("Button[id=o1Base, styleClass=button]''", o1Base, baseQImages.get(8), baseAImages.get(8)));
        properties.add(new Property("Button[id=o1House, styleClass=button]''", o1House, houseQImages.get(8), houseAImages.get(8)));
        properties.add(new Property("Button[id=o1Hotel, styleClass=button]''", o1Hotel, hotelQImages.get(8), houseAImages.get(8)));
        properties.add(new Property("Button[id=o2Base, styleClass=button]''", o2Base, baseQImages.get(9), baseAImages.get(9)));
        properties.add(new Property("Button[id=o2House, styleClass=button]''", o2House, houseQImages.get(9), houseAImages.get(9)));
        properties.add(new Property("Button[id=o2Hotel, styleClass=button]''", o2Hotel, hotelQImages.get(9), houseAImages.get(9)));
        properties.add(new Property("Button[id=o3Base, styleClass=button]''", o3Base, baseQImages.get(10), baseAImages.get(10), getResourceImage("monopoly/graphs/19.png"), true));
        properties.add(new Property("Button[id=o3House, styleClass=button]''", o3House, houseQImages.get(10), houseAImages.get(10)));
        properties.add(new Property("Button[id=o3Hotel, styleClass=button]''", o3Hotel, hotelQImages.get(10), houseAImages.get(10)));

        properties.add(new Property("Button[id=r1Base, styleClass=button]''", r1Base, baseQImages.get(11), baseAImages.get(11), true));
        properties.add(new Property("Button[id=r1House, styleClass=button]''", r1House, houseQImages.get(11), houseAImages.get(11), true));
        properties.add(new Property("Button[id=r1Hotel, styleClass=button]''", r1Hotel, hotelQImages.get(11), hotelAImages.get(11), true));
        properties.add(new Property("Button[id=r2Base, styleClass=button]''", r2Base, baseQImages.get(12), baseAImages.get(12)));
        properties.add(new Property("Button[id=r2House, styleClass=button]''", r2House, houseQImages.get(12), houseAImages.get(12)));
        properties.add(new Property("Button[id=r2Hotel, styleClass=button]''", r2Hotel, hotelQImages.get(12), hotelAImages.get(12)));
        properties.add(new Property("Button[id=r3Base, styleClass=button]''", r3Base, baseQImages.get(13), baseAImages.get(13)));
        properties.add(new Property("Button[id=r3House, styleClass=button]''", r3House, houseQImages.get(13), houseAImages.get(13)));
        properties.add(new Property("Button[id=r3Hotel, styleClass=button]''", r3Hotel, hotelQImages.get(13), hotelAImages.get(13)));

        properties.add(new Property("Button[id=y1Base, styleClass=button]''", y1Base, baseQImages.get(14), baseAImages.get(14), true));
        properties.add(new Property("Button[id=y1House, styleClass=button]''", y1House, houseQImages.get(14), houseAImages.get(14), true));
        properties.add(new Property("Button[id=y1Hotel, styleClass=button]''", y1Hotel, hotelQImages.get(14), hotelAImages.get(14), true));
        properties.add(new Property("Button[id=y2Base, styleClass=button]''", y2Base, baseQImages.get(15), baseAImages.get(15), true));
        properties.add(new Property("Button[id=y2House, styleClass=button]''", y2House, houseQImages.get(15), houseAImages.get(15), true));
        properties.add(new Property("Button[id=y2Hotel, styleClass=button]''", y2Hotel, hotelQImages.get(15), hotelAImages.get(15), true));
        properties.add(new Property("Button[id=y3Base, styleClass=button]''", y3Base, baseQImages.get(16), baseAImages.get(16)));
        properties.add(new Property("Button[id=y3House, styleClass=button]''", y3House, houseQImages.get(16), houseAImages.get(16)));
        properties.add(new Property("Button[id=y3Hotel, styleClass=button]''", y3Hotel, hotelQImages.get(16), hotelAImages.get(16)));

        properties.add(new Property("Button[id=g1Base, styleClass=button]''", g1Base, baseQImages.get(17), baseAImages.get(17)));
        properties.add(new Property("Button[id=g1House, styleClass=button]''", g1House, houseQImages.get(17), houseAImages.get(17)));
        properties.add(new Property("Button[id=g1Hotel, styleClass=button]''", g1Hotel, hotelQImages.get(17), hotelAImages.get(17)));
        properties.add(new Property("Button[id=g2Base, styleClass=button]''", g2Base, baseQImages.get(18), baseAImages.get(18)));
        properties.add(new Property("Button[id=g2House, styleClass=button]''", g2House, houseQImages.get(18), houseAImages.get(18)));
        properties.add(new Property("Button[id=g2Hotel, styleClass=button]''", g2Hotel, hotelQImages.get(18), hotelAImages.get(18)));
        properties.add(new Property("Button[id=g3Base, styleClass=button]''", g3Base, baseQImages.get(19), baseAImages.get(19)));
        properties.add(new Property("Button[id=g3House, styleClass=button]''", g3House, houseQImages.get(19), houseAImages.get(19)));
        properties.add(new Property("Button[id=g3Hotel, styleClass=button]''", g3Hotel, hotelQImages.get(19), hotelAImages.get(19)));

        properties.add(new Property("Button[id=bl1Base, styleClass=button]''", bl1Base, baseQImages.get(20), baseAImages.get(20), true));
        properties.add(new Property("Button[id=bl1House, styleClass=button]''", bl1House, houseQImages.get(20), houseAImages.get(20), true));
        properties.add(new Property("Button[id=bl1Hotel, styleClass=button]''", bl1Hotel, hotelQImages.get(20), hotelAImages.get(20), true));
        properties.add(new Property("Button[id=bl2Base, styleClass=button]''", bl2Base, baseQImages.get(21), baseAImages.get(21), true));
        properties.add(new Property("Button[id=bl2House, styleClass=button]''", bl2House, houseQImages.get(21), houseAImages.get(21), true));
        properties.add(new Property("Button[id=bl2Hotel, styleClass=button]''", bl2Hotel, hotelQImages.get(21), hotelAImages.get(21), true));

        properties.add(new Property("Button[id=train1, styleClass=button]''", train1, blank, trainAImages.get(0), trainQImages.get(0), false));
        properties.add(new Property("Button[id=train2, styleClass=button]''", train2, blank, trainAImages.get(1), trainQImages.get(1), false));
        properties.add(new Property("Button[id=train3, styleClass=button]''", train3, blank, trainAImages.get(2), trainQImages.get(2), false));
        properties.add(new Property("Button[id=train4, styleClass=button]''", train4, blank, trainAImages.get(3), trainQImages.get(3), false));

    }

    private void setTrainQImages()
    {
        for(int i = 1; i <= 4; i++)
        {
            trainQImages.add(getResourceImage("monopoly/graphs/trains/"+ i + ".png"));
        }
    }

    private void setTrainAImages()
    {
        for(int i = 1; i <= 4; i++)
        {
            trainAImages.add(getResourceImage("monopoly/answers/trains/"+ i + ".png"));
        }
    }

    private void setBaseQImages()
    {
        this.baseQImages = getBase("questions");
    }

    private void setHouseQImages()
    {
        this.houseQImages = getHouse("questions");
    }

    private void setHotelQImages()
    {
        this.hotelQImages = getHotel("questions");
    }

    private void setBaseAImages()
    {
        this.baseAImages = getBase("answers");
    }

    private void setHouseAImages()
    {
        this.houseAImages = getHouse("answers");
    }

    private void setHotelAImages()
    {
        this.hotelAImages = getHotel("answers");
    }

    private ArrayList<Image> getBase(String directory)
    {
        return getImages( directory + "/base");
    }

    private ArrayList<Image> getHouse(String directory)
    {
        return getImages(directory + "/house");
    }

    private ArrayList<Image> getHotel(String directory)
    {
        return getImages( directory + "/hotel");
    }

    private ArrayList<Image> getImages(String directory)
    {
        ArrayList<Image> images = new ArrayList<>();

        for(int i = 1; i <= 22; i++)
        {
//            images.add(getResourceImage("monopoly/" + directory + "/"+i+".png"));
            images.add(getResourceImage("monopoly/" + directory + "/1.png"));
        }

        return images;
    }

    private Property getProperty(String eventSource)
    {
        for(Property property1 : properties)
        {
            if(eventSource.equals(property1.getEventSource()))
            {
                return property1;
            }
        }

        return null;
    }

    private Image getResourceImage(String image)
    {
        return new Image(String.valueOf(getClass().getClassLoader().getResource(image)));
    }

    @FXML private Button lb1Base;@FXML private Button lb2Base;@FXML private Button lb3Base;@FXML private Button p1Base;@FXML private Button p2Base;@FXML private Button p3Base;@FXML private Button o1Base;@FXML private Button o2Base;@FXML private Button o3Base;@FXML private Button r1Base;@FXML private Button r2Base;@FXML private Button r3Base;@FXML private Button y1Base;@FXML private Button y2Base;@FXML private Button y3Base;@FXML private Button g1Base;@FXML private Button g2Base;@FXML private Button g3Base;@FXML private Button bl1Base;@FXML private Button bl2Base;
    @FXML private Button lb1House;@FXML private Button lb2House;@FXML private Button lb3House;@FXML private Button p1House;@FXML private Button p2House;@FXML private Button p3House;@FXML private Button o1House;@FXML private Button o2House;@FXML private Button o3House;@FXML private Button r1House;@FXML private Button r2House;@FXML private Button r3House;@FXML private Button y1House;@FXML private Button y2House;@FXML private Button y3House;@FXML private Button g1House;@FXML private Button g2House;@FXML private Button g3House;@FXML private Button bl1House;@FXML private Button bl2House;
    @FXML private Button lb1Hotel;@FXML private Button lb2Hotel;@FXML private Button lb3Hotel;@FXML private Button p1Hotel;@FXML private Button p2Hotel;@FXML private Button p3Hotel;@FXML private Button o1Hotel;@FXML private Button o2Hotel;@FXML private Button o3Hotel;@FXML private Button r1Hotel;@FXML private Button r2Hotel;@FXML private Button r3Hotel;@FXML private Button y1Hotel;@FXML private Button y2Hotel;@FXML private Button y3Hotel;@FXML private Button g1Hotel;@FXML private Button g2Hotel;@FXML private Button g3Hotel;@FXML private Button bl1Hotel;@FXML private Button bl2Hotel;
}