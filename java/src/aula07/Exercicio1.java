package aula07;

import java.util.Scanner;

public class Exercicio1 {
    //Faça um programa que tenha como entradas dois números e imprima a soma de ambos. Utilize a classe Scanner para obter as entradas.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        float primeiroNumero = scan.nextFloat();
        System.out.println("Digite o segundo número:");
        float segundoNumero = scan.nextFloat();
        System.out.println("A soma dos numeros é: " + (primeiroNumero + segundoNumero));
    }
}
