package com.tf.entidades;

public class VeiculoFactory {

    public static veiculo getVeiculo(String tipoVeiculo){
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


