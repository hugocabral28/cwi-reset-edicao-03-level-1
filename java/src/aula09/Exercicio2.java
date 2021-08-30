package aula09;

import java.util.Scanner;

public class Exercicio2 {
    /*
    * Faça um programa que leia dois números e imprima todos os valores presentes no intervalo entre eles, um abaixo do outro.
    * Caso o segundo número seja menor ou igual ao primeiro, solicite um novo número até que o segundo número seja maior que o primeiro.
    * */

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int primeiroNumero = 0;
        int segundoNumero = 0;
        boolean verifica = true;

        System.out.println("Digite o primeiro número:");
        primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        segundoNumero = scanner.nextInt();
        System.out.println("");

        while(verifica){

            if (primeiroNumero <= segundoNumero){
                for (int i = primeiroNumero; i <= segundoNumero; i++){
                    System.out.println(i);
                }
                verifica = false;
            }else{
                System.out.println("O segundo número é menor ou igual o primeiro");
                System.out.println("______________________________________");
                System.out.println("Digite o segundo número maior que o primeiro:");
                segundoNumero = scanner.nextInt();
                System.out.println("");
            }
        }


    }
}
