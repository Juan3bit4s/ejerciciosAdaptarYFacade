package co.edu.uniquindio.poo;

import java.util.List;
import java.util.function.Predicate;

public class BuscadorLibro {
    private List<Libro> libros;

    public BuscadorLibro(List<Libro> libros) {
        this.libros = libros;
    }

    public Libro buscarPorTitulo(String titulo){
        Predicate<Libro> condicion = libro->libro.getTitulo().contains(titulo);
        return libros.stream().filter(condicion).findFirst().get(); 
    }

    public Libro buscarPorAutor(String autor){
        Predicate<Libro> condicion = libro->libro.getAutor().contains(autor);
        return libros.stream().filter(condicion).findFirst().get(); 
    }

    public Libro buscarPorCategoria(String categoria){
        Predicate<Libro> condicion = libro->libro.getCategoria().contains(categoria);
        return libros.stream().filter(condicion).findFirst().get();
    }

}
