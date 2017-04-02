package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;
import java.io.IOException;

/**
 * Created by Sam Winter on 3/28/2017.
 */
public class NewLabelController {

    private FXMLLoader fxmlLoader;

    @FXML private Button backButton;

    public void buttonClicked (javafx.event.ActionEvent event){
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
