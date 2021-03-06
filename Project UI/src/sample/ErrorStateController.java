package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Adonay on 3/27/2017.
 */
public class ErrorStateController {

    @FXML
    private Text errorMessageText;
    private Button continueButton;

    private FXMLLoader fxmlLoader;

    public void goBack(javafx.event.ActionEvent event){
        fxmlLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Parent root1 = null;
        try {
            root1 = fxmlLoader.load();
        } catch (IOException e){
            e.printStackTrace();
        }

        Stage stage = new Stage();
        stage.setTitle("MainMenu");
        stage.setScene(new Scene(root1));
        stage.show();


    }

}
