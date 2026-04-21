public class Email implements Notificacao {
    @Override
    public void notificar(String mensagem) {
        Configurar config = Configurar.getInstance();
        System.out.println("Enviando Email");
        config.ImprimeInformacoes();
    }

}
