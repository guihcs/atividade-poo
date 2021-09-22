package atividade8;

public class Exercicio2 {

    public static void main(String[] args) {
        //3. Crie um programa que desenha uma pirâmide

        for (int i = 0; i < 10; i++) {
            String line = "";
            for (int j = 0; j < i + 1; j++) {
                line += "*";
            }
            System.out.println(line);
        }
    }
}
