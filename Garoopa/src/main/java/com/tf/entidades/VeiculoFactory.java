package com.tf.entidades;

public class VeiculoFactory {

    String tipo;

    public VeiculoFactory(String tipo) {// ver isso

        this.tipo = tipo;

    }

    public static Veiculo getVeiculo(String tipoVeiculo){
        if(tipoVeiculo == null){
            return null;
        }
        if(tipoVeiculo.equalsIgnoreCase("VEICULO LUXO")){
            return new VeiculoLuxo();

        } else if(tipoVeiculo.equalsIgnoreCase("VEICULO NORMAL")){
            return new VeiculoNormal();

        } else if(tipoVeiculo.equalsIgnoreCase("VEICULO SIMPLES")){
            return new VeiculoSimples();
        }

        return null;
    }

}


