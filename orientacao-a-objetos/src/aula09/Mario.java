package aula09;


public class Mario extends Personagem {
    private Yoshi yoshi;

    //Método Construtor
    public Mario(String nome, int idade, double altura){
        super(nome, idade, altura);
    }
    //Método personalizado
    public void montarNoYoshi(Yoshi yoshi){
        this.setYoshi(yoshi);
    }
    public void imprimeMontadoYoshi(){
        if(this.getYoshi() != null){
            System.out.println("Está montado em um Yoshi");
        }else{
            System.out.println("Não está montado em um Yoshi");
        }
    }

    public Yoshi getYoshi() {
        return yoshi;
    }

    public void setYoshi(Yoshi yoshi) {
        this.yoshi = yoshi;
    }
}
