package br.com.aceleragep.Biblioteca.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.aceleragep.Biblioteca.entities.AutorEntity;
import br.com.aceleragep.Biblioteca.repositories.AutorRepository;

@Service
public class AutorService {

	@Autowired
	private AutorRepository autorRepository;

	public AutorEntity buscaPeloId(Long id) {
		Optional<AutorEntity> encontrou = autorRepository.findById(id);
		if (encontrou.isPresent()) {
			return encontrou.get();
		} else {
			throw new RuntimeException("Autor " + id + " não encontrado");

		}
	}

	public AutorEntity cria(AutorEntity autorEntity) {
		return autorRepository.save(autorEntity);
		
	}

	public AutorEntity atualiza(AutorEntity autorEncontrado) {
		return autorRepository.save(autorEncontrado);
	}

	public Page<AutorEntity> listaTodos(Pageable paginacao) {
		Page<AutorEntity> encontrou = autorRepository.findAll(paginacao);
		return encontrou;
		
	}

	
	
}
