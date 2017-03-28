package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Adonay on 3/26/2017.
 */
public class LoginController {

    @FXML
    private TextField usernameField, passwordField;
    @FXML
    private Button loginButton, guestLoginButton;
    @FXML
    private Hyperlink newAccountLink;

    private String username;
    private String password;


    public void login(ActionEvent event){

        username = usernameField.getText();
        password = passwordField.getText();

    }

    public void guestLogin(ActionEvent event){



    }

    public void createAccount(ActionEvent event){



    }

}
