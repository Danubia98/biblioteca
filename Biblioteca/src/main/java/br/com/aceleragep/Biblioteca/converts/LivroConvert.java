package br.com.aceleragep.Biblioteca.converts;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import br.com.aceleragep.Biblioteca.dtos.inputs.LivroInput;
import br.com.aceleragep.Biblioteca.dtos.outputs.LivroOutput;
import br.com.aceleragep.Biblioteca.entities.LivroEntity;

@Component
public class LivroConvert {

	@Autowired
	private ModelMapper modelMapper;

	public LivroEntity inputToNewEntity(@Valid LivroInput livroInput) {
		LivroEntity livroEntity = modelMapper.map(livroInput, LivroEntity.class);
		return livroEntity;

	}

	public LivroOutput entityToOutput(LivroEntity livroCriado) {

		return modelMapper.map(livroCriado, LivroOutput.class);

	}

	public void copyInputToEntity(LivroEntity livroLocalizado, @Valid LivroInput livroInput) {
		modelMapper.map(livroInput, livroLocalizado);
		
	}

	public Page<LivroOutput> listPageEntityToListPageOutput(Page<LivroEntity> livrosLocalizados) {
		return livrosLocalizados.map(this :: entityToOutput);
	}
}
