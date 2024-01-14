/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maykel
 */
public class PessoaJuridicaRepo {

    //Lista para pessoa juridica
    private List<PessoaJuridica> listaPessoasJuridicas;

    //Construtos pessoaJuridicaRepo
    public PessoaJuridicaRepo() {
        this.listaPessoasJuridicas = new ArrayList<>(); //Lista pessoas juridicas
    }

    //Metodo para inserir Pessoa Juridica
    public void inserirPessoaJuridica(PessoaJuridica pessoaJuridica) {
        listaPessoasJuridicas.add(pessoaJuridica);
    }

    //Função que altera pessoa jurifica, faz a pesquisa, se achar altera o valor
    public void alterarPessoaJuridica(int index, PessoaJuridica pessoaJuridica) {
        if (index >= 0 && index < listaPessoasJuridicas.size()) {
            listaPessoasJuridicas.set(index, pessoaJuridica);
        }
    }

    //Função para excluir pessoa juridica.
    public void excluirPessoaJuridica(int index) {
        if (index >= 0 && index < listaPessoasJuridicas.size()) {
            listaPessoasJuridicas.remove(index);
        }
    }

    //Função para obter uma pessoa juridica.
    public PessoaJuridica obterPessoaJuridica(int index) {
        if (index >= 0 && index < listaPessoasJuridicas.size()) {
            return listaPessoasJuridicas.get(index);
        }
        return null;
    }

    //Lista todas as pessoas juridicas
    public List<PessoaJuridica> obterTodos() {
        return new ArrayList<>(listaPessoasJuridicas);
    }

    //Serialização para converter os objetos em bytes antes de escrevê-los no arquivo.
    public void persistir(String nomeArquivo) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            outputStream.writeObject(listaPessoasJuridicas);
        }
    }

    //Recuperar uma lista de objetos
    public void recuperar(String nomeArquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            listaPessoasJuridicas = (List<PessoaJuridica>) inputStream.readObject();
        }
    }
}
