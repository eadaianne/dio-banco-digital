public abstract class Conta implements InterfaceConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected Cliente cliente;

    protected int agencia;
    protected int numero;
    protected String identificador;
    protected double saldo;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Identificador: " + this.identificador);
        System.out.printf("Saldo: %.2f %n", this.saldo);
        System.out.println("\n");
    }
}