package com.mycompany.crud;

import java.util.ArrayList;

/**
 * @author Marcos Carvalho
 */

public class Faculdade {
    
    public static String nomeFantasia;
    public static String CNPJ ;
    
    public static ArrayList<Curso> cursos = new ArrayList<>();
 
    public Faculdade() {
    }
    
    public Faculdade(String nome, String CNPJ, ArrayList<Curso> cursos){
        Faculdade.nomeFantasia = nome;
        Faculdade.CNPJ = CNPJ;
        Faculdade.cursos = cursos;
    }
    
    //Getters

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }
    
    //Setters

    public void setNomeFantasia(String nomeFantasia) {
        Faculdade.nomeFantasia = nomeFantasia;
    }

    public void setCNPJ(String CNPJ) {
        Faculdade.CNPJ = CNPJ;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        Faculdade.cursos = cursos;
    }
    
    //Metodos
    //Adicionar
    public void addCurso(String nome, double mensalidade){
        cursos.add(new Curso(nome, mensalidade));
        
        
    }
    
}
