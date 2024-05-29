package org.example.domain;

public class RegistroVenda {
    private String nomeVendedor;
    private double valorVenda;
    private String dataVenda;

    public RegistroVenda(String nomeVendedor, double valorVenda, String dataVenda) {
        this.nomeVendedor = nomeVendedor;
        this.valorVenda = valorVenda;
        this.dataVenda = dataVenda;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public String getDataVenda() {
        return dataVenda;
    }
}
