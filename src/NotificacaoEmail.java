// Estratégia concreta para envio por e-mail.
public class NotificacaoEmail implements NotificacaoStrategy {
    @Override
    public void enviar(Promocao promocao, String destinatario) {
        System.out.println("[EMAIL] Para: " + destinatario
                + " | " + promocao.getTitulo() + " - " + promocao.getDescricao()
                + " (" + promocao.getPercentualDesconto() + "% OFF)");
    }
}
