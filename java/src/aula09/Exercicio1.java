package aula09;

import java.util.Scanner;

public class Exercicio1 {
    /*
    * Faça um programa que peça uma nota, entre zero e dez. Caso o valor informado seja inválido, ou seja, não esteja entre zero e dez,
    * mostre uma mensagem informando o problema, mas mantenha o programa em execução pedindo novamente a nota até que o usuário informe um valor válido.
    * Quando o usuário informar uma nota válida, imprima o valor da nota.
    * */

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double nota = 0;
        boolean notaValida = true;

        do {
            System.out.println("Digite uma nota entre [0 e 10] :");
            nota = scanner.nextDouble();

            if(nota >= 0 && nota <= 10){
                System.out.println("A nota digitada foi: "+ nota);
                notaValida = false;
            }else{
                System.out.println("A nota informada não está entre [0 e 10]");
            }

            System.out.println("_______________________________________");

        }while(notaValida);

    }
}
