package atividade7;

public class Exercicio5 {


    public static void main(String[] args) {
        //5. Crie um programa que mostre 100 termos uma pg na tela;

        int a0 = 5;
        int r = 2;

        for (int i = 0; i < 100; i++) {
            int an = (int) (a0 + Math.pow(r, i));
            System.out.println(an);
        }
    }
}
