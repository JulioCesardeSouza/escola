package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Disciplina;
import com.project.repository.DisciplinaRepository;

@Service
public class DisciplinaService {
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	public void criaAluno(Disciplina disciplina) {
		disciplinaRepository.save(disciplina);
	}
}
