package com.tf.entidades;

public class Motorista{
    private String cpf;
    private String nome;
    private int somAval;
    private int qtdAval;
    private Veiculos veiculo;
    private Pagamento pagamento;
    public enum Pagamento {

        DINHEIRO, DEBITO, CREDITO  

    }

    public Motorista(String cpf, String nome, int somaAval, int qtdAval,Veiculos veiculo, Pagamento pagamento){
        this.cpf=cpf;
        this.nome=nome;
        this.somAval=somAval;
        this.qtdAval=qtdAval;
        this.veiculo=veiculo;
        this.pagamento=pagamento;
    }

    public String getCpf(){
        return cpf;
    }
    
    public String getNome(){
        return nome;
    }    

    public int getSomAval(){
        return somAval;
    }    

    public int getQtdAval(){
        return qtdAval;
    }

    public Veiculo getVeiculo(){
        return veiculo;
    }

    public Pagamento getPagamento(){
        return pagamento;
    }           
}