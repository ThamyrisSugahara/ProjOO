public class Push implements Notificacao {
    @Override
    public void notificar(String mensagem) {
        Configurar config = Configurar.getInstance();
        System.out.println("Enviando Push");
    }

}
