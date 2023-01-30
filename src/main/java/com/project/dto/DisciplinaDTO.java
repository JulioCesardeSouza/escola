package com.project.dto;

import java.util.List;

public class DisciplinaDTO {

	private String descricao;
	private String periodo;
	private String nome;
	private List<Integer> alunos;
	private List<Integer> professores;

	public DisciplinaDTO() {

	}

	public DisciplinaDTO(String descricao, String periodo, String nome) {

		this.descricao = descricao;
		this.periodo = periodo;
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Integer> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Integer> alunos) {
		this.alunos = alunos;
	}
	public List<Integer> getProfessores() {
		return professores;
	}
	public void setProfessores(List<Integer> professores) {
		this.professores = professores;
	}

}
