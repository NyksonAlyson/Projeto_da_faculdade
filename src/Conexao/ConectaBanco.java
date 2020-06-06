/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nykso
 */
public class ConectaBanco {

    
    public Statement stm; // responsavel por preparar e realizar pesquisas no banco de dados
    public ResultSet rs; // responsavel por armazenar o resultado de uma pesquisa
    private final String driver = "org.postgresql.Driver"; //responsavel por identificar o banco de dados
    private final String caminho = "jdbc:postgresql://localhost:5432/postgres"; // responsavel por setar o local do banco de dados
    private final String usuario = "postgres"; //login
    private final String senha = "@Bboy1504"; // senha
    public static Connection conn; // responsavel por realizar a getConnection com banco de dados
    
    public Connection getConnection(){ //metodo responsavel para realizar a conexão com o banco
        System.setProperty("jdbc.Drivers", driver); // seta a propiedade
        try {
            conn= DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "conectado com suesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! \n Erro:" + ex.getMessage());
         
        }
        return conn;
  }
  
    public void executaSql(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void desconecta(){ //metodo para fechar a getConnection com banco de dados
         try {
            conn.close(); //fecha a conexão
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão! \n Erro:" + ex.getMessage());
            
        }
        
    }
    
}
