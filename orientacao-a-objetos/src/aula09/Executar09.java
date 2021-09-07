package aula09;


public class Executar09 {
    public static void main(String[] args){
        // Não é possivel instanciar um objeto do tipo Personagem, porque a classe é abstrata. Por isso, a linha está comentada.
        //Personagem personagem = new Personagem("Mario", 40, 1.60);
        Mario mario = new Mario("Mario",40,1.50);
        Luigi luigi =new Luigi("Luigi",35,1.70);
        Yoshi yoshi = new Yoshi("Yoshi",25,1.10);
        // Teste para verificar se o Mario monta no Yoshi
        mario.imprimeMontadoYoshi();
        mario.montarNoYoshi(yoshi);
        mario.imprimeMontadoYoshi();
        System.out.println("________________________________________________________");
        // Teste para verificar se o Luigi voa
        luigi.voar();
        System.out.println("________________________________________________________");
        // Teste para verificar se a velocidade do yoshi aumenta a cada 2 frutas comidas
        System.out.println("Velocidade atual: " + yoshi.getVelocidade());
        yoshi.comerFrutas();
        System.out.println("Velocidade atual: " + yoshi.getVelocidade());
        yoshi.comerFrutas();
        System.out.println("Velocidade atual: " + yoshi.getVelocidade());
        yoshi.comerFrutas();
        yoshi.comerFrutas();
        System.out.println("Velocidade atual: " + yoshi.getVelocidade());


    }
}
