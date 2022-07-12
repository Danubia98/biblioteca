package br.com.aceleragep.Biblioteca.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
}
