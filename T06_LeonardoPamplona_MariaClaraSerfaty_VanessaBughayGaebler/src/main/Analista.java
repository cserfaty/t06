package main;

// Subclasse Analista
public class Analista extends Funcionario {
    // Construtor da classe Analista
    public Analista(String nome, double salario) {
        super(nome, salario);
    }

    // Implementação do método getBonus para Analista
    @Override
    public double getBonus() {
        return salario;
    }
}

