package aula02;

public class Mario {
    String nome;
    String corPele;
    String tipoAltura;
    String corOlhos;
    String tamanhoNariz;
    boolean bigode;
    String tipoBigode;
    String corBigode;


    void mostrarPerfil(){
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
    void mostrarPoder(){
        System.out.println("Super Reflexo e Super força");
    }


}
