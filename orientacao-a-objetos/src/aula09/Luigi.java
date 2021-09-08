package aula09;


public class Luigi extends Personagem {
    //Metodo Construtor
    public Luigi(String nome, int idade, double altura){
        super(nome, idade, altura);
    }
    //Método personalizado
    public void voar(){
        System.out.println("Luigi está voando");
    }

    @Override
    public void crescer(){
        double novaAltura = this.getAltura()*0.75;
        this.setAltura(this.getAltura()+novaAltura);
    }
}
