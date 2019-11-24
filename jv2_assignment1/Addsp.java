package jv2_assignment1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Addsp {
       public TextField tbtname = new TextField();
       public TextField tbtma = new TextField();
       public TextField tbtgia = new TextField();
       public TextField tbtsl = new TextField();

       public void SaveList() {
           String name = tbtname.getText();
           String masp = tbtma.getText();
           String price = tbtgia.getText();
           String amount = tbtsl.getText();

           try {
               Parent listsp = FXMLLoader.load(getClass().getResource("Listsp.fxml"));
               Main.mainStage.getScene().setRoot(listsp);
               AddProduct ad = new AddProduct(name,masp,price,amount);
               Listsp.list.add(ad);
           }catch (Exception e){

           }



       }


}
