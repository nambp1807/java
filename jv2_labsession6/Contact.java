package jv2_labsession6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Contact implements Initializable {
        @FXML
        ListView<PhoneNumber> listView = new ListView<>();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/labsesson6";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stm = conn.createStatement();
            String sql = "SELECT * FROM phone_number WHERE u_id ="+ListUser.selectID.getId()+";";
            ResultSet rs = stm.executeQuery(sql);

            ObservableList<PhoneNumber> listnumber = FXCollections.observableArrayList();

            while (rs.next()){
                Integer id = rs.getInt("id");
                String phone = rs.getString("phone");
                String type = rs.getString("type");
                Integer u_id = rs.getInt("u_id");

                PhoneNumber pn = new PhoneNumber(id,phone,type,u_id);
                listnumber.add(pn);
            }
            listView.setItems(listnumber);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
