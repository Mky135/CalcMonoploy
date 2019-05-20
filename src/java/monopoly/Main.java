package monopoly;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application
{
    private static Stage stage;

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
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}
