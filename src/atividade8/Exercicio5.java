package atividade8;

public class Exercicio5 {


    public static void main(String[] args) {
        //5. Faça um programa que calcule quantos dígitos um número tem utilizando for

        int number = 124918251;
        int d = 0;

        for (int i = 0; number > 0; i++) {
            number /= 10;
            d += 1;
        }

        System.out.println(d);
    }
}
