/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package montadora;

import Conexão.DatabaseConnection;
import Telas.TelaCadastro;
import Telas.TelaCadastroVeiculo;
import Telas.TelaLogin;

/**
 *
 * @author Mad Malware
 */
public class Montadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DatabaseConnection c = new DatabaseConnection();
        c.getConnection();
        
        
        TelaLogin tela = new TelaLogin();
        TelaCadastro t = new TelaCadastro();
        t.setVisible(true);
        
        //DatabaseConnection c = new DatabaseConnection();
    }
    
}
