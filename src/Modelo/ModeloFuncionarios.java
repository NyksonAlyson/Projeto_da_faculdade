/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author nykso
 */
public class ModeloFuncionarios {

    /**
     * @return the cargo
     */
    public String getCargo() {    
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the sexo
     */
    public int getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the servico
     */
    public int getServico() {
        return servico;
    }

    /**
     * @param servico the servico to set
     */
    public void setServico(int servico) {
        this.servico = servico;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the qualificacao
     */
    public int getQualificacao() {
        return qualificacao;
    }

    /**
     * @param qualificacao the qualificacao to set
     */
    public void setQualificacao(int qualificacao) {
        this.qualificacao = qualificacao;
    }
   private String cargo;
   private int sexo;
   private int servico;
   private double salario;;
   private int qualificacao;    
}
