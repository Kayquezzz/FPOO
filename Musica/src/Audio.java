public class Audio {
    private String titulo;
    private int duracao;
    private int totalReproducao;
    private int curtidas;
    private double classificacao;

    public Audio(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.totalReproducao = 0;
        this.curtidas = 1200;
        this.classificacao = 0.0;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void tocar() {
        totalReproducao++;
    }

    public void curtir() {
        curtidas++;
    }
}



