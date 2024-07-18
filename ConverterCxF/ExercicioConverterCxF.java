package ConverterCxF;

import java.util.Scanner;

public class ExercicioConverterCxF {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ola digita uma temperatura ?");
        double tempInicial = sc.nextDouble();
        sc.close();

        double valorConvertidoFinal = ConversorTemperatura(tempInicial);

        System.out.println("A temperatura inical registrada é de " + tempInicial + " Celsius");
        System.out.println("Convertendo em Fahrenheit registramos " + valorConvertidoFinal + " Fahrenheit");

    }

    public static double ConversorTemperatura(double x) {
        x = (x * 9 / 5) + 32;
        return x;
    }



}
