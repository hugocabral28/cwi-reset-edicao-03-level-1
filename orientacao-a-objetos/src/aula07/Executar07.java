package aula07;
import aula02.Personagem;
public class Executar07 {
    public static void main(String[] args){
        Personagem mario = new Personagem("Mario",40,1.50);
        Personagem luigi = new Personagem("Luigi",40,1.50);
        mario.saltar();
        luigi.saltar();
    }
}
