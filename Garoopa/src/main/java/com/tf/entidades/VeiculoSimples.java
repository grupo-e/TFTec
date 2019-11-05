package com.tf.entidades;

public class VeiculoSimples implements Veiculo {
    private String placa;
    private String marca;
    private String cor;
    private Boolean attInf;
    private Boolean bagG;


    @Override
    public String getPlaca(){return placa;}

    @Override
    public String getMarca(){return marca;}

    @Override
    public String getCor(){return cor;}

    @Override
    public Boolean atendeCorridaInferior(){return false;}

    @Override
    public Boolean bagageiroGrande(){return false;}

}
