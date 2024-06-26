package co.edu.uniquindio.poo;


public class Libro {
    private String titulo;
    private String autor;
    private String categoria;

    public Libro(String titulo, String autor, String categoria) {
        this.titulo = titulo;
        assert titulo != null && !titulo.isBlank();
        this.autor = autor;
        assert autor != null && !autor.isBlank();
        this.categoria = categoria;
        assert categoria != null && !categoria.isBlank();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    @Override
    public String toString(){
        String mensaje = "Titulo: " + titulo + ".\nAutor: " + autor + ".\nCategoría: " + categoria + ".\n";
        return mensaje;
    }
    
    
}
