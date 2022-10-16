
package com.mycompany.crud;

/**
 *
 * @author Pablo Wendell
 */
public class Diretor extends Funcionario {
    //atributos extendidos da classe funcionrio e da classe pessoa.
    public Diretor(String nome, String cpf, String idade, String cargo, double salario) {
        super(nome, cpf, idade, cargo, salario);
    }
//método para sobrescrever os atributos    
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

    @Override
    public String toString() {
        return super.toString(); 
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
    
    
    @Override
    public void setSalario(double salario) {
        super.setSalario(salario); 
    }

    @Override
    public void setCargo(String cargo) {
        super.setCargo(cargo); 
    }

    @Override
    public void setIdade(String idade) {
        super.setIdade(idade); 
    }

    @Override
    public double getSalario() {
        return super.getSalario(); 
    }

    @Override
    public String getCargo() {
        return super.getCargo(); 
    }

    @Override
    public String getIdade() {
        return super.getIdade(); 
    }

    public double bonusSalario(){
        return this.salario*0.25;
		
}

}
