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
public class PessoaJuridica extends Pessoa implements Serializable {

    private String CNPJ;

    public PessoaJuridica() {

    }

    public PessoaJuridica(String CNPJ, int id, String nome) {
        super(id, nome);
        setCNPJ(CNPJ);
    }

    /**
     * @return the CNPJ
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("CNPJ: " + CNPJ);
    }

}
