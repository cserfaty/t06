package main;

// Classe abstrata Funcionario
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    // Construtor da classe Funcionario
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método abstrato para calcular o bônus
    public abstract double getBonus();
}

