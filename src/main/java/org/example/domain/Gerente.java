package org.example.domain;

public class Gerente extends Funcionario {

    private int anosDeServico;

    public Gerente(String nome, double salarioBase, String dataContratacao, int anosDeServico) {
        super(nome, salarioBase, 0, dataContratacao); // No benefits for Manager
        this.anosDeServico = anosDeServico;
    }

    @Override
    public double calcularSalarioTotal() {
        double salarioAnual = getSalarioBase() + (anosDeServico * 3000);
        return salarioAnual;
    }
}