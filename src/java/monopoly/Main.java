package monopoly;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application
{
    private static Stage graphStage;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Stage stage = primaryStage;
        graphStage = new Stage();

        stage.setTitle("Calcopoly");
        stage.toFront();

        graphStage.setTitle("Graphic");
        graphStage.setX(0);
        graphStage.setY(0);

        Parent mainRoot = FXMLLoader.load(getClass().getResource("mainScreen.fxml"));
        Parent graphRoot = FXMLLoader.load(getClass().getResource("graphScreen.fxml"));

        Group mainGroup = new Group(mainRoot);
        Group graphGroup= new Group(graphRoot);

        Scene mainScene = new Scene(mainGroup);
        Scene graphScene = new Scene(graphGroup);

        stage.setScene(mainScene);
        stage.show();

        graphStage.setScene(graphScene);
    }

    public static void showGraphStage(boolean show)
    {
        if(show)
            graphStage.show();
        else
            graphStage.hide();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
