package atividade8;

public class Exercicio3 {


    public static void main(String[] args) {
        //3. Crie um programa que calcula o fatorial de um número

        int n = 5;
        int r = 1;

        for (int i = n; i > 1; i--) {
            r *= i;
        }

        System.out.println(r);
    }
}
