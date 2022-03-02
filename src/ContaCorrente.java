public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        super.identificador = "C";
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA CORRENTE ===");
        super.imprimirExtrato();
    }
}
