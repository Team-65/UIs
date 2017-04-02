package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class NewAppController {

    private FXMLLoader fxmlLoader;


    @FXML Button back, newApp;


    public void buttonClicked (javafx.event.ActionEvent event){
        try {
            if(event.getSource() == back){
                fxmlLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
                ((Node)(event.getSource())).getScene().getWindow().hide();

            }else if (event.getSource() == newApp) {
                fxmlLoader = new FXMLLoader(getClass().getResource("NewLabel.fxml"));
                ((Node) (event.getSource())).getScene().getWindow().hide();
            }

            Parent root1 = null;
            root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("MainMenu");
            stage.setScene(new Scene(root1));
            stage.show();

        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
