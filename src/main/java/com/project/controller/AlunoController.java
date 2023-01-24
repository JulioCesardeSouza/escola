package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Aluno;
import com.project.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	@Autowired
	private AlunoService alunoService;
	
	@PostMapping
	public String salvaAluno(@RequestBody Aluno aluno) {
		alunoService.criaAluno(aluno);
		return "aluno salvo com sucesso";
	}
	@GetMapping
	public List<Aluno> retornaTodosAlunos(){
		return alunoService.retornaAlunos();
		
	}

}
