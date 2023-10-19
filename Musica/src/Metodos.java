public class Metodos {
    public static void main(String[] args) {
        Audio minhaMusica = new Audio("I wonder (kenye west)", 240);

        minhaMusica.tocar();
        minhaMusica.curtir();

        System.out.println("Título: " + minhaMusica.getTitulo());
        System.out.println("Duração: " + minhaMusica.getDuracao() + " segundos");
        System.out.println("Total de Reproduções: " + minhaMusica.getTotalReproducao());
        System.out.println("Curtidas: " + minhaMusica.getCurtidas());
        System.out.println("Classificação: " + minhaMusica.getClassificacao());
    }
}