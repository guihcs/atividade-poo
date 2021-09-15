package atividade3;

import java.util.Arrays;

public class Exercicio1 {


    public static void main(String[] args) {
        //1. Faça um programa que calcule uma simulação de renda fixa ex: (valor inicial, taxa, tempo -> resultado)
        double initial = 1000;
        //taxa ao ano
        double tax = 0.05;
        //tempo em anos
        int time = 3;

        double result = initial * Math.pow(1 + tax, time);

        System.out.println(result);
    }
}
