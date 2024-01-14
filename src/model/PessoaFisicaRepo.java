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
public class PessoaFisicaRepo {

    //Lista pessoa fisica
    private List<PessoaFisica> listaPessoasFisicas;

    //Construtor da classe PessoaFisicaRepo
    public PessoaFisicaRepo() {
        this.listaPessoasFisicas = new ArrayList<>();
    }

    //Metodo para inserir uma pessoa fisica
    public void inserirPessoaFisica(PessoaFisica pessoaFisica) {
        listaPessoasFisicas.add(pessoaFisica);
    }

    //Faz uma pesquisa em pessoa fisica para inserir a alteração
    public void alterarPessoaFisica(int index, PessoaFisica pessoaFisica) {
        if (index >= 0 && index < listaPessoasFisicas.size()) {
            listaPessoasFisicas.set(index, pessoaFisica);
        }
    }

    //Exclui pessoa fisica
    public void excluirPessoaFisica(int index) {
        if (index >= 0 && index < listaPessoasFisicas.size()) {
            listaPessoasFisicas.remove(index);
        }
    }

    //Obtem uma pessoa fisica específica
    public PessoaFisica obterPessoaFisica(int index) {
        if (index >= 0 && index < listaPessoasFisicas.size()) {
            return listaPessoasFisicas.get(index);
        }
        return null;
    }

    //Lista todas as pessoas fisicas
    public List<PessoaFisica> obterTodos() {
        return new ArrayList<>(listaPessoasFisicas);
    }

    //Serialização para converter os objetos em bytes antes de escrevê-los no arquivo.
    public void persistir(String nomeArquivo) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            outputStream.writeObject(listaPessoasFisicas);
        }
    }

    //Recuperar uma lista de objetos
    public void recuperar(String nomeArquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            listaPessoasFisicas = (List<PessoaFisica>) inputStream.readObject();
        }
    }
}
