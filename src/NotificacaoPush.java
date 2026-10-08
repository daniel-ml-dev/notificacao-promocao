// Estratégia concreta para notificação push no app.
public class NotificacaoPush implements NotificacaoStrategy {
    @Override
    public void enviar(Promocao promocao, String destinatario) {
        System.out.println("[PUSH] Usuário: " + destinatario
                + " | " + promocao.getTitulo() + " - " + promocao.getPercentualDesconto() + "% OFF");
    }
}
