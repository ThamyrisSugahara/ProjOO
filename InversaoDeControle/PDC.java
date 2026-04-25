import java.util.ArrayList;
import java.util.List;

public class PDC implements Subject {

    // Inversão de controle, o PDC não conhece Universidade, apenas a interface Observer
    private List<Observer> observadores;

    private String mensagem;
    private TipoVaga tipo;

    public PDC() {
        this.observadores = new ArrayList<>();
    }

    @Override
    public void adicionarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observer o : observadores) {
            o.atualizar(mensagem, tipo);
        }
    }

    public void novaVaga(String mensagem, TipoVaga tipo) {
        this.mensagem = mensagem;
        this.tipo = tipo;
        notificarObservadores();
    }
}