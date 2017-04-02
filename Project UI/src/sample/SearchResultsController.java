package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

public class SearchResultsController {
    @FXML TableColumn IDno;
    @FXML TableColumn Name;
    @FXML TableColumn Company;
    @FXML TableColumn Type;
    @FXML TableColumn Date;
    @FXML Button downRes;
    @FXML Button startOver;
    private FXMLLoader fxmlLoader;

    public void buttonClicked (javafx.event.ActionEvent event){
        try {
            if(event.getSource() == startOver){
                fxmlLoader = new FXMLLoader(getClass().getResource("SearchMenu.fxml"));
                ((Node)(event.getSource())).getScene().getWindow().hide();
            }
            Parent root1 = null;
            root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("SearchMenu");
            stage.setScene(new Scene(root1));
            stage.show();

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
