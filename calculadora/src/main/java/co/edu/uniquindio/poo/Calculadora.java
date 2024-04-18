package co.edu.uniquindio.poo;

public class Calculadora implements CalculadoraEnteros{
    private AdaptadorCalculadora adapter;

    
    public Calculadora() {
        this.adapter = new AdaptadorCalculadora();
    }


    @Override
    public int sumar(int numero1, int numero2) {
        return adapter.sumar(numero1, numero2);
    }

    public double sumar(double numero1, double numero2){
        return adapter.sumar(numero1, numero2);
    }
}
