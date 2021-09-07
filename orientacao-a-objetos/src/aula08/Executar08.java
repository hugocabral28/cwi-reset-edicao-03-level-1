package aula08;

import aula02.Personagem;

public class Executar08 {
    public static void main(String[] args){
        Personagem player1 = new Personagem("Mario",40,1.50);
        Personagem player2 = new Personagem("Luigi",35,1.70);
        Jogo play = new Jogo(player1,player2);
        System.out.println("_______Jogar______");
        play.jogar();
    }
}
