package com.project.model;

import java.io.Serializable;
import java.util.List;

import com.project.enums.Periodo;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_disciplina")
public class Disciplina implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	@Enumerated(EnumType.STRING)
	private Periodo periodo;
	private String nome;
	@OneToMany(mappedBy = "disciplina", fetch = FetchType.LAZY)
	private List<Aluno> alunos;
	@ManyToMany
	@JoinTable(name = "disciplina_professor", joinColumns = @JoinColumn(name = "disciplina_id", referencedColumnName = "id", nullable = true), inverseJoinColumns = @JoinColumn(name = "professor_id", referencedColumnName = "id", nullable = true))
    private List<Professor> professores;

	public Disciplina() {

	}

	public Disciplina(Integer id, String descricao,	Periodo periodo, String nome) {

		this.id = id;
		this.descricao = descricao;
		this.periodo = periodo;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

}
