public class Libro {
    protected String titulo;
    protected String autor;
    protected int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public void imprimirInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Año De Salida: " + anioPublicacion);
    }
}
