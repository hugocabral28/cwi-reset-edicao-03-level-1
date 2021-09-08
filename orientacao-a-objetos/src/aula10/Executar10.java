package aula10;

import aula09.Personagem;
import aula09.Mario;
import aula09.Luigi;
import aula09.Yoshi;

public class Executar10 {
    public static void main(String[] args){
        Mario mario = new Mario("Mario",40,1.50);
        Luigi luigi =new Luigi("Luigi",35,1.70);
        Yoshi yoshi = new Yoshi("Yoshi",25,1.10);
        System.out.println("Mario");
        mario.crescer();
        mario.mostrarPerfil();
        System.out.println("");
        mario.saltar();
        mario.saltar(2);
        System.out.println("");
        System.out.println("Luigi");
        luigi.crescer();
        luigi.mostrarPerfil();
        System.out.println("");
        luigi.saltar();
        luigi.saltar(3);
        System.out.println("");
        System.out.println("Yoshi");
        yoshi.crescer();
        yoshi.mostrarPerfil();
        System.out.println("");
        yoshi.saltar();
        yoshi.saltar(10);
        System.out.println("");


    }
}
