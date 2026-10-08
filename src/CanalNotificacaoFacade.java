// Facade: esconde a complexidade. O cliente só chama os métodos abaixo.
public class CanalNotificacaoFacade {
    private final GerenciadorNotificacoes gerenciador = GerenciadorNotificacoes.getInstance();

    public void notificarPorEmail(Promocao promocao, String email) {
        gerenciador.enviar(new NotificacaoEmail(), promocao, email);
    }

    public void notificarPorSMS(Promocao promocao, String telefone) {
        gerenciador.enviar(new NotificacaoSMS(), promocao, telefone);
    }

    public void notificarPorPush(Promocao promocao, String clienteId) {
        gerenciador.enviar(new NotificacaoPush(), promocao, clienteId);
    }

    public int totalDeNotificacoes() {
        return gerenciador.getTotalEnviadas();
    }
}
