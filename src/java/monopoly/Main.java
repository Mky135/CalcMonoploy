package monopoly;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import monopoly.util.FileHandler;

import java.awt.*;
import java.util.Objects;

public class Main extends Application
{
    private static Stage stage;
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public FileHandler questionFile;
    public FileHandler solutionsFile;

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

        questionFile = new FileHandler(Objects.requireNonNull(getClass().getClassLoader().getResource("monopoly/Questions.txt")).getPath());
        solutionsFile = new FileHandler(Objects.requireNonNull(getClass().getClassLoader().getResource("monopoly/Answers.txt")).getPath());
    }



    public static void main(String[] args)
    {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 3; i <= 22; i++) {
            stringBuilder.append("@FXML private Button b").append(i).append("House;").append("\n");
        }

        for (int i = 3; i <= 22; i++) {
            stringBuilder.append("@FXML private Button b").append(i).append("Hotel;").append("\n");
        }

        System.out.println(stringBuilder.toString());
        launch(args);
    }
}
