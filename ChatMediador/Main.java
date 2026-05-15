public class Main {

    public static void main(String[] args) {

        ChatMediador chat = new ImpChatMediador();

        Usuario u1 = new UsuarioComum(chat, "Ana");
        Usuario u2 = new UsuarioComum(chat, "Thamy");
        Usuario u3 = new UsuarioComum(chat, "Maria");

        chat.adicionarUsuario(u1);
        chat.adicionarUsuario(u2);
        chat.adicionarUsuario(u3);

        u1.enviar("Ooi galera!");
    }
}