package atividade7;

public class Exercicio4 {

    public static void main(String[] args) {
        //4. Crie um programa que mostre 100 termos de uma pa na tela;

        int a0 = 5;
        int r = 2;

        for (int i = 0; i < 100; i++) {
            int an = a0 + r * i;
            System.out.println(an);
        }
    }
}
