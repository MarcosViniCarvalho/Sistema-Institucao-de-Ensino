package com.mycompany.crud;

//pablo Wendell

import java.util.ArrayList;

public class Funcionario extends Pessoa {
    public String idade;
    public String cargo;
    public double salario = 1200;
    public double bonusSalario(double salario){return salario;}
   
    
//contrutores     
    public Funcionario(String nome, String cpf, String idade, String cargo, double salario) {
        super(nome, cpf);
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
      
    }
    
//getters

    public String getIdade() {
        return idade;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
    
//setters

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}