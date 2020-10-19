package com.teste.pacotes.entities;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Teste")
public class HelloWorld {
	private String nome;
	
	    @RequestMapping
	   public String hello() {
		   return "Hello World\nTeste implementado pelo grupo \"Desprogramadores\" "+nome;
	   }
	    
	    @PostMapping
	    public void mudaNome(@RequestBody String nome) {
	    this.nome = nome;	
	    	
	    }

}
