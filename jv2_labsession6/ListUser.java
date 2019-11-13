package jv2_labsession6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;


import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ListUser implements Initializable {

       public ListView<People>  lView = new ListView<>();
       public static People selectID;

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/labsesson6";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stm = conn.createStatement();
            String sql = "SELECT * FROM people";
            ResultSet rs = stm.executeQuery(sql);

            ObservableList<People> list = FXCollections.observableArrayList();

            while (rs.next()){
              Integer id = rs.getInt("id");
              String p_name = rs.getString("p_name");
              String company = rs.getString("company");
              String address = rs.getString("address");

              People p = new People(id,p_name,company,address);
              list.add(p);
            }
            lView.setItems(list);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void find(){
        selectID = lView.getSelectionModel().getSelectedItem();
        try{
            Parent number = FXMLLoader.load(getClass().getResource("number.fxml"));
            Main.mainStage.getScene().setRoot(number);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
