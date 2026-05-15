import java.util.ArrayList;
import java.util.List;

public class ImpChatMediador implements ChatMediador {

    private List<Usuario> usuarios;

    public ImpChatMediador() {
        usuarios = new ArrayList<>();
    }

    @Override
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario remetente) {

        for (Usuario u : usuarios) {

            // não envia pra quem mandou
            if (u != remetente) {
                u.receberMensagem(mensagem);
            }
        }
    }
}