package br.com.hugo.intropoo;

import br.com.hugo.intropoo.model.Pessoa;

public class Main {
    public static void main(String[] args) {
//        String[] nomes = new String[10];
//        int[] idades = new int[10];
//        double[] salarios = new double[10];

        // inicializar ou instanciar a pessoa
        Pessoa test = new Pessoa("Joao da Silva", 25, 1000);
        Pessoa pessoa = new Pessoa("Maria da Silva", 25);

//        pessoa.nome = "Maria";
//        pessoa.idade = 25;
        pessoa.setSalario(1050.0);
        pessoa.setSalario(-2);

//        test.nome = "Joao da Silva";
//        test.idade = 25;
//        test.salario = 1000.00;
        test.fazerAniversario();

        System.out.println(test);
        System.out.println(pessoa);
//        System.out.println(test.nome);
//        System.out.println(test.idade);
//        System.out.println(test.salario);
    }
}