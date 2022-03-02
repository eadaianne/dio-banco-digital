public class master {

    public static void main(String[] args) {
        Cliente joana = new Cliente();
        joana.setNome("Joana");

        Conta cc = new ContaCorrente(joana);
        Conta cp = new ContaPoupanca(joana);

        cc.depositar(100);
        cc.transferir(20, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }

}
