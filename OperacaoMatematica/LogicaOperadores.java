package OperacaoMatematica;

public class LogicaOperadores {

    public static double calcularOperacao(double x, double y, String op) {
        switch (op) {
            case "SOMA":
                return x + y;
            case "SUBTRACAO":
                return x - y;
            case "MULTIPLICACAO":
                return x * y;
            case "DIVISAO":
                return x / y;
            default:
                throw new IllegalStateException("Nao achamos o operador relacionao a " + op);
        }
    }
}
