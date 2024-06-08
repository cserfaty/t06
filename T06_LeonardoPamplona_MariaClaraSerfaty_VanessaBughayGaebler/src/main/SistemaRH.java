package main;

// Classe SistemaRH para gerenciar os funcionários e imprimir relatório
public class SistemaRH {
    // Método para imprimir o relatório dos funcionários
    public static void imprimeRelatorio(Funcionario[] listaFuncionarios) {
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println("Nome: " + funcionario.nome + " - Salário: " + funcionario.salario + " - Bônus: " + funcionario.getBonus());
        }
    }

    // Método principal para testar o sistema de RH
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];
        funcionarios[0] = new Gerente("João", 5000, 5);
        funcionarios[1] = new Diretor("Maria", 10000, 2);
        funcionarios[2] = new Analista("Pedro", 3000);

        imprimeRelatorio(funcionarios);
    }
}