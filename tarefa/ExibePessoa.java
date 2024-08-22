package br.com.rpires.tarefa;

public class ExibePessoa {

    public static class Main {
        public static void main(String[] args) {
            PessoaFisica pessoaFisica = new PessoaFisica(
                    "João Silva",
                    "Rua A, 123",
                    "123.456.789-00",
                    "01/01/1990");
            PessoaJuridica pessoaJuridica = new PessoaJuridica(
                    "Empresa X",
                    "Avenida B, 456",
                    "12.345.678/0001-99",
                    "Empresa X LTDA");

            pessoaFisica.exibirInformacoes();
            System.out.println();
            pessoaJuridica.exibirInformacoes();
        }
    }

}
