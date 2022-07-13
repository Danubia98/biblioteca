package br.com.aceleragep.Biblioteca.converts;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import br.com.aceleragep.Biblioteca.dtos.inputs.AutorInput;
import br.com.aceleragep.Biblioteca.dtos.outputs.AutorOutput;
import br.com.aceleragep.Biblioteca.entities.AutorEntity;

@Component
public class AutorConvert {

	@Autowired
	private ModelMapper modelMapper;
	public AutorEntity inputToNewEntity(@Valid AutorInput autorInput) {
		return modelMapper.map(autorInput,AutorEntity.class);
	}
	public AutorOutput entityToOutput(AutorEntity autorCriado) {
		return modelMapper.map(autorCriado,AutorOutput.class);
	
	}
	public void copyInputToEntity(AutorEntity autorEncontrado, @Valid AutorInput autorInput) {
		 modelMapper.map(autorInput,autorEncontrado);
	}
	public Page<AutorOutput> listPageEntityToListPageOutput(Page<AutorEntity> listaTodos) {
		return listaTodos.map(this :: entityToOutput);
	}

}
