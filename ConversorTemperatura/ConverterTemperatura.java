package ConversorTemperatura;

import java.util.Scanner;

public class ConverterTemperatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua temperatura atual");
        double temperaturaDigitada = sc.nextDouble();
        System.out.println("Digite agora o modelo de temperatura");
        sc.nextLine();
        String modeloTempInicial = sc.nextLine().toUpperCase();
        System.out.println("Qual o modelo de temperatura deseja converter:");
        String modeloTempFinal = sc.nextLine().toUpperCase();
        sc.close(); // Fechamento do Scanner

        Double tempConvertida  = SystemConverterTemperatura.converterTemperatura
                (temperaturaDigitada, modeloTempInicial, modeloTempFinal);

        System.out.println("A temperatura autal é " + tempConvertida + " " + modeloTempFinal);

    }

    enum UnidadeTemperatura {
        KELVIN("K"),
        FAHRENHEIT("F"),
        CELSIUS("C");

        private final String simbol;

        UnidadeTemperatura(String simbol) {
            this.simbol = simbol;
        }

    }

}

