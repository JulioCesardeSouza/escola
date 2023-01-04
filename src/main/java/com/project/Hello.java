package com.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping("/teste1/{nome}")
	public String hello(@PathVariable String nome) {
		return "Ola " + nome;
	}

	@GetMapping("/teste2")
	public String hello(@RequestParam String nome, @RequestParam String sobreNome) {
		return "Ola " + nome +"-"+ sobreNome;
	}
}
