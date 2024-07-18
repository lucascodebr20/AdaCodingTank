package ConversorMoeda;

import java.util.Scanner;

public class ConverterMoeda {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ola digita um valor ?");
        double valorInicial = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite uma sigla para conversão: ");
        String siglaDigitada = sc.nextLine().toUpperCase();
        sc.close();

        TaxasCambio moeda = TaxasCambio.valueOf(siglaDigitada);

        double valorConvertido = ConversorMoedaSystem(valorInicial,moeda);

        System.out.printf("O valor incial era R$ %.2f %n", valorInicial);
        System.out.printf("O valor convertido ficou em %.2f %s%n", valorConvertido, siglaDigitada);

    }


    public static double ConversorMoedaSystem (double x, TaxasCambio moeda) {
        x = x / moeda.getcambio();
        return x;
    }

    enum TaxasCambio {
        USD(4.75),
        EUR(6.07),
        GBP(5.90),
        JPY(0.034),
        AUD(3.50),
        CAD(3.70),
        CHF(5.25),
        CNY(0.67),
        ARS(0.017),
        MXN(0.26);

        private final double cambio;

        TaxasCambio(double cambio){
            this.cambio = cambio;
        }

        public double getcambio(){
            return cambio;
        }
    }

}
