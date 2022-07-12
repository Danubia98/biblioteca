package br.com.aceleragep.Biblioteca.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.aceleragep.Biblioteca.configs.ControllerConfig;
import br.com.aceleragep.Biblioteca.converts.LivroConvert;
import br.com.aceleragep.Biblioteca.dtos.inputs.LivroInput;
import br.com.aceleragep.Biblioteca.dtos.outputs.LivroOutput;
import br.com.aceleragep.Biblioteca.entities.LivroEntity;
import br.com.aceleragep.Biblioteca.services.LivroService;

@RestController
@RequestMapping(ControllerConfig.PRE_URL + "/livros")
public class LivroController {

	@Autowired
	private LivroConvert livroConvert;

	@Autowired
	private LivroService livroService;

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping
	public LivroOutput cria(@RequestBody @Valid LivroInput livroInput) {
		LivroEntity livroEntity = livroConvert.inputToNewEntity(livroInput);
		LivroEntity livroCriado = livroService.cria(livroEntity, livroInput);
		return livroConvert.entityToOutput(livroCriado);
	}

}