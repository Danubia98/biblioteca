package br.com.aceleragep.Biblioteca.controllers;



import javax.validation.Valid;

import org.springdoc.api.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aceleragep.Biblioteca.configs.ControllerConfig;
import br.com.aceleragep.Biblioteca.converts.AutorConvert;
import br.com.aceleragep.Biblioteca.converts.LivroConvert;
import br.com.aceleragep.Biblioteca.dtos.inputs.AutorInput;
import br.com.aceleragep.Biblioteca.dtos.outputs.AutorOutput;
import br.com.aceleragep.Biblioteca.dtos.outputs.LivroAutorOutput;
import br.com.aceleragep.Biblioteca.entities.AutorEntity;
import br.com.aceleragep.Biblioteca.entities.LivroEntity;
import br.com.aceleragep.Biblioteca.services.AutorService;
import br.com.aceleragep.Biblioteca.services.LivroService;

@RestController
@RequestMapping(ControllerConfig.PRE_URL + "/autores")
public class AutorController {
	@Autowired
	private AutorService autorService;

	@Autowired
	private LivroService livroService;

	@Autowired
	private AutorConvert autorConvert;

	@Autowired
	private LivroConvert livroConvert;

	@PostMapping
	public AutorOutput cria(@RequestBody @Valid AutorInput autorInput) {
		AutorEntity autorEntity = autorConvert.inputToNewEntity(autorInput);
		AutorEntity autorCriado = autorService.cria(autorEntity);
		return autorConvert.entityToOutput(autorCriado);
	}

	@PutMapping("/{id}")
	public AutorOutput atualiza(@PathVariable Long id, @RequestBody @Valid AutorInput autorInput) {
		AutorEntity autorEncontrado = autorService.buscaPeloId(id);
		autorConvert.copyInputToEntity(autorEncontrado, autorInput);
		AutorEntity autorAtualizado = autorService.atualiza(autorEncontrado);
		return autorConvert.entityToOutput(autorAtualizado);
	}

	@GetMapping("/{id}")
	public AutorOutput buscaPorId(@PathVariable Long id) {
		AutorEntity autorEncontrado = autorService.buscaPeloId(id);
		return autorConvert.entityToOutput(autorEncontrado);
	}

	@GetMapping
	 public Page<AutorOutput> listaTodos(
	            @ParameterObject @PageableDefault(page = 0, size = 5, sort = "nome", direction = Direction.ASC) Pageable paginacao) {
	        Page<AutorEntity> listaTodos = autorService.listaTodos(paginacao);
	        return autorConvert.listPageEntityToListPageOutput(listaTodos);
	    
	}

	@GetMapping("/{id}/livros")
    public Page<LivroAutorOutput> buscaLivroPeloIdDoAutor(@PathVariable Long id,
            @ParameterObject @PageableDefault(page = 0, size = 5, sort = "titulo", direction = Direction.ASC) Pageable paginacao) {
        autorService.buscaPeloId(id);
        Page<LivroEntity> livros = livroService.buscaLivrosPeloIdAutor(id, paginacao);
        return livroConvert.listPageEntityToListPageOutputCopy(livros);
    
	}

	
	
	
	
	
}
