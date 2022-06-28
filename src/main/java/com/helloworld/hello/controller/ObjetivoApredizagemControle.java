package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivoaprendizagem")

public class ObjetivoApredizagemControle {

	@GetMapping
	public String objetivoaprendizagem() {
		return "Meu objetivo de aprendizagem é:\n\n"
				+ "- Me comunicar de forma eficiente;\n\n"
				+ "- Aprender funcionalidades técnicas nível Junior;\n\n"
				+ "- Ser proativa.\n\n"
				+ "- Trabalhar em equipe.";
	}

}
