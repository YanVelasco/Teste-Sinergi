package org.example.domain;

public class Secretario extends Funcionario {

    public Secretario(String nome, double salarioBase, double beneficio, String dataContratacao) {
        super(nome, salarioBase, beneficio, dataContratacao);
    }

    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() + getBeneficio();
    }
}
