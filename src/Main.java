public class Main {
    public static void main(String[] args) {
        Promocao promo = new Promocao("Black Friday", "Descontos em toda a loja", 50);

        CanalNotificacaoFacade canal = new CanalNotificacaoFacade();
        canal.notificarPorEmail(promo, "cliente@email.com");
        canal.notificarPorSMS(promo, "11999999999");
        canal.notificarPorPush(promo, "cliente_id_123");

        System.out.println("Total de notificações enviadas: " + canal.totalDeNotificacoes());
    }
}
