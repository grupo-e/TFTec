package com.tf.entidades;

public class VeiculoLuxo implements veiculo{

    private String placa;
    private String marca;
    private String cor;
    private Boolean attCorrInf;
    private Boolean bagG;


    @Override
    public String getPlaca(){return placa;}

    @Override
    public String getMarca(){return marca;}

    @Override
    public String getCor(){return cor;}

    @Override
    public Boolean atendeCorridaInferior(){return attCorrInf;}

    @Override
    public Boolean bagageiroGrande(){return bagG;}
}
