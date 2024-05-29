package org.example.domain;

public class Vendedor extends Funcionario implements FuncionarioComissionado {
    private double valorVendido;
    private String dataUltimaVenda;

    public Vendedor(String nome, double salarioBase, double beneficio, String dataContratacao, double valorVendido, String dataUltimaVenda) {
        super(nome, salarioBase, beneficio, dataContratacao);
        this.valorVendido = valorVendido;
        this.dataUltimaVenda = dataUltimaVenda;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public String getDataUltimaVenda() {
        return dataUltimaVenda;
    }

    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() + getBeneficio() + calcularComissao();
    }

    @Override
    public double calcularComissao() {
        return valorVendido * 0.1;
    }
}
