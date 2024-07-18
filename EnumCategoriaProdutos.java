package Exercicio02;

import java.util.Scanner;

import java.util.Scanner;

public class EnumCategoriaProdutos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valorEntrada = 0;
        double valorCarrinho = 0;

        while (valorEntrada != 5) {
            System.out.println("Digite o código do produto que deseja comprar: ");
            System.out.println("1 - CAMISETA - " + "Valor: R$ " + produtosCategoria.CAMISETA.getValor() );
            System.out.println("2 - CALCA - " + "Valor: R$ " + produtosCategoria.CALCA.getValor());
            System.out.println("3 - TENIS - " + "Valor: R$ " + produtosCategoria.TENIS.getValor());
            System.out.println("4 - BONE - " + "Valor: R$ " + produtosCategoria.TENIS.getValor());
            System.out.println("Digite 5 para sair e finalizar a compra");
            valorEntrada = sc.nextInt();


            switch (valorEntrada) {
                case 1:
                    System.out.println("Você selecionou CAMISETA");
                    System.out.println("Valor: R$ " + produtosCategoria.CAMISETA.getValor());
                    valorCarrinho +=  produtosCategoria.CAMISETA.getValor();
                    break;
                case 2:
                    System.out.println("Você selecionou CALCA");
                    System.out.println("Valor: R$ " + produtosCategoria.CALCA.getValor());
                    valorCarrinho +=  produtosCategoria.CALCA.getValor();
                    break;
                case 3:
                    System.out.println("Você selecionou TENIS");
                    System.out.println("Valor: R$ " + produtosCategoria.TENIS.getValor());
                    valorCarrinho +=  produtosCategoria.TENIS.getValor();
                    break;
                case 4:
                    System.out.println("Você selecionou BONE");
                    System.out.println("Valor: R$ " + produtosCategoria.BONE.getValor());
                    valorCarrinho += produtosCategoria.BONE.getValor();
                    break;
                case 5:
                    System.out.println("O valor da sua compra foi de R$ " + valorCarrinho);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }

    public enum produtosCategoria {
        CAMISETA(1, 17.50),
        CALCA(2, 16.50),
        TENIS(3, 19.50),
        BONE(4, 18.50),
        MOLETON(5, 18.50);

        private final int codigo;
        private final double valor;

        produtosCategoria(int codigo, double valor) {
            this.codigo = codigo;
            this.valor = valor;
        }

        public double getValor() {
            return valor;
        }
    }
}

