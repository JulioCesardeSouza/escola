package com.project.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Aluno;
import com.project.model.Disciplina;
import com.project.service.AlunoService;
import com.project.service.DisciplinaService;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {
	@Autowired
	private DisciplinaService disciplinaService;
	
	@PostMapping
	public String salvarDisciplina(@RequestBody Disciplina disciplina) {
		disciplinaService.criaAluno(disciplina);
		return "disciplina salvo com sucesso";	
	}
		

}
