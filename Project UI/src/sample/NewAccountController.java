package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Adonay on 3/27/2017.
 */
public class NewAccountController {

    @FXML private TextField newUsernameField;
    @FXML private ChoiceBox accountChoiceBox;
    @FXML private Button back;


    private String newUsername;
    private String accountChoice;
    private FXMLLoader fxmlLoader;

    public void createAccount(ActionEvent event){

        newUsername = newUsernameField.getText();
        accountChoice = accountChoiceBox.getValue().toString();

    }


    public void buttonClicked (javafx.event.ActionEvent event){
        try {
            if(event.getSource() == back){
                fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
                ((Node)(event.getSource())).getScene().getWindow().hide();
            }
            Parent root1 = null;
            root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Login");
            stage.setScene(new Scene(root1));
            stage.show();

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }


}
