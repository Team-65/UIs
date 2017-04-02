package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

public class SearchMenuController {
    @FXML Button Back;
    @FXML Button Search;
    @FXML CheckBox IsWine;
    @FXML CheckBox IsBeer;
    @FXML CheckBox IsOther;
    @FXML TextField Tags;

    private FXMLLoader fxmlLoader;

    public void buttonClicked (javafx.event.ActionEvent event){
        try {
            if(event.getSource() == Back){
                fxmlLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
                ((Node)(event.getSource())).getScene().getWindow().hide();
            }
            if(event.getSource() == Search){
                fxmlLoader = new FXMLLoader(getClass().getResource("ErrorState.fxml"));
                ((Node)(event.getSource())).getScene().getWindow().hide();
            }



            Parent root1 = null;
            root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("MainMenu");
            stage.setScene(new Scene(root1));
            stage.show();

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}