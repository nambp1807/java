package jv2_labsession6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static Stage mainStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
            mainStage = primaryStage;
        try {
            Parent root = FXMLLoader.load(getClass().getResource("listUser.fxml"));
            primaryStage.setTitle("LIST USER");
            primaryStage.setScene(new Scene(root,600,400));
            primaryStage.show();

        }catch (Exception e){

        }

    }
}
