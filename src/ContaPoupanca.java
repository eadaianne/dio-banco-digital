public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        super.identificador = "P";
    }


    @Override
    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA POUPANÇA ===");
        super.imprimirExtrato();
    }
}
