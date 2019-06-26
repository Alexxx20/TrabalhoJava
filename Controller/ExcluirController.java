package Controller;

import View.Palco;
import dao.AlunoDAO;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;


public class ExcluirController implements Initializable {
    @FXML private TextField fieldnumero;

    @FXML
    private void excluir() {
        try {
            AlunoDAO.deletar(Integer.parseInt(fieldnumero.getText()));
            fieldnumero.setText(null);
            JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Aluno não deletado");
        }
    }
    
    @FXML
    void home() {
        Palco.home();
    }

    @FXML
    void listar() {
        Palco.lista();
    }

    @FXML
    void cadastrar() {
        Palco.cadastro();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
