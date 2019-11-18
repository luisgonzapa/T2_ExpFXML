/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejemplofxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author NewUser
 */

//Implementa la interfaz Initializable
public class FXMLDocumentController implements Initializable {
    
    //Prueba con variables global a la clase controladora
    private int contador=0;
    private String contador1="";
    
    //Esta notación significa que: esta propiedad ha sido llamada " label " en el documento fxml, hace referencia a dicha Label.
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private Label label2;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        contador++;
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        contador1=Integer.toString(contador);
        label.setText(contador1);
    }
    
    @Override
    //Sobreescribe dicho método. Inicializa las características de la lista.
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
