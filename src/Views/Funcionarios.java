/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author nykso
 */
public class Funcionarios {
    
            private String cargo;

    public static final String PROP_CARGO = "cargo";

    /**
     * Get the value of cargo
     *
     * @return the value of cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Set the value of cargo
     *
     * @param cargo new value of cargo
     */
    public void setCargo(String cargo) {
        String oldCargo = this.cargo;
        this.cargo = cargo;
        propertyChangeSupport.firePropertyChange(PROP_CARGO, oldCargo, cargo);
    }

    private double salario;

    public static final String PROP_SALARIO = "salario";

    /**
     * Get the value of salario
     *
     * @return the value of salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Set the value of salario
     *
     * @param salario new value of salario
     */
    public void setSalario(double salario) {
        double oldSalario = this.salario;
        this.salario = salario;
        propertyChangeSupport.firePropertyChange(PROP_SALARIO, oldSalario, salario);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private int sexo;

    public static final String PROP_SEXO = "sexo";

    /**
     * Get the value of sexo
     *
     * @return the value of sexo
     */
    public int getSexo() {
        return sexo;
    }

    /**
     * Set the value of sexo
     *
     * @param sexo new value of sexo
     */
    public void setSexo(int sexo) {
        int oldSexo = this.sexo;
        this.sexo = sexo;
        propertyChangeSupport.firePropertyChange(PROP_SEXO, oldSexo, sexo);
    }

    private int servico;

    public static final String PROP_SERVICO = "servico";

    /**
     * Get the value of servico
     *
     * @return the value of servico
     */
    public int getServico() {
        return servico;
    }

    /**
     * Set the value of servico
     *
     * @param servico new value of servico
     */
    public void setServico(int servico) {
        int oldServico = this.servico;
        this.servico = servico;
        propertyChangeSupport.firePropertyChange(PROP_SERVICO, oldServico, servico);
    }

    private int qualificacao;

    public static final String PROP_QUALIFICACAO = "qualificacao";

    /**
     * Get the value of qualificacao
     *
     * @return the value of qualificacao
     */
    public int getQualificacao() {
        return qualificacao;
    }

    /**
     * Set the value of qualificacao
     *
     * @param qualificacao new value of qualificacao
     */
    public void setQualificacao(int qualificacao) {
        int oldQualificacao = this.qualificacao;
        this.qualificacao = qualificacao;
        propertyChangeSupport.firePropertyChange(PROP_QUALIFICACAO, oldQualificacao, qualificacao);
    }

}
