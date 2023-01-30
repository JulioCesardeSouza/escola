package com.project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dto.DisciplinaDTO;
import com.project.model.Aluno;
import com.project.model.Disciplina;
import com.project.model.Professor;
import com.project.repository.AlunoRepository;
import com.project.repository.DisciplinaRepository;
import com.project.repository.ProfessorRepository;

@Service
public class DisciplinaService {
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	@Autowired
	private AlunoRepository alunoRepository;
	@Autowired
	private ProfessorRepository professorRepository;

	public void criaDisciplina(DisciplinaDTO dto) {
		Disciplina disciplina = new Disciplina();
		List<Aluno> alunos = new ArrayList<>();
		List<Professor> professores = new ArrayList<>();
		List<Disciplina> disciplinas = new ArrayList<>();
		// disciplina = dtoParaEnt(dto);
		
		for (Integer id : dto.getAlunos()) {
			Optional<Aluno> aluno = alunoRepository.findById(id);
			aluno.get().setDisciplina(disciplina);
			alunos.add(aluno.get());

		}
		for(Integer id : dto.getProfessores()) {
		   Optional<Professor> professor = professorRepository.findById(id);
			professores.add(professor.get());
			professor.get().setDisciplinas(disciplinas);
		}	
		disciplina.setAlunos(alunos);
		disciplinaRepository.save(disciplina);
	}
	

		
		

		
		 
		 
	}


