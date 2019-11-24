package jv2_assignment2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class ListStudent implements Initializable {
        public TableView<Student> tbView = new TableView<>();
        public TableColumn<Student,String> txtname = new TableColumn<>();
        public TableColumn<Student,String> txtage = new TableColumn<>();
        public TableColumn<Student,String> txtmark = new TableColumn<>();

        public static ObservableList<Student> list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtname.setCellValueFactory(new PropertyValueFactory<>("name"));
        txtage.setCellValueFactory(new PropertyValueFactory<>("age"));
        txtmark.setCellValueFactory(new PropertyValueFactory<>("mark"));

        tbView.setItems(list);
    }
}
