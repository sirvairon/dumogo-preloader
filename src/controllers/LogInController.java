/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author marcd
 */
public class LogInController implements Initializable {
    
    @FXML
    private Label labelLogInMissatge;
    @FXML
    private Button buttonLogin;
    @FXML
    private PasswordField passwordFieldPassword;
    @FXML
    private TextField textFieldUsuari;
    
    @FXML
    private void logInButtonAction(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        if(textFieldUsuari.getText().equals("admin")){
            Parent parent = FXMLLoader.load(getClass().getResource("/views/Admin.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Dumo-Go - Administrador");
            stage.show();
            //labelLogInMissatge.setText("OK");
        }else{
            Parent parent = FXMLLoader.load(getClass().getResource("/views/Main.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Dumo-Go");
            stage.show();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
