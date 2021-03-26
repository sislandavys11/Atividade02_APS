package br.ufpb.dcx.aps.atividades.atv02;

public class Professor {
    private String nome;

    public Professor(String nome){

        this.nome = nome;
    }
    public Professor (){

        this.nome = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }
}
