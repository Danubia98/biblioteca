package br.com.aceleragep.Biblioteca.dtos.outputs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivroOutput {

	private String titulo;
	private Integer anoLancamento;
	private String autor;

}
