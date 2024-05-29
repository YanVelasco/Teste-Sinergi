package org.example.domain;

public class Vendedor extends Funcionario implements FuncionarioComissionado {
    private double valorVendido;
    private String dataUltimaVenda;
    private int anosDeServico;

    public Vendedor(String nome, double salarioBase, double beneficio, String dataContratacao, double valorVendido, String dataUltimaVenda, int anosDeServico) {
        super(nome, salarioBase, beneficio, dataContratacao);
        this.valorVendido = valorVendido;
        this.dataUltimaVenda = dataUltimaVenda;
        this.anosDeServico = anosDeServico;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public String getDataUltimaVenda() {
        return dataUltimaVenda;
    }

    @Override
    public double calcularSalarioTotal() {
        double salarioAnual = getSalarioBase() + (anosDeServico * 1800);
        return salarioAnual + calcularComissao();
    }

    @Override
    public double calcularComissao() {
        return valorVendido * 0.3;
    }
}