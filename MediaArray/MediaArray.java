package MediaArray;

import java.util.Arrays;

public class MediaArray {

    public static void main(String[] args) {

        int[] array1 = new int[10];
        int[] arrayNumeroPar = new int[10];
        int somatariaPar = 0;
        int contadorPar = 0;

        for (int i =0; i < 10; i ++) {
            int numeroAleatorio = (int) ((Math.random() * 20) + 1);
            array1[i] = numeroAleatorio;
        }

        for (int i = 0; i < array1.length; i ++) {
            System.out.printf(String.valueOf(array1[i] + " "));
            if (array1[i] % 2 == 0 && array1[i] >= 1) {
                arrayNumeroPar[i] = array1[i];
                somatariaPar += array1[i];
                contadorPar += 1;
            }
        }

        int resultadoCalculo = somatariaPar / contadorPar;

        System.out.println("");
        System.out.println("Vamos aos resultados");
        System.out.println("Foram encontrados " + contadorPar + " numeros pares");
        System.out.println("Sendo " + Arrays.toString(arrayNumeroPar));
        System.out.println("A media seria:" + resultadoCalculo);

    }
}
