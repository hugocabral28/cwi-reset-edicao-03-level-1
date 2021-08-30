package aula08;
import java.util.Scanner;

public class Exercicio2 {
    /*  Faça um Programa que leia um número e exiba o dia correspondente da semana. (1=Domingo, 2=Segunda, etc.),
        caso seja informado um valor que não corresponda à um dia da semana, então deve imprimir a mensagem Valor inválido!
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número entre [ 1 a 7 ] para que exiba o dia correspondente: ");
        int diaDaSemana = scan.nextInt();

        switch(diaDaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Valor inválido!");
                break;
        }
    }
}
