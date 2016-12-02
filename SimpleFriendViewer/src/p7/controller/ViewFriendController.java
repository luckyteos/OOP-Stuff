/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import p7.SimpleFriendViewApp;
import p7.model.Friend;

/**
 * FXML Controller class
 *
 * @author luckyteo
 */
public class ViewFriendController implements Initializable {

    @FXML
    private Label lbNames;
    @FXML
    private Label lbContact;
    @FXML
    private Label lbLikes;
    @FXML
    private Button btnNext;
    @FXML
    private Button btnPrevious;
    @FXML
    private Button btnClose;
    
    private SimpleFriendViewApp mainApp;

    public SimpleFriendViewApp getMainApp() {
        return mainApp;
    }

    public void setMainApp(SimpleFriendViewApp mainApp) {
        this.mainApp = mainApp;
    }

    
    
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleNext(ActionEvent event) {
    }

    @FXML
    private void handlePrevious(ActionEvent event) {
    }

    @FXML
    private void handleClose(ActionEvent event) {
        Platform.exit();
    }
    
    public void showFriend (Friend f) {
        lbNames.setText(f.getName());
        lbContact.setText(f.getContact());
        lbLikes.setText(String.valueOf(f.getLikes()));
    }
}
