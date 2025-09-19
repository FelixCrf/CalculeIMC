package application;

import entities.CalculoImc;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CalculoImc calculoImc = new CalculoImc();


        System.out.print("Coloque o seu Peso: ");
        calculoImc.peso = sc.nextDouble();

        System.out.println("Coloque a sua Altura: ");
        calculoImc.altura = sc.nextDouble();

        double imc = calculoImc.calcularImc();

        if (imc <= 18.50) {
            System.out.printf("Seu índice de massa corporal é: %.2f%n", imc);
            System.out.println("Abaixo de 18,5   | Abaixo do peso");

        } else if (imc >= 18.60 && imc <= 24.90) {
            System.out.printf("Seu índice de massa corporal é: %.2f%n", imc);
            System.out.println("Entre 18,6 e 24,9 | Peso ideal (parabéns)");

        } else if (imc >= 25.00 && imc <= 29.90) {
            System.out.printf("Seu índice de massa corporal é: %.2f%n", imc);
            System.out.println("Entre 25,0 e 29,9 | Levemente acima do peso");

        } else if (imc >= 30.00 && imc <= 34.90) {
            System.out.printf("Seu índice de massa corporal é: %.2f%n", imc);
            System.out.println("Entre 30,0 e 34,9 | Obesidade grau I ");

        } else if (imc >= 35.00 && imc <= 39.90) {
            System.out.printf("Seu índice de massa corporal é: %.2f%n", imc);
            System.out.println("Entre 35,0 e 39,9 | Obesidade grau II (severa)");

        } else if (imc >= 40.00) {
            System.out.printf("Seu índice de massa corporal é: %.2f%n", imc);
            System.out.println("Maior ou igual a 40 | Obesidade grau III (mórbida)");

        }
    }
}
