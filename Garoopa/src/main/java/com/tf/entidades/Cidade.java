package com.tf.entidades;
import java.util.*;

public class Cidade {

    private String nome;
    private List<Bairro> bairros = new LinkedList<>();

    public Cidade(String nome, List<Bairros> bairros) {

        this.nome = nome;
        this.bairros = bairros;

    }

    public String getCidade() {

        return nome;

    }

    public List getBairros() {

        return bairros;

    }

}