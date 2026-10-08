// Singleton: garante uma única instância do gerenciador em toda a aplicação.
public class GerenciadorNotificacoes {
    private static GerenciadorNotificacoes instancia;
    private int totalEnviadas = 0;

    private GerenciadorNotificacoes() {
        // construtor privado: ninguém cria com "new" de fora da classe
    }

    public static synchronized GerenciadorNotificacoes getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorNotificacoes();
        }
        return instancia;
    }

    public void enviar(NotificacaoStrategy estrategia, Promocao promocao, String destinatario) {
        estrategia.enviar(promocao, destinatario);
        totalEnviadas++;
    }

    public int getTotalEnviadas() {
        return totalEnviadas;
    }
}
