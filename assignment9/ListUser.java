package assignment9;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;

public class ListUser implements Initializable {
    public TableView<User> tableview = new TableView<>();
    public static ObservableList<User> List = FXCollections.observableArrayList();

    public TableColumn<User,String> name = new TableColumn<>();
    public TableColumn<User,Integer> age = new TableColumn<>();
    public TableColumn<User,String> email = new TableColumn<>();
    public TableColumn<User,String> address = new TableColumn<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("newuser.fxml"));
        UserController ucontrol = loader.getController();

        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        age.setCellValueFactory(new PropertyValueFactory<>("age"));
        email.setCellValueFactory(new PropertyValueFactory<>("email"));
        address.setCellValueFactory(new PropertyValueFactory<>("address"));

//        User u1 = new User("Long", 20, "toidayg", "HaNoi");
//        User u2 = new User("Long2", 20, "toidayg2", "HaNoi2");
//
//
//        List.add(u1);
//        List.add(u2);

        tableview.setItems(List);

    }

    public void addUser(){
        try{
            Parent newuser = FXMLLoader.load(getClass().getResource("newuser.fxml"));
            Main.mainStage.getScene().setRoot(newuser);
        } catch(Exception e){
            System.out.println("aa");
        }
    }

    public void sortAZ(){
        Collections.sort(List, (User u1, User u2) -> u1.getName().compareTo(u2.getName()));
    }

    public void sortZA(){
        Collections.sort(List, (User u1, User u2) -> -u1.getName().compareTo(u2.getName()));
    }


}
