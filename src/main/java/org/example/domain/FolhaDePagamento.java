package org.example.domain;

import java.util.List;

public class FolhaDePagamento {

    private List<Funcionario> funcionarios;

    public FolhaDePagamento(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public double calcularTotalPago(int mes, int ano) {
        double totalPago = 0.0;
        for (Funcionario funcionario : funcionarios) {
            totalPago += funcionario.calcularSalarioTotal();
        }
        return totalPago;
    }

    public double calcularTotalSalario(int mes, int ano) {
        double totalSalario = 0.0;
        for (Funcionario funcionario : funcionarios) {
            totalSalario += funcionario.getSalarioBase();
        }
        return totalSalario;
    }

    public double calcularTotalBeneficio(int mes, int ano) {
        double totalBeneficio = 0.0;
        for (Funcionario funcionario : funcionarios) {
            totalBeneficio += funcionario.getBeneficio();
        }
        return totalBeneficio;
    }

    public Funcionario encontrarFuncionarioComMaiorPagamento(int mes, int ano) {
        Funcionario funcionarioComMaiorPagamento = null;
        double maiorPagamento = 0.0;
        for (Funcionario funcionario : funcionarios) {
            double pagamentoFuncionario = funcionario.calcularSalarioTotal();
            if (pagamentoFuncionario > maiorPagamento) {
                maiorPagamento = pagamentoFuncionario;
                funcionarioComMaiorPagamento = funcionario;
            }
        }
        return funcionarioComMaiorPagamento;
    }

    public Funcionario encontrarFuncionarioComMaiorBeneficio(int mes, int ano) {
        Funcionario funcionarioComMaiorBeneficio = null;
        double maiorBeneficio = 0.0;
        for (Funcionario funcionario : funcionarios) {
            double beneficioFuncionario = funcionario.getBeneficio();
            if (beneficioFuncionario > maiorBeneficio) {
                maiorBeneficio = beneficioFuncionario;
                funcionarioComMaiorBeneficio = funcionario;
            }
        }
        return funcionarioComMaiorBeneficio;
    }

    public Funcionario encontrarVendedorComMaisVendas(int mes, int ano) {
        Vendedor vendedorComMaisVendas = null;
        double maiorVenda = 0.0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Vendedor) {
                Vendedor vendedor = (Vendedor) funcionario;
                if (vendedor.getValorVendido() > maiorVenda) {
                    maiorVenda = vendedor.getValorVendido();
                    vendedorComMaisVendas = vendedor;
                }
            }
        }
        return vendedorComMaisVendas;
    }

    public void imprimirFolhaPagamentoFuncionario(Funcionario funcionario, int mes, int ano) {
        System.out.println("===========================================");
        System.out.println("Folha de Pagamento - " + funcionario.getNome());
        System.out.println("Mês: " + mes + ", Ano: " + ano);
        System.out.println("===========================================");
        System.out.println("Salário Base: R$ " + String.format("%.2f", funcionario.getSalarioBase()));
        if (funcionario instanceof FuncionarioComissionado) {
            FuncionarioComissionado funcionarioComissionado = (FuncionarioComissionado) funcionario;
            System.out.println("Comissão: R$ " + String.format("%.2f", funcionarioComissionado.calcularComissao()));
        }
        if (funcionario.getBeneficio() > 0.0) {
            System.out.println("Benefício: R$ " + String.format("%.2f", funcionario.getBeneficio()));
        }
        System.out.println("Salário Líquido: R$ " + String.format("%.2f", funcionario.calcularSalarioTotal()));
        System.out.println("===========================================");
    }

    public void imprimirFolhaPagamento(int mes, int ano) {
        System.out.println("===========================================");
        System.out.println("Folha de Pagamento - Mês: " + mes + ", Ano: " + ano);
        System.out.println("===========================================");
        for (Funcionario funcionario : funcionarios) {
            imprimirFolhaPagamentoFuncionario(funcionario, mes, ano);
        }
    }
}
