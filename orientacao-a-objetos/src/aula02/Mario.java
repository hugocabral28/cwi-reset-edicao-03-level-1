package aula02;

public class Mario {
    private String nome;
    private int idade;
    private double altura;
    private int estamina;
    private String corPele;
    private String corOlhos;
    private String tamanhoNariz;
    private boolean bigode;
    private String tipoBigode;
    private String corBigode;

    //Metodo Construtor
    public Mario (){
        setNome("Mario Bros");
        setIdade(40);
        setEstamina(100);
        setAltura(1.50);
    }
    public Mario(String nome, int idade, double altura){
        setNome(nome);
        setIdade(idade);
        setEstamina(100);
        setAltura(altura);
    }
    public void mostrarPerfil(){
        System.out.println("Nome = " + getNome());
        System.out.println("Cor da pele = " + getIdade());
        System.out.println("Estamina = " + getEstamina());
        System.out.println("Altura = " + getAltura());
        System.out.println("Cor da pele = " + getCorPele());
        System.out.println("Cor dos olhos = " + getCorOlhos());
        System.out.println("Tamanho do nariz = " + getTamanhoNariz());
        //verifica se tem bigode
        if(isBigode()){
            System.out.println("Bigode do tipo = " + getTipoBigode());
            System.out.println("Cor do bigode = " + getCorBigode());
        }else{
            System.out.println("Não tem bigode");
        }
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

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public String getTamanhoNariz() {
        return tamanhoNariz;
    }

    public void setTamanhoNariz(String tamanhoNariz) {
        this.tamanhoNariz = tamanhoNariz;
    }

    public boolean isBigode() {
        return bigode;
    }

    public void setBigode(boolean bigode) {
        this.bigode = bigode;
    }

    public String getTipoBigode() {
        return tipoBigode;
    }

    public void setTipoBigode(String tipoBigode) {
        this.tipoBigode = tipoBigode;
    }

    public String getCorBigode() {
        return corBigode;
    }

    public void setCorBigode(String corBigode) {
        this.corBigode = corBigode;
    }
}
