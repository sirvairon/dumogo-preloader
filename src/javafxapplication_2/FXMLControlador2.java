/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication_2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author marcd
 */
public class FXMLControlador2 implements Initializable {
    
    @FXML
    private Label labelLogInMissatge;
    @FXML
    private TextField textFieldUsuari, textFieldPassword;
    @FXML
    private Button buttonLogIn;
    
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private void pantallaPrincipal(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        //System.out.println("You clicked me!");
        //label.setText("Hello World!");
    }
    
    @FXML
    private void pantallaSecundaria(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("FXML2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        FadeTransition ft = new FadeTransition(Duration.millis(1000), root);
        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        ft.play();

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        //System.out.println("You clicked me!");
        //label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        labelLogInMissatge.setText("hola");
    }    
    
}
