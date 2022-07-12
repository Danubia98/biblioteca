package br.com.aceleragep.Biblioteca.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.aceleragep.Biblioteca.dtos.inputs.LivroInput;
import br.com.aceleragep.Biblioteca.entities.AutorEntity;
import br.com.aceleragep.Biblioteca.entities.LivroEntity;
import br.com.aceleragep.Biblioteca.repositories.LivroRepository;

public class LivroService {
	@Autowired
	private LivroRepository livroRepository;
	@Autowired
	private AutorService autorService;

	public LivroEntity cria(LivroEntity livroEntity, LivroInput livroInput) {
		List<AutorEntity> autores = new ArrayList<>();
		for (Long idAutor : livroInput.getIdsAutores()) {
			AutorEntity autor = autorService.buscaPeloId(idAutor);
			autores.add(autor);
		}
		livroEntity.setAutores(autores);
		return livroRepository.save(livroEntity);
	}

}
