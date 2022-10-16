
package com.mycompany.crud;

/**
 *
 * @author Ryckelme o pensador
 */
public class Limpeza extends Funcionario {
    //construtores
    public Limpeza(String nome, String cpf, String idade, String cargo, double salario) {
        super(nome, cpf, idade, cargo, salario);
    }

    
    //get and set
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    //override
    
    @Override
    public void setCargo(String cargo) {
        super.setCargo(cargo); 
    }

    @Override
    public void setIdade(String idade) {
        super.setIdade(idade); 
    }

    @Override
    public String getCargo() {
        return super.getCargo(); 
    }

    @Override
    public String getIdade() {
        return super.getIdade(); 
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf); 
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); 
    }

    @Override
    public String getCpf() {
        return super.getCpf(); 
    }

    @Override
    public String getNome() {
        return super.getNome(); 
    }
    
    public double bonusSalario(){
    return this.salario*0.10;
		
}

}
