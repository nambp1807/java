package jv2_labsession8;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import jv2_session8.DataAccessObjectContact;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ContactList implements Initializable {
    public static Parent view;

    public ListView<Contact> listView = new ListView<>();

    public static Contact detail;

    private static ContactList instance;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(instance == null){
            instance = this;
        }

    }

    public void viewContact(){
        detail = listView.getSelectionModel().getSelectedItem();
        try {
            if(view == null){
                view = FXMLLoader.load(getClass().getResource("detail.fxml"));
            }
            ContactDetail.render();
            Main.mainStage.getScene().setRoot(view);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void render(){
        try {


            ObservableList<Contact> list  = FXCollections.observableArrayList();

            DataAccessObjectContact daoc = new DataAccessObjectContact();
            list.addAll(daoc.read());

            instance.listView.setItems(list);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void addContact(){
        try {
            Parent form  = FXMLLoader.load(getClass().getResource("add_contact.fxml"));
            Main.mainStage.getScene().setRoot(form);
        }catch (Exception e){}
    }
}
