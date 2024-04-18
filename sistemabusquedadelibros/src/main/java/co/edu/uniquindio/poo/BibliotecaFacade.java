package co.edu.uniquindio.poo;

import java.util.List;

public class BibliotecaFacade {
    private BuscadorLibro buscador;

    public BibliotecaFacade(List<Libro> libros){
        this.buscador = new BuscadorLibro(libros);
    }

    public Libro buscarPorTitulo(String titulo){
        Libro libro = buscador.buscarPorTitulo(titulo);
        return libro;
    }

    public Libro buscarPorAutor(String autor){
        Libro libro = buscador.buscarPorAutor(autor);
        return libro;
    }

    public Libro buscarPorCategoria(String categoria){
        Libro libro = buscador.buscarPorCategoria(categoria);
        return libro;
    }
}