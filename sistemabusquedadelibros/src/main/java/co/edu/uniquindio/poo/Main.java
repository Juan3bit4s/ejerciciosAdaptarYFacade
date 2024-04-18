package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    var libro1 = new Libro("Pez Locutor", "El JuanDi", "Drama");
    var libro2 = new Libro("La necesidad de una fémina", "J. E. Carcajada", "Terror");
    var libro3 = new Libro("El día que Artigas se emborrachó", "EL Cuarteto de Nos", "Comedia");

    List<Libro> libros = new ArrayList<>(); libros.add(libro1); libros.add(libro2); libros.add(libro3);

    var fachadaBiblioteca = new BibliotecaFacade(libros);

    var metodo1 = fachadaBiblioteca.buscarPorAutor("El JuanDi");
    System.out.println(metodo1.toString());
    
    var metodo2 = fachadaBiblioteca.buscarPorTitulo("La necesidad de una fémina");
    System.out.println(metodo2.toString());
    
    var metodo3 = fachadaBiblioteca.buscarPorCategoria("Comedia");
    System.out.println(metodo3.toString());
    }
}
