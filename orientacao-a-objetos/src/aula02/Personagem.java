package aula02;

public class Personagem {
    private String nome;
    private int idade;
    private double altura;
    private int estamina;
    private int quantidadeMoedas;
    private int quantidadeVidas;

    //Metodo Construtor
    public Personagem(String nome, int idade, double altura){
        this.setNome(nome);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setEstamina(100);
        this.setQuantidadeMoedas(0);
        this.setQuantidadeVidas(1);

    }
    //metodos personalizados
    public void perderEstamina(){
        int perde = this.getEstamina()-10;
        if (perde < 0){
            perde = 0;
        }
        this.setEstamina(perde);
    }
    public void ganhaEstamina(){
        int ganha = this.getEstamina()+5;
        if(ganha > 100){
            ganha = 100;
        }
        this.setEstamina(ganha);
    }
    public void crescer(){
        this.setAltura(this.getAltura()*2);
    }

    public void revigorar(){
        this.setEstamina(100);
    }

    public void morrer(){
        this.setEstamina(0);
        this.setQuantidadeVidas(this.getQuantidadeVidas()-1);
        if (this.getQuantidadeVidas() < 0){
            this.setQuantidadeVidas(0);
        }
        if(this.getQuantidadeVidas() >= 0){
            revigorar();
        }
    }

    public void coletarMoedas(){
        this.setQuantidadeMoedas(this.getQuantidadeMoedas()+1);
        if(this.getQuantidadeMoedas() % 10 == 0){
            this.setQuantidadeVidas(this.getQuantidadeVidas()+1);
        }
    }

    public void saltar(){
        if(this.getNome().equals("Mario")){
            System.out.println(this.getNome() +" ele pula uma altura de " + this.getAltura()*0.5 + " metros");
        }else if(this.getNome().equals("Luigi")){
            System.out.println(this.getNome() +" ele pula uma altura de " + this.getAltura()*2 + " metros");
        }else {
            System.out.println("Não é Mario ou Luigi");
        }
    }

    public void mostrarPerfil(){
        System.out.println("Nome = " + getNome());
        System.out.println("Idade = " + getIdade());
        System.out.println("Altura = " + getAltura());
        System.out.println("Estamina = " + getEstamina());
        System.out.println("Quantidade de Moedas = " + getQuantidadeMoedas());
        System.out.println("Quantidade de Vidas = " + getQuantidadeVidas());

    }
    public void mostrarPoder(){
        System.out.println("Super Reflexo e Super força");
    }

    //Métodos Getter e Setter
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getQuantidadeMoedas() {
        return quantidadeMoedas;
    }

    public void setQuantidadeMoedas(int quantidadeMoedas) {
        this.quantidadeMoedas = quantidadeMoedas;
    }

    public int getQuantidadeVidas() {
        return quantidadeVidas;
    }

    public void setQuantidadeVidas(int quantidadeVidas) {
        this.quantidadeVidas = quantidadeVidas;
    }
}
