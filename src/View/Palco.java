package View;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Palco extends Application {
    
    private static Stage palco;
    private static Scene login;
    private static Scene cadastro;
    private static Scene home;
    private static Scene lista;

    
    @Override
    public void start(Stage primaryStage) {
        try {
            palco = primaryStage;
            
            Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
            home = new Scene(root);
            
            root = FXMLLoader.load(getClass().getResource("Cad.fxml"));
            login = new Scene(root);
            
            root = FXMLLoader.load(getClass().getResource("cadastro.fxml"));
            cadastro = new Scene(root);
            
            root = FXMLLoader.load(getClass().getResource("Lista.fxml"));
            lista = new Scene(root);
            
            primaryStage.setTitle("");
            primaryStage.setScene(login);
            primaryStage.show();
        } catch (IOException ex) {}
        
    }
    
    public static void home(){
        palco.setScene(home);
    }   
    
    public static void login(){
        palco.setScene(login);
    }

    public static void cadastro() {
        palco.setScene(cadastro); 
    }
    
    public static void lista(){
        palco.setScene(lista);
    }
    
     public static void main(String[] args) {
        launch(args);
    }
    
}
