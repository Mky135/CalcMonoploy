package monopoly;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application
{
    private static Stage stage;
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        stage = primaryStage;
        stage.setTitle("Calculus Monopoly");
        stage.toFront();

        Parent mainRoot = FXMLLoader.load(getClass().getResource("mainScreen.fxml"));

        Group group = new Group(mainRoot);

//        Scene mainScene = new Scene(group, screenSize.width, screenSize.height, Color.BLACK);
        Scene mainScene = new Scene(group);

        stage.setScene(mainScene);
        stage.show();
        System.out.println(screenSize);
    }

    public static void main(String[] args) { launch(args); }
}
