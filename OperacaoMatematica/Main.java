package OperacaoMatematica;

import java.util.Scanner;

import static OperacaoMatematica.LogicaOperadores.calcularOperacao;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        double numeroA = sc.nextDouble();
        System.out.println("Digite o segundo numero");
        double numerob = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite o operador: + - * /");
        String operadorColetado = sc.nextLine();
        sc.close();

        OperadoresMatematicos1 sinal = (OperadoresMatematicos1)
                OperadoresMatematicos1.fromOperador(operadorColetado);

        System.out.println(sinal);

        double valorCalculado = calcularOperacao(numeroA,numerob, String.valueOf(sinal));

        System.out.println("----------------------------------");
        System.out.println(numeroA + " " + operadorColetado + " " +
                numerob + " = " + valorCalculado);

    }

    public enum OperadoresMatematicos1 {
        SOMA("+"),
        SUBTRACAO("-"),
        DIVISAO("/"),
        MULTIPLICACAO("*");


        private final String operador;

        OperadoresMatematicos1(String operador) {
            this.operador = operador;
        }

        public String getOperador(){
            return operador;
        }

        public static Object fromOperador(String operador) {
            for (OperadoresMatematicos1 op : values()) {
                if (op.getOperador().equals(operador)) {
                    return op;
                }
            }
            return null;
        }
    }

}
