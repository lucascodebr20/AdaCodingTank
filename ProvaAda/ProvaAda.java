package ProvaAda;

import LisarbCity.Main;

import java.util.Random;

public class ProvaAda {

    public static void main(String[] args) {

        FaixaInss[] faixaInss = FaixaInss.values();
        FaixaImpostoRenda[] faixaIR = FaixaImpostoRenda.values();
        double[] arraySalarioBruto = new double[5];
        double[] arrayPagoInss = new double[5];
        double[] arrayPagoIR = new double[5];
        double[] arraySalarioliquido = new double[5];

        double salarioBruto = 5000;

        Random aleatorio = new Random();

        /*for (int i = 0; i < 5; i++) {
            arraySalarioBruto[i] = aleatorio.nextFloat() * 7000;
            System.out.printf("%.2f - ", arraySalarioBruto[i]);
        };*/

        System.out.println(aray);

        for (int i = 0; i < faixaInss.length; i++) {
            if (salarioBruto >= faixaInss[i].getValorMinimoINSS() &&
                    salarioBruto <= faixaInss[i].getValorMaximoINSS()) {
                arrayPagoInss[i] = faixaInss[i].getImpostoInss();
                System.out.printf("%.2f - ", arrayPagoInss[i]);
            }


    }


    public double CalcularDescontoImposto(double valorSalario, double porcentImposto) {
          double valorImposto = (porcentImposto / 100) * valorSalario;
          return valorSalario - valorImposto;
    };


    enum FaixaImpostoRenda {
        FAIXA1IR(0.0,1903.98,0),
        FAIXA2IR(1903.99 ,2826.65,7.5),
        FAIXA3IR(2826.66,3751.05,15),
        FAIXA4IR(3751.06,4664.68,22.5),
        FAIXA5IR(4664.68,99999999999.99,22.5);

        private final double valorMinimoIR;
        private final double valorMaximoIR;
        private final double impostoIR;

        FaixaImpostoRenda (double valorMinimoIR, double valorMaximoIR, double impostoIR) {
            this.valorMinimoIR = valorMinimoIR;
            this.valorMaximoIR = valorMaximoIR;
            this.impostoIR = impostoIR;
        }

        public double getValorMinimoIR(){
            return valorMinimoIR;
        }

        public double getValorMaximoIR(){
            return valorMaximoIR;
        }

        public double getImpostoIR(){
            return impostoIR;
        }

    }

    enum FaixaInss {
        FAIXA1INSS(0.0,1212.00,7.5),
        FAIXA2INSS(1212.01 ,2427.35,9),
        FAIXA3INSS(2427.36,3641.03,12),
        FAIXA4INSS(3641.04,7087.22,14),
        FAIXA5INSS(7087.22,99999999999.99,14);

        private final double ValorMinimoINSS;
        private final double valorMaximoINSS;
        private final double impostoInss;

        FaixaInss(double ValorMinimoINSS, double valorMaximoINSS, double impostoInss) {
            this.ValorMinimoINSS = ValorMinimoINSS;
            this.valorMaximoINSS = valorMaximoINSS;
            this.impostoInss = impostoInss;
        }

        public double getValorMinimoINSS(){
            return ValorMinimoINSS;
        }

        public double getValorMaximoINSS(){
            return valorMaximoINSS;
        }

        public double getImpostoInss(){
            return impostoInss;
        }

    }
}

