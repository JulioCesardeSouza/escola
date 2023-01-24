package com.project.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_aluno")
public class Aluno implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	private String nome;
	private String sobreNome;
	@ManyToOne
	@JoinColumn(name = "disciplina_id",referencedColumnName = "id")
	private Disciplina disciplina;

	public Aluno() {

	}

	public Aluno(Integer id, String nome, String sobreNome) {
		
		this.id = id;
		this.nome = nome;
		this.sobreNome = sobreNome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	

	
}
