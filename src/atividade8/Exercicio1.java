package atividade8;

public class Exercicio1 {


    public static void main(String[] args) {
        //1. Crie um programa que calcula a soma de uma pg utilizando o for;

        int a0 = 5;
        int r = 5;
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            int an = a0 + r * i;
            sum += an;
        }

        System.out.println(sum);
    }
}
