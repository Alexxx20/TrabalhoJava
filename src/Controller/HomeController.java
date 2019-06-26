package Controller;

import View.Palco;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class HomeController implements Initializable {

    @FXML
    void cadastrar() {
        Palco.cadastro();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
 
    }    
    
}
