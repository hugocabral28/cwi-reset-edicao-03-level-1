package aula05;
import aula02.Mario;

public class Executar05 {
    public static void main(String[] args){
        Mario personagem = new Mario();
        personagem.perderEstamina();
        personagem.ganhaEstamina();
        personagem.crescer();
        personagem.mostrarPerfil();
    }
}
