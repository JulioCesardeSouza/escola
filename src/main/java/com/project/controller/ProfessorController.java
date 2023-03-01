package com.project.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Aluno;
import com.project.model.Professor;
import com.project.service.ProfessorService;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
	@Autowired
	private ProfessorService professorService;
	
	@PostMapping
	public String salvaProfessor(@RequestBody Professor professor) {
		professorService.criarProfessor(professor);
		return "professor salvo com sucesso";
	}
	
	@GetMapping
	public List<Professor> retornaTodosProfessores(){
		return professorService.retornaTodosProfessores();
	}
	

}
