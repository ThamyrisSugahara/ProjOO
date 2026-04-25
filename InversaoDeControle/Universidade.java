import java.util.HashSet;
import java.util.Set;

public class Universidade implements Observer {

    private String nome;
    private Set<TipoVaga> interesses;

    public Universidade(String nome) {
        this.nome = nome;
        this.interesses = new HashSet<>();
    }

    // Universidade escolhe quais tipos quer receber
    public void adicionarInteresse(TipoVaga tipo) {
        interesses.add(tipo);
    }

    @Override
    public void atualizar(String mensagem, TipoVaga tipo) {

        // só recebe se tiver interesse
        if (interesses.contains(tipo)) {
            System.out.println("[" + nome + "] recebeu vaga de " + tipo + ": " + mensagem);
        }
    }
}