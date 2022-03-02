import java.util.ArrayList;
import java.util.Scanner;

public class master {
    public static ArrayList<Conta> contas = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("=== MENU === \n");
        System.out.println("1) Para criar uma nova conta corrente.\n" +
                "2) Para criar uma nova conta poupança.\n" +
                "3) Para imprimir o extrato de uma conta.\n" +
                "4) Para realizar um depósito.\n" +
                "5) Para realizar um saque.\n" +
                "6) Para realizar uma transferência.\n" +
                "7) Para encerrar a aplicação.\n");

        Scanner leitor = new Scanner(System.in);
        int i = leitor.nextInt();

        while (i != 7) {
            switch (i) {
                case 1 -> {
                    System.out.println("Insira o nome do titular.");
                    Cliente novo = new Cliente();
                    Conta cc = new ContaCorrente(novo);
                    cc.imprimirExtrato();
                    contas.add(cc);
                    i = leitor.nextInt();
                }
                case 2 -> {
                    System.out.println("Insira o nome do titular.");
                    Cliente nova = new Cliente();
                    Conta cp = new ContaPoupanca(nova);
                    cp.imprimirExtrato();
                    contas.add(cp);
                    i = leitor.nextInt();
                }
                case 3 -> {
                    System.out.println("Informe numero da conta.");
                    int numero = leitor.nextInt();
                    if (numero <= 0) {
                        System.out.println("Número de conta inválido!");
                    } else {
                        Conta cc = contas.get(numero - 1);
                        cc.imprimirExtrato();
                        i = leitor.nextInt();
                    }
                }
                case 4 -> {
                    System.out.println("Informe a conta e o valor a ser depositado.");
                    int contaAlvo = leitor.nextInt();
                    double valor = leitor.nextDouble();
                    Conta ca = contas.get(contaAlvo - 1);
                    ca.depositar(valor, ca);
                    ca.imprimirExtrato();
                    i = leitor.nextInt();
                }
                case 5 -> {
                    System.out.println("Informe a conta e o valor a ser sacado.");
                    int contaAlvo = leitor.nextInt();
                    double valor = leitor.nextDouble();
                    Conta ca = contas.get(contaAlvo - 1);
                    ca.sacar(valor, ca);
                    ca.imprimirExtrato();
                    i = leitor.nextInt();
                }
                case 6 -> {
                    System.out.println("Informe o valor a ser transferido, a conta fonte e a conta destino.");
                    double valor = leitor.nextDouble();
                    int contaFonte = leitor.nextInt();
                    int contaDestino = leitor.nextInt();
                    Conta cf = contas.get(contaFonte - 1);
                    Conta cd = contas.get(contaDestino - 1);
                    cf.transferir(valor, cf, cd);
                    cf.imprimirExtrato();
                    i = leitor.nextInt();
                }
                default -> System.out.println("Informe um número válido");
            }
        }
    }
}