package aula08;

import java.util.Scanner;

public class Exercicio1 {
    /*Faça um programa que tenha como entradas 4 notas e calcule a média. Ao final o programa deve apresentar:
        A mensagem Aluno aprovado, se a média alcançada for igual ou superior a sete;
        A mensagem Aluno reprovado, se a média for inferior a sete;
        A mensagem Aluno aprovado com louvores, se a média for igual a dez.
    */
    public static void main(String[] args){

        Scanner pegaValor = new Scanner(System.in);

        float[] notas = new float[4];
        float soma = 0f;
        float media = 0f;

        for(int i=0; i < notas.length; i++){
            System.out.println("Informe sua "+ (i+1) +"º nota: ");
            notas[i] = pegaValor.nextFloat();
            soma += notas[i];
        }
        media = soma / 4;

        if(media < 7){
            System.out.println("Aluno reprovado com média: " + media);
        }else if(media == 10){
            System.out.println("Aluno aprovado com louvores média: " + media);
        }else{
            System.out.println("Aluno aprovado com média: " + media);
        }

    }
}
