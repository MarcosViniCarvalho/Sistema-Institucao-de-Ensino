package com.mycompany.crud;

import java.util.ArrayList;

/**
 * @author Marcos Carvalho
 */
public class Aluno {
    private String nome;
    private double matricula;
    private double cpf;
    private double idade;
    
    //Um aluno tem uma lista de disciplinas assim como curso, mas não é a mesma quantidade!
    //Ex , um curso pode ter 20 disciplinas totais, mas um aluno por cursar 5 simultaneas.
    // private ArrayList<Disciplinas> disciplinas = new ArrayList<Disciplinas>(); 

    //Construtores

    public Aluno(String nome, double matricula, double cpf, double idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.idade = idade;
    }
    
        public Aluno(String nome, double matricula, double cpf, double idade, ArrayList<Disciplinas> disciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    
    //Getters
    
    public String getNome() {
        return nome;
    }

    public double getMatricula() {
        return matricula;
    }

    public double getCpf() {
        return cpf;
    }

    public double getIdade() {
        return idade;
    }

    //Setters
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    
    
    
}
