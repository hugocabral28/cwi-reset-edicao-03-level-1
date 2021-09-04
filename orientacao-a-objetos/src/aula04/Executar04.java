package aula04;

import aula02.Mario;

public class Executar04 {

    public static void main(String[] args){
        System.out.println("instanciando com o metodo construtor com padrão");
        //instanciando com o metodo construtor padrão
        Mario personagem01 = new Mario("Mario Bros",40,1.50);
        personagem01.mostrarPerfil();
        System.out.println("______________________________________");
        System.out.println("instanciando com o metodo construtor sem o padrão");
        //instanciando com o metodo construtor
        Mario personagem02 = new Mario();
        personagem02.setNome("Mario");
        personagem02.setIdade(20);
        personagem02.setAltura(1.90);
        personagem02.setEstamina(90);
        personagem02.mostrarPerfil();

    }
}
