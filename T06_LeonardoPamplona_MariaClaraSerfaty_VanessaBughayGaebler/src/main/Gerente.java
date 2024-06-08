package main;

package 

// Subclasse Gerente
public class Gerente extends Funcionario {
    private final int numPessoasGerenciadas;

    // Construtor da classe Gerente
    public Gerente(String nome, double salario, int numPessoasGerenciadas) {
        super(nome, salario);
        this.numPessoasGerenciadas = numPessoasGerenciadas;
    }

    // Implementação do método getBonus para Gerente
    @Override
    public double getBonus() {
        return 2 * salario + 100 * numPessoasGerenciadas;
    }
}