package co.edu.uniquindio.poo;

public class AdaptadorCalculadora implements CalculadoraEnteros{
    private CalculadoraDecimales calculadoraDecimales;

    public AdaptadorCalculadora() {
        this.calculadoraDecimales = new CalculadoraDecimal();
    }

    @Override
    public int sumar(int numero1, int numero2) {
        double real1 = adaptar(numero1); double real2 = adaptar(numero2);
        return (int) calculadoraDecimales.sumar(real1, real2);
    }

    public double sumar(double numero1, double numero2){
        return calculadoraDecimales.sumar(numero1, numero2);
    }

    private double adaptar(Integer numero){
        return numero.doubleValue();
    }


}
