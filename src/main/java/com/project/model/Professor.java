package com.project.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_professor")
public class Professor implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private int idade;
	private boolean leciona;
	@ManyToMany(mappedBy = "professores")
	private List<Disciplina> disciplinas;

	public Professor() {

	}

	public Professor(Integer id, String nome, int idade, boolean leciona, String materia) {

		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.leciona = leciona;

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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isLeciona() {
		return leciona;
	}

	public void setLeciona(boolean leciona) {
		this.leciona = leciona;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

}
