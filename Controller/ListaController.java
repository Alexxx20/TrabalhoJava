package Controller;

import View.Palco;
import dao.AlunoDAO;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Aluno;


public class ListaController implements Initializable {
    
    @FXML private TableView<Aluno> tabela;
    @FXML private TableColumn<Aluno, String> nome;
    @FXML private TableColumn<Aluno, Integer> n;
    @FXML private TableColumn<Aluno, String> local;
    
    
    @FXML
    void cadastrar() {
        Palco.cadastro();
    }
    @FXML
    void home() {
        Palco.home();
    }
    @FXML
    void atu(){
        initTable();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initTable();
    }    
    private void initTable(){
        nome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        n.setCellValueFactory(new PropertyValueFactory<>("numero"));
        local.setCellValueFactory(new PropertyValueFactory<>("computador"));

        try {
            ArrayList<Aluno> lista = AlunoDAO.pesquisarAll();
            tabela.setItems(FXCollections.observableArrayList(lista));
        } catch (SQLException ex) {
        }
    }
}
