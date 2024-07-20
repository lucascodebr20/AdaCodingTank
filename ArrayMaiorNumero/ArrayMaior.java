package ArrayMaiorNumero;
import java.util.Random;

public class ArrayMaior {

    public static void main(String[] args) {

        double[] array1 = new double[10];

        Random aleatorio = new Random();
        double maiorValor = 0;

        /* for (int i =0; i < 10; i ++) {
            array1[i] = aleatorio.nextFloat() * 100;
            System.out.printf("%.2f - ",array1[i]);
        } */

        for (int i =0; i < 10; i ++) {
            if (array1[i] > maiorValor) {
                maiorValor = array1[i];
            }
        }

        System.out.printf("O maior numero encontrato é %.2f ",maiorValor);

    }

}
