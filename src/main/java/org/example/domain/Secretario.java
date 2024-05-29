package org.example.domain;

public class Secretario extends Funcionario {
    private int anosDeServico;

    public Secretario(String nome, double salarioBase, double beneficio, String dataContratacao, int anosDeServico) {
        super(nome, salarioBase, beneficio, dataContratacao);
        this.anosDeServico = anosDeServico;
    }

    @Override
    public double calcularSalarioTotal() {
        double salarioAnual = getSalarioBase() + (anosDeServico * 1000);
        double beneficio = salarioAnual * 0.2;
        return salarioAnual + beneficio;
    }
}