package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Aluno;
import com.project.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;
	
	public void criaAluno(Aluno aluno) {
		alunoRepository.save(aluno);
	}
	public List<Aluno> retornaAlunos(){
		return alunoRepository.findAll();
	}

}
