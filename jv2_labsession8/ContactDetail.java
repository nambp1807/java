package jv2_labsession8;



import connector.Connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;
import jv2_labsession6.People;
import jv2_session8.DataAccessObjectContact;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class ContactDetail implements Initializable {

    private static ContactDetail instance;

    public Text txt = new Text();
    public ListView<PhoneNumber> listView = new ListView<>();


    private String sql_txt = "SELECT * FROM phone_number WHERE c_id = ?";

    public static ObservableList<PhoneNumber> list = FXCollections.observableArrayList();
    public static Integer detail_id = 0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(instance == null){
            instance = this;
        }
    }

    public void back(){
        try {
            Main.mainStage.getScene().setRoot(Main.root);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void render(){
        instance.txt.setText(ContactList.detail.getContact_name());
        if(detail_id != ContactList.detail.getId()){
            try {
                Connector connector = Connector.getInstance();
                String sql = "SELECT * FROM phone_number WHERE c_id ="+ContactList.detail.getId();
                ResultSet rs = connector.getQuery(sql);
                list.clear();
                while (rs.next()){
                    Integer id = rs.getInt("id");
                    String tel = rs.getString("telephone");
                    String type = rs.getString("type");
                    PhoneNumber p = new PhoneNumber(id,tel,type);
                    list.add(p);
                }
                detail_id = ContactList.detail.getId();

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        instance.listView.setItems(list);
    }

    public void deleteContact(){
        People c = new People(detail_id,null,null,null);
        DataAccessObjectPhoneNumber daoN = new DataAccessObjectPhoneNumber();
        for (PhoneNumber p: list){
            daoN.delete(p);
        }
        DataAccessObjectContact daoC = new DataAccessObjectContact();
        daoC.delete(c);
        try {
            Main.mainStage.getScene().setRoot(Main.root);
            ContactList.render();
        }catch (Exception e){}
    }
}
