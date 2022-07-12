package br.com.aceleragep.Biblioteca.dtos.inputs;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AutorInput {

	@Length(max = 100)
	@NotBlank(message = "nome obrigatório")
	private String nome;

	@Length(max = 1000)
	@NotBlank(message = "biografia obrigatória")
	private String biografia;

}
