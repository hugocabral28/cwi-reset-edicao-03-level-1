package aula09;

import java.util.Scanner;

public class Exercicio3 {
    /*
    * Faça um programa que leia 5 números e informe o maior número.
    * */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[5];
        int maior = 0;
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite o "+ (i+1) +"º número:");
            numero[i] = scanner.nextInt();
            if(numero[i] > maior){
                maior = numero[i];
            }
        }
        System.out.println("O maior número digitado foi: " + maior);

    }
}
