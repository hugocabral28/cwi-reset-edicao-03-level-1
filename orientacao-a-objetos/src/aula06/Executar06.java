package aula06;

import aula02.Mario;

public class Executar06 {
    public static void main(String[] args){
        System.out.println("Teste para ver se o mario inicializa os novos atributos");
        Mario personagem = new Mario();
        personagem.mostrarPerfil();
        System.out.println("---");

        System.out.println("Teste para ver se o mario reinicia a estamina após revigorar");
        Mario personagem2 = new Mario();
        personagem2.mostrarPerfil();
        personagem2.perderEstamina(); // desconta 10
        personagem2.perderEstamina(); // desconta 10
        System.out.println("_____________________________________________________________");
        personagem2.mostrarPerfil();
        personagem2.revigorar();
        System.out.println("_____________________________________________________________");
        personagem2.mostrarPerfil();
        System.out.println("---");

        System.out.println("Teste para ver se o mario atualiza a quantidade de moedas após a coleta");
        Mario personagem3 = new Mario();
        personagem3.mostrarPerfil();
        System.out.println("_____________________________________________________________");
        personagem3.coletarMoedas();
        personagem3.coletarMoedas();
        personagem3.coletarMoedas();
        System.out.println("_____________________________________________________________");
        personagem3.mostrarPerfil();
        System.out.println("---");

        System.out.println("Teste para ver se o mario ganha uma vida a cada 10 moedas coletadas");
        Mario personagem4 = new Mario();
        personagem4.mostrarPerfil();
        System.out.println("_____________________________________________________________");
        personagem4.coletarMoedas();
        personagem4.coletarMoedas();
        personagem4.coletarMoedas();
        personagem4.coletarMoedas();
        personagem4.coletarMoedas();
        personagem4.coletarMoedas();
        personagem4.coletarMoedas();
        personagem4.coletarMoedas();
        personagem4.coletarMoedas();
        personagem4.coletarMoedas();
        System.out.println("_____________________________________________________________");
        personagem4.mostrarPerfil();
        personagem4.coletarMoedas();
        personagem4.coletarMoedas();
        personagem4.coletarMoedas();
        personagem4.coletarMoedas();
        personagem4.coletarMoedas();
        personagem4.coletarMoedas();
        personagem4.coletarMoedas();
        personagem4.coletarMoedas();
        personagem4.coletarMoedas();
        personagem4.coletarMoedas();
        System.out.println("_____________________________________________________________");
        personagem4.mostrarPerfil();
        System.out.println("---");

        System.out.println("Teste para ver se o mario perde uma vida após morrer");
        Mario personagem5 = new Mario();
        personagem5.mostrarPerfil();
        System.out.println("_____________________________________________________________");
        //coletar 10 moedas para ganhar mais uma vida
        personagem5.coletarMoedas();
        personagem5.coletarMoedas();
        personagem5.coletarMoedas();
        personagem5.coletarMoedas();
        personagem5.coletarMoedas();
        personagem5.coletarMoedas();
        personagem5.coletarMoedas();
        personagem5.coletarMoedas();
        personagem5.coletarMoedas();
        personagem5.coletarMoedas();
        //verificando se ganhou uma vida
        System.out.println("_____________________________________________________________");
        personagem5.mostrarPerfil();
        //morrer
        personagem5.morrer();
        //verificando se perdeu uma vida
        System.out.println("_____________________________________________________________");
        personagem5.mostrarPerfil();
        System.out.println("---");

        System.out.println("Teste para ver se o mario reinicia a estamina após morrer e ainda possuir vida");
        Mario personagem6 = new Mario();
        personagem6.mostrarPerfil();
        //coletar 10 moedas para ganhar mais uma vida
        personagem6.coletarMoedas();
        personagem6.coletarMoedas();
        personagem6.coletarMoedas();
        personagem6.coletarMoedas();
        personagem6.coletarMoedas();
        personagem6.coletarMoedas();
        personagem6.coletarMoedas();
        personagem6.coletarMoedas();
        personagem6.coletarMoedas();
        personagem6.coletarMoedas();
        //perder estamina
        personagem6.perderEstamina();
        //verificando se ganhou uma vida e se atualizou a estamina
        System.out.println("_____________________________________________________________");
        personagem6.mostrarPerfil();
        //morrer
        personagem6.morrer();
        //verificando se perdeu uma vida e se reiniciou a estamina
        System.out.println("_____________________________________________________________");
        personagem6.mostrarPerfil();
        System.out.println("---");

        System.out.println("Teste para ver se o mario mantém a quantidade de vidas em 0 após morrer 2 vezes");
        Mario personagem7 = new Mario();
        personagem7.mostrarPerfil();
        personagem7.morrer();
        personagem7.morrer();
        System.out.println("_____________________________________________________________");
        personagem7.mostrarPerfil();
        System.out.println("---");
    }
}
