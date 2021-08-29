package aula07;

import java.util.Scanner;

public class Exercicio2 {
    //Faça um programa que tenha como entradas 4 notas e imprima a média. Utilize a classe Scanner para obter as entradas
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da primeira nota:");
        float nota1 = scan.nextFloat();
        System.out.println("Digite o valor da segunda nota:");
        float nota2 = scan.nextFloat();
        System.out.println("Digite o valor da terceira nota:");
        float nota3 = scan.nextFloat();
        System.out.println("Digite o valor da quarta nota:");
        float nota4 = scan.nextFloat();
        float media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A média de suas notas é: " + media);
    }
}
