package aula08;

import aula02.Personagem;

import java.util.Random;

public class Jogo {
    //Atributos
    private Personagem jogador1, jogador2;

    //Método construtor
    public Jogo(Personagem player1, Personagem player2) {
        this.jogador1 = player1;
        this.jogador2 = player2;
    }

    //Métodos pesonalizados
    public void jogar(){
        //instanciando um numero aleatório
        Random aleatorio = new Random();
        //atribuído número aleatório em cada player
        int player1 = aleatorio.nextInt(30);
        int player2 = aleatorio.nextInt(30);
        //coletando as moedas de modo aleatório
        for (int i = 0 ; i <= player1; i++){
            this.jogador1.coletarMoedas();
        }
        for (int i = 0 ; i <= player2; i++){
            this.jogador2.coletarMoedas();
        }
        //mostra o total de moedas coletadas
        System.out.println(this.jogador1.getNome() + " total de moedas coletadas = "+ this.jogador1.getQuantidadeMoedas());
        System.out.println("Final de jogo do jogador 1");
        System.out.println("");
        this.jogador1.mostrarPerfil();
        System.out.println("________________________________________________________");
        System.out.println(this.jogador2.getNome() + " total de moedas coletadas = "+ this.jogador2.getQuantidadeMoedas());
        System.out.println("Final de jogo do jogador 2");
        System.out.println("");
        this.jogador2.mostrarPerfil();
    }

    //Métodos especiais
    public Personagem getJogador1() {
        return jogador1;
    }

    public void setJogador1(Personagem jogador1) {
        this.jogador1 = jogador1;
    }

    public Personagem getJogador2() {
        return jogador2;
    }

    public void setJogador2(Personagem jogador2) {
        this.jogador2 = jogador2;
    }
}
