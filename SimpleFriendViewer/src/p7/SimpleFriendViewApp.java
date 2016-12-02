/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import p7.controller.ViewFriendController;
import p7.model.Friend;

/**
 *
 * @author luckyteo
 */
public class SimpleFriendViewApp extends Application {
    
    @Override
    public void start (Stage primaryStage){
        
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/p7/view/viewFriend.fxml"));
            Pane root = loader.load();
            
            //Controller
            ViewFriendController ctrl = loader.getController();
            ctrl.setMainApp(this);
            
            //Scene
            Scene scene = new Scene(root,900,700);
            primaryStage.setTitle ("Friends Viewer");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);  
    }
    
}
