package model;

import dao.AlunoDAO;
import java.sql.SQLException;

public class Aluno {
    private String nome;
    private String computador;
    private int numero;
    
    public String getComputador() {
        return computador;
    }

    public void setComputador(String computador) {
        this.computador = computador;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void addAluno(Aluno a) throws SQLException{
        AlunoDAO dao = new AlunoDAO();
        dao.addBanco(a);
    }
}
