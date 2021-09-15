package atividade2;

import java.util.Scanner;

public class Exercicio2 {


    public static void main(String[] args) {

        //2. Faça um programa que calcule a fórmula de bhaskara

        double a = 1;
        double b = 8;
        double c = 12;

        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);

    }
}
