package aula10;

import java.util.Scanner;

public class Exercicio2 {
    /*
     * Crie um programa que leia 10 valores inteiros correspondentes as idades de um grupo de pessoas e armazene em um vetor.
     * Escreva uma lógica para determinar a quantidade de pessoas que possuem idade igual ou superior a 18 anos.
     * Ao final, imprima o vetor de idades e a quantidade de pessoas maiores de idade.
     * */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[10];
        int cont = 0;
        for(int i = 0; i < idades.length;i++){
            System.out.println("Digite a "+ (i+1) + "º idade:");
            idades[i] = scanner.nextInt();
            if(idades[i] >= 18){
                cont++;
            }
        }
        for(int idade : idades){
            System.out.println("Idade = " + idade + " anos");
        }
        System.out.println("Quantidade de pessoas maiores de idade = " + cont);
    }
}
