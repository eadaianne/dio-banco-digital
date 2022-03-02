import java.util.Scanner;

public class Cliente {

    private String nome;
    Scanner leitor = new Scanner(System.in);

    public Cliente() {
        nome = leitor.next();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
