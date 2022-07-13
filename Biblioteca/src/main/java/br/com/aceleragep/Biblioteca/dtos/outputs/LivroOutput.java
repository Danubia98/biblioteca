package br.com.aceleragep.Biblioteca.dtos.outputs;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivroOutput {

	private Long id;
	private String titulo;
	private Integer anoLancamento;
	private List<AutorOutput> autores;

}
