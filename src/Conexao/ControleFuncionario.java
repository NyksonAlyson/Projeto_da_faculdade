/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import Modelo.ModeloFuncionarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nykso
 */
public class ControleFuncionario {

    
    ConectaBanco conex = new ConectaBanco();
    ModeloFuncionarios mod = new ModeloFuncionarios();
    
    
    public void Salvar(ModeloFuncionarios mod){
        conex.getConnection();
        
        try {
            PreparedStatement pst = conex.conn.prepareStatement("insert into funcionarios(cargo,sexo,servico,salario,qualificacao)values(?,?,?,?,?)");
            pst.setString(1,mod.getCargo());
            pst.setInt(2, mod.getSexo());
            pst.setInt(3, mod.getServico());
            pst.setDouble(4, mod.getSalario());
            pst.setInt(5,mod.getQualificacao());
            pst.execute();
            JOptionPane.showConfirmDialog(null,"Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null,"Erro ao inserir os dados!/nErro:"+ex);
        }
        
        conex.desconecta();
    }
}
