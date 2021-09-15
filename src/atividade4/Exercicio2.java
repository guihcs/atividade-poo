package atividade4;

public class Exercicio2 {


    public static void main(String[] args) {
        //2. Faça um programa que calcule o ângulo entre dois vetores


        double x1 = 5;
        double y1 = 3;

        double x2 = 6;
        double y2 = 7;

        double dot = x1 * x2 + y1 * y2;
        double m1 = x1 * x1 + y1 * y1;
        double m2 = x2 * x2 + y2 * y2;

        System.out.println(dot / (m1 + m2));
    }
}
