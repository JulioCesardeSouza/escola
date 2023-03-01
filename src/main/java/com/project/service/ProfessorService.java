package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Professor;
import com.project.repository.ProfessorRepository;

@Service
public class ProfessorService {
	@Autowired
	private ProfessorRepository professorRepository;

	public void criarProfessor(Professor professor) {
		professorRepository.save(professor);
	}

	public List<Professor> retornaTodosProfessores() {
		List<Professor> professores = professorRepository.findAll();
		return professores;

	}

}
