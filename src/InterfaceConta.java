public interface InterfaceConta {

    void sacar(double valor, Conta contaAlvo);
    void depositar(double valor, Conta contaAlvo);
    void transferir(double valor, Conta contaFonte, Conta contaDestino);
    void imprimirExtrato();
}
