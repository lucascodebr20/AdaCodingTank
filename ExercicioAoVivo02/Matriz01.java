package ExercicioAoVivo02;

import java.util.Scanner;

public class Matriz01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero de linhas: ");
        int linha1 = sc.nextInt();
        System.out.println("Digite um numero de colunas: ");
        int coluna1 = sc.nextInt();

        int matriz1[][] = new int[linha1][coluna1];

        for (int i = 0; i < linha1; i++){
            for (int j = 0; j < coluna1; j++){
                System.out.println("Digite os elementos da matriz");
                matriz1[i][j] = sc.nextInt();
            }
        }

        int maior = matriz1[0][0];
        for (int i = 0; i < linha1; i++) {
            for (int j = 0; j < coluna1; j++) {
                if (matriz1[i][j] > maior) {
                    maior = matriz1[i][j];
                }
            }
        }

        System.out.println("O maior numero incrivelmente é o numero: " + maior);

    }




}
