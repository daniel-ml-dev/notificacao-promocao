public class Promocao {
    private final String titulo;
    private final String descricao;
    private final int percentualDesconto;

    public Promocao(String titulo, String descricao, int percentualDesconto) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.percentualDesconto = percentualDesconto;
    }

    public String getTitulo() { return titulo; }
    public String getDescricao() { return descricao; }
    public int getPercentualDesconto() { return percentualDesconto; }
}
