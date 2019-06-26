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
import model.Aluno;

public class CadastroController implements Initializable {
    
    @FXML
    private TextField nome;

    @FXML
    private TextField nume;

    @FXML
    private TextField pc;


    @FXML
    void cadast() {
        try {
            Aluno a = new Aluno();
            a.setNome(nome.getText());
            a.setNumero(Integer.parseInt(nume.getText()));
            a.setComputador(pc.getText());
            AlunoDAO.addBanco(a);
            limpar();
            JOptionPane.showMessageDialog(null,"Seu cadastro foi realizado com sucesso!!!");
        } catch (SQLException ex) {
            
        }
        

    }
    
    @FXML
    void excluir() {
        Palco.excluir();
    }

    @FXML
    void listar() {
        Palco.lista();
    }

    @FXML
    void home() {
        Palco.home();
    }

    
    void limpar(){
        pc.setText(null);
        nome.setText(null);
        nume.setText(null);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
