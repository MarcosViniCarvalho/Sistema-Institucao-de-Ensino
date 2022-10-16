package com.mycompany.crud;

import java.util.ArrayList;

/**
 * @author Marcos Carvalho
 */
public class Disciplinas {
    
    private String nomeDisc;
    private int sala;
    private double horario;
    
    //remover, adicionar ou consultar alunos e suas disciplinas deverá ser feito nas listas das duas classes
    //utilizar indexOf
    private ArrayList<Aluno> alunos = new ArrayList<>(); 
  
    //construtor

    public Disciplinas(String nomeDisc, int sala, double horario) {
        this.nomeDisc = nomeDisc;
        this.sala = sala;
        this.horario = horario;
    }
    
        public Disciplinas(String nomeDisc, int sala, double horario, ArrayList<Aluno> alunos) {
        this.nomeDisc = nomeDisc;
        this.sala = sala;
        this.horario = horario;
        this.alunos = alunos;
    }

    public Disciplinas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //Getters and Setters
    
    public String getNomeDisc() {
        return nomeDisc;
    }

    public int getSala() {
        return sala;
    }

    public double getHorario() {
        return horario;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setNomeDisc(String nomeDisc) {
        this.nomeDisc = nomeDisc;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
        //Metodos
        //Adicionar alunos
        public void addAluno (String nome, double matricula, double cpf, double idade){
            alunos.add(new Aluno(nome, matricula, cpf, idade));
        }
}
