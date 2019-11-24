package jv2_assignment1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Listsp implements Initializable {
    public TableView<AddProduct> tbView = new TableView<>();
    public TableColumn<AddProduct,String> txtname = new TableColumn<>();
    public TableColumn<AddProduct,String> txtma = new TableColumn<>();
    public TableColumn<AddProduct,String> txtgia = new TableColumn<>();
    public TableColumn<AddProduct,String> txtsl = new TableColumn<>();

    public static ObservableList<AddProduct> list = FXCollections.observableArrayList();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtname.setCellValueFactory(new PropertyValueFactory<>("name"));
        txtma.setCellValueFactory(new PropertyValueFactory<>("ma"));
        txtgia.setCellValueFactory(new PropertyValueFactory<>("gia"));
        txtsl.setCellValueFactory(new PropertyValueFactory<>("soluong"));

        tbView.setItems(list);

    }

    public void addProduct(){
        try {
            Parent form = FXMLLoader.load(getClass().getResource("form.fxml"));
            Main.mainStage.getScene().setRoot(form);
        }catch (Exception e){
        System.out.println(e.getMessage());
        }
    }

}
