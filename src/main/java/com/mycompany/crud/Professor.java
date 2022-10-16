
package com.mycompany.crud;

/**
 *
 * @author Nathan Castelo
 */
public class  Professor extends Funcionario {
 

public Professor(String nome,String cpf,String idade,String cargo,double salario){ 
super(nome,cpf,idade,cargo,salario);
}

    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String getIdade() {
        return idade;
    }
    @Override
    public void setIdade(String idade) {
        this.idade = idade;
    }
    @Override
    public String getCargo() {
        return cargo;
    }
    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public double getSalario() {
        return salario;
    }
    @Override   
    public void setSalario(double salario) {
        this.salario = salario;
    }
  


   

public double bonusSalario(){
return this.salario*0.21;
		
}

    
}
