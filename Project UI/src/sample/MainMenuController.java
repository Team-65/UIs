package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Created by Adonay on 3/27/2017.
 */
public class MainMenuController{

    private FXMLLoader fxmlLoader;

    private String username;


    public void setUsername(String username) {
        this.username = username;

    }

    @FXML
    private Button openSearchButton, openInboxButton, createNewApplicationButton, logOutButton;

    /**
     *This is the code that figures out where the UI will go when certain buttons are clicked. Right now, the only
     * transition that can be seen from this is an instant change and deletion of the different panels.
     * @param e - action that activates the changing menu procedure, i.e. clicking on a button in the menu
     */
    public void buttonClicked(ActionEvent e) {
        try{
            if(e.getSource() == openSearchButton){
                fxmlLoader = new FXMLLoader(getClass().getResource("SearchMenu.fxml"));
                ((Node)(e.getSource())).getScene().getWindow().hide();

            }else if(e.getSource() == openInboxButton){
                fxmlLoader = new FXMLLoader(getClass().getResource("WorkFlow.fxml"));
                ((Node)(e.getSource())).getScene().getWindow().hide();

            }else if(e.getSource() == createNewApplicationButton){
                fxmlLoader = new FXMLLoader(getClass().getResource("NewApp.fxml"));
                ((Node)(e.getSource())).getScene().getWindow().hide();

            }else if(e.getSource() == logOutButton){
                fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
                ((Node)(e.getSource())).getScene().getWindow().hide();

            }else{
                fxmlLoader = new FXMLLoader(getClass().getResource("ErrorState.fxml"));
                ((Node)(e.getSource())).getScene().getWindow().hide();
            }
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Search");
            stage.setScene(new Scene(root1));
            stage.show();
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

}
