package Controller;

import dao.AlunoDAO;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import model.Aluno;

public class CadastroController implements Initializable {
    
    @FXML
    private TextField nome;

    @FXML
    private TextField nume;

    @FXML
    private PasswordField materias;


    @FXML
    void cadast() {
        try {
            JOptionPane.showMessageDialog(null,"Seu cadastro foi realizado com sucesso!!!");
            Aluno a = new Aluno();
            a.setNome(nome.getText());
            a.setNumero(Integer.parseInt(nume.getText()));
            a.setMateriais(materias.getText());
            AlunoDAO.addBanco(a);
            limpar();
        } catch (SQLException ex) {
            
        }
        

    }
    
    @FXML
    void home(){
    }

    
    void limpar(){
        materias.setText(null);
        nome.setText(null);
        nume.setText(null);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
