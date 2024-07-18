package CategoriaProduto;

import java.util.Scanner;

public class CategoriaProdutos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ola digite sua categoria de usuario");
        System.out.println("Categoria: ELETRONICO, VESTUARIO, ALIMENTO");

        String categoriaColetada = sc.nextLine().toUpperCase();
        sc.close();

        CatalogoProdutos categoriaComparado = CatalogoProdutos.valueOf(categoriaColetada);

        System.out.println("Ola, seu gerente tem uma mensagem para você ");
        System.out.println(".... " + categoriaComparado.getText());

    }




    public enum CatalogoProdutos {

        ELETRONICO("Eletronico","Esta pegando fogo o setor"),
        VESTUARIO("Vesturario","Tem cliente esperando"),
        ALIMENTO("Alimento","Vai repor produto, vai");

        private final String categoria;
        private final String text;

        CatalogoProdutos(String categoria, String text) {
            this.categoria = categoria;
            this.text = text;
        }

        public String getCategoria(){
            return categoria;
        }

        public String getText(){
            return text;
        }

    }

}
