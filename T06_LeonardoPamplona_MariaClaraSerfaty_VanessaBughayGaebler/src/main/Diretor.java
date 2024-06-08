package main;

// Subclasse Diretor
public class Diretor extends Funcionario {
    private final int numDepartamentosGerenciados;

    // Construtor da classe Diretor
    public Diretor(String nome, double salario, int numDepartamentosGerenciados) {
        super(nome, salario);
        this.numDepartamentosGerenciados = numDepartamentosGerenciados;
    }

    // Implementação do método getBonus para Diretor
    @Override
    public double getBonus() {
        return 4 * salario + 3000 * numDepartamentosGerenciados;
    }
}

