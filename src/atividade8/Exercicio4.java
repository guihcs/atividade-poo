package atividade8;

public class Exercicio4 {


    public static void main(String[] args) {
        //4. Crie um programa que mostra a sequência de fibonacci

        int a0 = 0;
        int a1 = 1;

        for (int i = 0; i < 100; i++) {
            System.out.println(a0);
            int ai = a1 + a0;
            a0 = a1;
            a1 = ai;
        }
    }
}
