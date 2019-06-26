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
    @FXML
    void listar() {
        Palco.lista();
    }
    @FXML
    void excluir(){
        Palco.excluir();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
 
    }    
    
}
