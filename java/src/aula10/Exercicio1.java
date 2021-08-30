package aula10;

import java.util.Scanner;

public class Exercicio1 {
    /*
    * Crie um programa que receba 5 valores e armazene em um vetor.
    * Crie um segundo vetor de mesmo tipo e tamanho, contendo os valores do primeiro vetor multiplicados por 2.
    * Ou seja: segundoVetor[i] = primeiroVetor[i] * 2. No final, imprima o conteúdo dos dois vetores.
    * */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] primeiroVetor = new double[5];
        double[] segundoVetor = new double[5];
        for (int i = 0; i < primeiroVetor.length; i++){
            System.out.println("Digite o "+ (i+1) +"º valor:");
            primeiroVetor[i] = scanner.nextDouble();
            for (int y = i; y < primeiroVetor.length; y++){
                segundoVetor[y] = primeiroVetor[i] * 2;
            }
        }
        System.out.println("Primeiro Vetor");
        for (double vetor : primeiroVetor) {
            System.out.println(vetor);
        }
        System.out.println("");
        System.out.println("Segundo Vetor");
        for (double vetor : segundoVetor) {
            System.out.println(vetor);
        }
    }
}
