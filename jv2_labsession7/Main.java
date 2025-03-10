package jv2_labsession7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage mainStage;
    @Override
    public void start(Stage primaryStage) {
        mainStage = primaryStage;
        try{
            Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
            Scene scene = new Scene(root,600,400);
            primaryStage.setScene(scene);
            primaryStage.setTitle("List");
            primaryStage.show();

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}