
package com.mycompany.crud;

import java.util.ArrayList;

/**
 * @author Marcos Carvalho
 */
public class Curso {
    	private String nomeCurs;
	private double mensalidade;
	
	public	ArrayList<Disciplinas> disciplinas = new ArrayList <>();
        
	//Construtores
	
	public Curso (String nomeCurs, double mensalidade) {
		this.nomeCurs = nomeCurs;
		this.mensalidade = mensalidade;
	}
	
	public Curso (String nomeCurs, double mensalidade, ArrayList<Disciplinas> diciplinas) {
		this.nomeCurs = nomeCurs;
		this.mensalidade = mensalidade;
		
	}
	
	//Getters and Setters

	public String getNomeCurs() {
		return nomeCurs;
	}

	public void setNomeCurs(String nomeCurs) {
		this.nomeCurs = nomeCurs;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public ArrayList<Disciplinas> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplinas> disciplinas) {
		this.disciplinas = disciplinas;
	}
        //Metodos
        //Adicionar disciplinas
        public void addDisc (String nome, int sala, double horario){
            disciplinas.add(new Disciplinas(nome, sala, horario));
        }
}
