package com.mycompany.crud;

//Pablo Wendell

import java.util.ArrayList;

public abstract class Pessoa {
    public String nome;
    public String cpf;
   
//construtores 

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
//getters 

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    
//setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }  
}