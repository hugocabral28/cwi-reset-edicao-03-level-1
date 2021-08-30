package aula09;

import java.util.Scanner;

public class Exercicio4 {
    /*
    * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
    * O usuário deve informar de qual número ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo
    * Tabuada do 5:

        5 x 1 = 5
        5 x 2 = 10
        .
        .
        .
        5 x 10 = 50
    * */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numeroDaTabuada = 0;
        System.out.println("Gerador de tabuada");
        System.out.println("Digite um número entre [1 a 10] para gerar:");
        numeroDaTabuada = scanner.nextInt();
        System.out.println("");
        for(int i = 1; i <= 10; i++){
            System.out.println(numeroDaTabuada+" X " + i + " = " + numeroDaTabuada * i);
        }
    }
}
