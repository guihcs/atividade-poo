package atividade3;

public class Atividade5 {

    public static void main(String[] args) {

        int number = 3623728;

        for (int i = 0; number > 0 ; i++) {
            number /= 10;
            System.out.println(number);
        }

    }
}
