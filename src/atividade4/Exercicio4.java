package atividade4;

public class Exercicio4 {


    public static void main(String[] args) {
        //4. Crie um programa que calcule o custo de um eletrodoméstico ligado (potência, preço por kw, tempo ligado)

        //potencia w
        double p = 6000;
        //tempo horas
        int t = 2;
        //preço kw/h
        double k = 0.5;


        double consume = p / 1000 * t;
        double cost = consume * k;

        System.out.println(cost);

    }
}
