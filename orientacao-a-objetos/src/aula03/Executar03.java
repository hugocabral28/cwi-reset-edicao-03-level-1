package aula03;

import aula02.Mario;

public class Executar03 {
    public static void main(String[] args){
        Mario personagem = new Mario();
        //personagem.nome = "Mario"; //<-- Não é possível atribuir porque está privado
        personagem.corPele = "clara";
        personagem.tipoAltura = "baixo";
        personagem.corOlhos = "azuis";
        personagem.tamanhoNariz = "grande";
        //personagem.bigode = true; //<-- Não é possível atribuir porque está como protegido e a classe está em pacote diferente
        //personagem.tipoBigode = "grosso"; //<-- Não é possível atribuir porque está como protegido e a classe está em pacote diferente
        //personagem.corBigode = "castanho-escuro"; //<-- Não é possível atribuir porque está como protegido e a classe está em pacote diferente

        System.out.println("______________________");
        System.out.println("Características");
        System.out.println("______________________");
        personagem.mostrarPerfil();
        System.out.println("______________________");
        System.out.println("Poderes");
        System.out.println("______________________");
        personagem.mostrarPoder();

    }
}
