package helloworldproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


public class TestController implements Initializable {

    @FXML
    private Label l1;
    void  printsHelloWorld(ActionEvent event){
        
        l1.setText("Hello World"); 
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }  
    public static void main(String[] args){
        
    }
    
}
