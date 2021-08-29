package aula07;

import java.util.Scanner;

public class Exercicio3 {
    //Faça um programa que solicite quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quanto ganha por hora:");
        float ganhoPorHora = scan.nextFloat();
        System.out.println("Digite quantas horas trabalhadas no mês:");
        float horasTrabalhadas = scan.nextFloat();
        float salario = horasTrabalhadas * ganhoPorHora;
        System.out.println("Seu salário no referido mês é: " + salario);
    }

}
