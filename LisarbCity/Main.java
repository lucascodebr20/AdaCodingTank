package LisarbCity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ola, bem vindo ao sistema LisarbyTech");
        System.out.println("Digite o valor do seu salario");
        double salarioColetado = sc.nextDouble();

        sc.close();

        FaixaImposto[] array1 = FaixaImposto.values();

        System.out.println(array1[1].getValorMinimo());
        double porcentagemImposto = 0;

        for (int i = 0; i < array1.length; i++) {
            if (salarioColetado >= array1[i].getValorMinimo() &&
                    salarioColetado <= array1[i].getValorMaximo()) {
                porcentagemImposto = array1[i].getImpostoRenda();
            }
        }

        System.out.println(porcentagemImposto);

        double valorFinal = CalcularImposto(salarioColetado,porcentagemImposto);

        System.out.println("--- estamos calculando \n");
        System.out.printf("O seu salario atual é de R$ %.2f \n",salarioColetado);
        System.out.printf("Imposto pago: R$ %.2f \n",(salarioColetado - valorFinal));
        System.out.printf("O seu salario com desconto é de R$ %.2f \n", valorFinal);

    }

    public static double CalcularImposto(double x, double y) {
        double valorImposto = (y / 100) * x ;
        System.out.println(valorImposto);
        return x - valorImposto;
    };


    enum FaixaImposto {
        FAIXA1(0.0,2000.00,0),
        FAIXA2(2000.01,3000.00,8),
        FAIXA3(3000.01,4500.00,18),
        FAIXA4(4500.00,99999999.00,28);

        private final double valorMinimo;
        private final double valorMaximo;
        private final double impostoRenda;

        FaixaImposto(double valorMinimo, double valorMaximo, double impostoRenda) {
            this.valorMinimo = valorMinimo;
            this.valorMaximo = valorMaximo;
            this.impostoRenda = impostoRenda;
        }

        public double getValorMinimo(){
            return valorMinimo;
        }

        public double getValorMaximo(){
            return valorMaximo;
        }

        public double getImpostoRenda(){
            return impostoRenda;
        }

    }

}
