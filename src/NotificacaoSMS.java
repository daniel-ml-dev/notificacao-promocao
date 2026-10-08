// Estratégia concreta para envio por SMS.
public class NotificacaoSMS implements NotificacaoStrategy {
    @Override
    public void enviar(Promocao promocao, String destinatario) {
        System.out.println("[SMS] Para: " + destinatario
                + " | " + promocao.getTitulo() + " - " + promocao.getPercentualDesconto() + "% OFF");
    }
}
