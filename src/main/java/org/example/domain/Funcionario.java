package org.example.domain;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;
    private double beneficio;
    private String dataContratacao;

    public Funcionario(String nome, double salarioBase, double beneficio, String dataContratacao) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.beneficio = beneficio;
        this.dataContratacao = dataContratacao;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getBeneficio() {
        return beneficio;
    }

    public abstract double calcularSalarioTotal();
}
