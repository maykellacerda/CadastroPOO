/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author maykel
 */
public class PessoaFisica extends Pessoa implements Serializable {
    
    private String CPF;
    private int idade;
    
    PessoaFisica() {
        
    }
    
    PessoaFisica(String CPF, int idade, int id, String nome) {
        super(id, nome);
        setCPF(CPF);
        setIdade(idade);
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public void exibir() {
        super.exibir();
        System.out.println("CPF: " + this.getCPF());
        System.out.println("Idade: " + this.getIdade());
    }
    
}
