package org.example;

import org.example.domain.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Secretario("Jorge Carvalho", 7000.0, 1000.0, "01/2018"));
        funcionarios.add(new Secretario("Maria Souza", 7000.0, 1000.0, "12/2015"));
        funcionarios.add(new Vendedor("Ana Silva", 12000.0, 1800.0, "12/2021", 5200.0, "12/2021"));
        funcionarios.add(new Vendedor("João Mendes", 12000.0, 1800.0, "12/2021", 3400.0, "12/2021"));
        funcionarios.add(new Gerente("Juliana Alves", 20000.0, 3000.0, "07/2017"));
        funcionarios.add(new Gerente("Bento Albino", 20000.0, 3000.0, "03/2014"));

        List<RegistroVenda> vendas = new ArrayList<>();
        vendas.add(new RegistroVenda("Ana Silva", 5200.0, "12/2021"));
        vendas.add(new RegistroVenda("Ana Silva", 4000.0, "01/2022"));
        vendas.add(new RegistroVenda("Ana Silva", 4200.0, "02/2022"));
        vendas.add(new RegistroVenda("Ana Silva", 5850.0, "03/2022"));
        vendas.add(new RegistroVenda("Ana Silva", 7000.0, "04/2022"));
        vendas.add(new RegistroVenda("João Mendes", 3400.0, "12/2021"));
        vendas.add(new RegistroVenda("João Mendes", 7700.0, "01/2022"));
        vendas.add(new RegistroVenda("João Mendes", 5000.0, "02/2022"));
        vendas.add(new RegistroVenda("João Mendes", 5900.0, "03/2022"));
        vendas.add(new RegistroVenda("João Mendes", 6500.0, "04/2022"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o mês (MM/AAAA): ");
        String mesAno = scanner.nextLine();

        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));

        FolhaDePagamento folhaDePagamento = new FolhaDePagamento(funcionarios);

        double valorTotalPago = folhaDePagamento.calcularTotalPago(mes, ano);
        System.out.println("Valor total pago: R$ " + String.format("%.2f", valorTotalPago));

        double valorTotalSalarios = folhaDePagamento.calcularTotalSalario(mes, ano);
        System.out.println("Valor total pago em salários: R$ " + String.format("%.2f", valorTotalSalarios));

        double valorTotalBeneficios = folhaDePagamento.calcularTotalBeneficio(mes, ano);
        System.out.println("Valor total pago em benefícios: R$ " + String.format("%.2f", valorTotalBeneficios));

        Funcionario funcionarioComMaiorPagamento = folhaDePagamento.encontrarFuncionarioComMaiorPagamento(mes, ano);
        System.out.println("Funcionário com maior pagamento: " + funcionarioComMaiorPagamento.getNome());

        Funcionario funcionarioComMaiorBeneficio = folhaDePagamento.encontrarFuncionarioComMaiorBeneficio(mes, ano);
        System.out.println("Funcionário com maior benefício: " + funcionarioComMaiorBeneficio.getNome());

        Funcionario vendedorComMaisVendas = folhaDePagamento.encontrarVendedorComMaisVendas(mes, ano);
        System.out.println("Vendedor que mais vendeu: " + vendedorComMaisVendas.getNome());

        folhaDePagamento.imprimirFolhaPagamento(mes, ano);
    }
}
