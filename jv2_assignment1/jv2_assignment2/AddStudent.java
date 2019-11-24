package jv2_assignment2;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class AddStudent {
     public TextField tbtname = new TextField();
     public TextField tbtage = new TextField();
     public TextField tbtmark = new TextField();

     public void SaveList(){
         String name = tbtname.getText();
         String age = tbtname.getText();
         String mark = tbtname.getText();

         try {
             Parent list = FXMLLoader.load(getClass().getResource("listStudent.fxml"));
             Main.mainStage.getScene().setRoot(list);
             Student ad = new Student(name,age,mark);
             list.list.add(ad);

         }catch (Exception e){

         }
     }
}
