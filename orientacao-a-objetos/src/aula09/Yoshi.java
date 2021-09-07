package aula09;


public class Yoshi extends Personagem {
    private int quantidadeFrutas;
    private int velocidade;

    //Metodo Construtor
    public Yoshi(String nome, int idade, double altura){
        super(nome, idade, altura);
        this.quantidadeFrutas = 0;
        this.velocidade = 10;
    }
    //Método personalizado
    public void comerFrutas(){
        this.quantidadeFrutas ++;
        if(this.quantidadeFrutas % 2 == 0){
            this.velocidade *= 2;
        }
    }
    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Quantidade de Fruntas comida: " + this.quantidadeFrutas);
        System.out.println("Velocidade: " + this.getVelocidade());
    }
    //Método especiais
    public int getVelocidade() {
        return velocidade;
    }
}
