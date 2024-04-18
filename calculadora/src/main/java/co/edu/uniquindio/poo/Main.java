package co.edu.uniquindio.poo;



public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int resultado1 = calculadora.sumar(1, 4);

        System.out.println(resultado1);

        double resultado2 = calculadora.sumar(Math.E, Math.E);

        System.out.println(resultado2);
    }
}
