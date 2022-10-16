
package com.mycompany.crud;

/**
 *
 * @author Nathan Castelo
 */
public class Coordenador extends Funcionario {
    //atributos extendidos da classe funcionrio e da classe pessoa

public Coordenador (String nome,String cpf,String idade,String cargo,double salario){ 
super(nome,cpf,idade,cargo,salario);
}
//método para sobrescrever os atributos 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
  


   

public double bonusSalario(){
return this.salario*0.30;
		
}

}
