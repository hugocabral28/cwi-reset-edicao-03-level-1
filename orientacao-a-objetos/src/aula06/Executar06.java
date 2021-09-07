package aula06;

import aula02.Mario;

public class Executar06 {
    public static void main(String[] args){
        System.out.println("Teste para ver se o mario inicializa os novos atributos");
        Mario mario = new Mario();
        mario.mostrarPerfil();
        System.out.println("---");

        System.out.println("Teste para ver se o mario reinicia a estamina após revigorar");
        Mario mario2 = new Mario();
        mario2.mostrarPerfil();
        mario2.perderEstamina(); // desconta 10
        mario2.perderEstamina(); // desconta 10
        System.out.println("_____________________________________________________________");
        mario2.mostrarPerfil();
        mario2.revigorar();
        System.out.println("_____________________________________________________________");
        mario2.mostrarPerfil();
        System.out.println("---");

        System.out.println("Teste para ver se o mario atualiza a quantidade de moedas após a coleta");
        Mario mario3 = new Mario();
        mario3.mostrarPerfil();
        System.out.println("_____________________________________________________________");
        mario3.coletarMoedas();
        mario3.coletarMoedas();
        mario3.coletarMoedas();
        System.out.println("_____________________________________________________________");
        mario3.mostrarPerfil();
        System.out.println("---");

        System.out.println("Teste para ver se o mario ganha uma vida a cada 10 moedas coletadas");
        Mario mario4 = new Mario();
        mario4.mostrarPerfil();
        System.out.println("_____________________________________________________________");
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        System.out.println("_____________________________________________________________");
        mario4.mostrarPerfil();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        System.out.println("_____________________________________________________________");
        mario4.mostrarPerfil();
        System.out.println("---");

        System.out.println("Teste para ver se o mario perde uma vida após morrer");
        Mario mario5 = new Mario();
        mario5.mostrarPerfil();
        System.out.println("_____________________________________________________________");
        //coletar 10 moedas para ganhar mais uma vida
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        //verificando se ganhou uma vida
        System.out.println("_____________________________________________________________");
        mario5.mostrarPerfil();
        //morrer
        mario5.morrer();
        //verificando se perdeu uma vida
        System.out.println("_____________________________________________________________");
        mario5.mostrarPerfil();
        System.out.println("---");

        System.out.println("Teste para ver se o mario reinicia a estamina após morrer e ainda possuir vida");
        Mario mario6 = new Mario();
        mario5.mostrarPerfil();
        //coletar 10 moedas para ganhar mais uma vida
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        //perder estamina
        mario6.perderEstamina();
        //verificando se ganhou uma vida e se atualizou a estamina
        System.out.println("_____________________________________________________________");
        mario6.mostrarPerfil();
        //morrer
        mario6.morrer();
        //verificando se perdeu uma vida e se reiniciou a estamina
        System.out.println("_____________________________________________________________");
        mario6.mostrarPerfil();
        System.out.println("---");

        System.out.println("Teste para ver se o mario mantém a quantidade de vidas em 0 após morrer 2 vezes");
        Mario mario7 = new Mario();
        mario7.mostrarPerfil();
        mario7.morrer();
        mario7.morrer();
        System.out.println("_____________________________________________________________");
        mario7.mostrarPerfil();
        System.out.println("---");
    }
}
