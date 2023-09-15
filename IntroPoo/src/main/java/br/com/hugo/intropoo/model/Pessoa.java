package br.com.hugo.intropoo.model;

public class Pessoa {

    // tem - atributo
    private String nome;
    private int idade;
    private double salario;

    // metodo construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    // faz - metodo - comportamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario > 0.0) {
            this.salario = salario;
        }
    }

    public void fazerAniversario() {
        idade++;
    }

    @Override // right click - generate - to String
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }
}
