package ExercicioAoVivo02;

import java.util.Random;
import java.util.Scanner;

public class NumeroDaSorte {

    public static void main(String[] args) {

        Random random = new Random();

        int numeroCorreto = 10;

        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int numeroUsuario;

        do {

            System.out.println("Digite um número: ");
            numeroUsuario = sc.nextInt();

            if ((numeroCorreto - numeroUsuario) == 1) {
                System.out.println("Está perto");
                contador++;
                //System.out.println(contador);
            } else if ((numeroCorreto - numeroUsuario) == 2) {
                System.out.println("Está perto....");
                contador++;
                //System.out.println(contador);
            } else if ((numeroCorreto - numeroUsuario) == 3) {
                System.out.println("Está perto....");
                contador++;
                //System.out.println(contador);
            } else if ((numeroCorreto - numeroUsuario) == 4) {
                System.out.println("Está perto....");
                contador++;
                //System.out.println(contador);
            } else if ((numeroCorreto - numeroUsuario) == 5) {
                System.out.println("Está perto.... posso estar mentindo");
                contador++;
                //System.out.println(contador);
            } else if ((numeroCorreto - numeroUsuario) == 6) {
                System.out.println("Está perto.... posso estar mentindo");
                contador++;
                //System.out.println(contador);
            } else if ((numeroCorreto - numeroUsuario) == 0) {
                System.out.println("Parabéns voce acertou");
                contador++;
                //System.out.println(contador);
            } else {
                System.out.println("Está longe");
                contador++;
                //System.out.println(contador);
            }

            if (contador == 4) {
                    System.out.println("Sua alma é minha perdeu");
                } else {
                    System.out.println("Número incorreto, tente novamente");
                }



        } while (numeroUsuario != numeroCorreto);

        sc.close();
    }
}
