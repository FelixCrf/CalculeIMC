package entities;

public class CalculoImc {
    public double peso;
    public double altura;


    // metodo para calcular o IMC
    public double calcularImc() {
        return peso / (Math.pow(altura, 2));
    }



}
