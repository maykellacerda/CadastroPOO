/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Main {

    public static void main(String[] args) {
        // Instanciar um repositório de pessoas físicas (repo1).
        PessoaFisicaRepo repo1 = new PessoaFisicaRepo();

        // Adicionar duas pessoas físicas, utilizando o construtor completo.
        PessoaFisica pessoaFisica1 = new PessoaFisica("12345678901", 25, 1, "João Silva");
        PessoaFisica pessoaFisica2 = new PessoaFisica("98765432109", 30, 2, "Maria Souza");
        repo1.inserirPessoaFisica(pessoaFisica1);
        repo1.inserirPessoaFisica(pessoaFisica2);

        // Invocar o método de persistência em repo1, fornecendo um nome de arquivo fixo.
        String nomeArquivoPessoaFisica = "pessoasFisicas.dat";
        try {
            repo1.persistir(nomeArquivoPessoaFisica);
        } catch (Exception e) {
            System.out.println("Erro ao persistir pessoas físicas: " + e.getMessage());
        }

        // Instanciar outro repositório de pessoas físicas (repo2).
        PessoaFisicaRepo repo2 = new PessoaFisicaRepo();

        // Invocar o método de recuperação em repo2, fornecendo o mesmo nome de arquivo.
        try {
            repo2.recuperar(nomeArquivoPessoaFisica);
        } catch (Exception e) {
            System.out.println("Erro ao recuperar pessoas físicas: " + e.getMessage());
        }

        // Exibir os dados de todas as pessoas físicas recuperadas.
        System.out.println("Dados Pessoa Fisica Armazenado.");
        System.out.println("Dados Pessoa Física Recuperados");
        for (PessoaFisica pessoa : repo2.obterTodos()) {
            pessoa.exibir();
        }

        // Instanciar um repositório de pessoas jurídicas (repo3).
        PessoaJuridicaRepo repo3 = new PessoaJuridicaRepo();

        // Adicionar duas pessoas jurídicas, utilizando o construtor completo.
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("12345678901234", 3, "Empresa A");
        PessoaJuridica pessoaJuridica2 = new PessoaJuridica("98765432109876", 4, "Empresa B");
        repo3.inserirPessoaJuridica(pessoaJuridica1);
        repo3.inserirPessoaJuridica(pessoaJuridica2);

        // Invocar o método de persistência em repo3, fornecendo um nome de arquivo fixo.
        String nomeArquivoPessoaJuridica = "pessoasJuridicas.dat";
        try {
            repo3.persistir(nomeArquivoPessoaJuridica);
        } catch (Exception e) {
            System.out.println("Erro ao persistir pessoas jurídicas: " + e.getMessage());
        }

        // Instanciar outro repositório de pessoas jurídicas (repo4).
        PessoaJuridicaRepo repo4 = new PessoaJuridicaRepo();

        // Invocar o método de recuperação em repo4, fornecendo o mesmo nome de arquivo.
        try {
            repo4.recuperar(nomeArquivoPessoaJuridica);
        } catch (Exception e) {
            System.out.println("Erro ao recuperar pessoas jurídicas: " + e.getMessage());
        }

        // Exibir os dados de todas as pessoas jurídicas recuperadas.
         System.out.println("Dados Pessoa Jurídica Recuperados.");
        System.out.println("Dados Pessoa Jurídica Armazenados.");
        for (PessoaJuridica pessoa : repo4.obterTodos()) {
            pessoa.exibir();
        }
    }
}
