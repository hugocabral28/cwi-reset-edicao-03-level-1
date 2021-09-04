package aula02;

public class Mario {
    private String nome;
    public String corPele;
    public String tipoAltura;
    public String corOlhos;
    public String tamanhoNariz;
    protected boolean bigode;
    protected String tipoBigode;
    protected String corBigode;


    public void mostrarPerfil(){
        System.out.println("Nome = " + this.nome);
        System.out.println("Cor da pele = " + this.corPele);
        System.out.println("Tipo de altura = " + this.tipoAltura);
        System.out.println("Cor dos olhos = " + this.corOlhos);
        System.out.println("Tamanho do nariz = " + this.tamanhoNariz);
        //verifica se tem bigode
        if(this.bigode){
            System.out.println("Bigode do tipo = " + this.tipoBigode);
            System.out.println("Cor do bigode = " + this.corBigode);
        }else{
            System.out.println("Não tem bigode");
        }
    }
    public void mostrarPoder(){
        System.out.println("Super Reflexo e Super força");
    }


}
