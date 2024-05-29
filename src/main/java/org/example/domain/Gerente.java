package org.example.domain;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase, double beneficio, String dataContratacao) {
        super(nome, salarioBase, beneficio, dataContratacao);
    }

    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() + getBeneficio();
    }
}
