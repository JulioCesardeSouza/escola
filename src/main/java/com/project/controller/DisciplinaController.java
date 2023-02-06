package com.project.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dto.DisciplinaDTO;
import com.project.service.DisciplinaService;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {
	@Autowired
	private DisciplinaService disciplinaService;
	
	@PostMapping
	public String salvarDisciplina(@RequestBody DisciplinaDTO disciplina) {
		disciplinaService.criaDisciplina(disciplina);
		return "disciplina salvo com sucesso";	
	}
	
	@PostMapping("/lista")
	public String salvarDisciplinaEmLista(@RequestBody List<DisciplinaDTO> disciplinas) {
		disciplinaService.criaDisciplinaEmLista(disciplinas);
		return "disciplina salvo com sucesso";	
	}
		

}
