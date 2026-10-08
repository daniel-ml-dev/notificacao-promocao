// Strategy: define o contrato que todos os canais de envio devem seguir.
public interface NotificacaoStrategy {
    void enviar(Promocao promocao, String destinatario);
}
