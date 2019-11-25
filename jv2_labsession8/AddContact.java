package jv2_labsession8;

import javafx.scene.control.TextField;
import jv2_labsession6.People;
import jv2_session8.DataAccessObjectContact;

public class AddContact {
    public TextField txtName = new TextField();
    public TextField txtCom = new TextField();
    public TextField txtAddress = new TextField();

    public void submit(){
        People c = new People(null,txtName.getText(),
                txtCom.getText(),txtAddress.getText());

        DataAccessObjectContact dao = new DataAccessObjectContact();
        if(dao.create(c)){
            Main.mainStage.getScene().setRoot(Main.root);
            ContactList.render();
        }
    }
}
