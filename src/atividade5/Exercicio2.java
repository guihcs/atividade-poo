package atividade5;

public class Exercicio2 {


    public static void main(String[] args) {
        //2. Crie um programa que calcule o tempo pra download de um arquivo (peso em mb, velocidade mb/s)

        //Tamanho em MB
        double fileSize = 500;

        // velocidade da internet em megas / segundo 11MB/s
        double netSpeed = 11;

        double timeInSeconds = fileSize / netSpeed;

        System.out.println(timeInSeconds);
    }
}
