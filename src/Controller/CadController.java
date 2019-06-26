package Controller;

import View.Palco;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class CadController implements Initializable {
    
    @FXML private TextField no;
    @FXML private PasswordField se;
    
    @FXML
    void entrar() {
        limpar();
        Palco.home();
    }
    
    public void limpar(){
        no.setText(null);
        se.setText(null);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
