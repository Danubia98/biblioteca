package br.com.aceleragep.Biblioteca.dtos.inputs;

import java.util.List;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivroInput {

	@Length(max = 200)
	@NotBlank(message = "titulo obrigatório")
	private String titulo;
	@NotNull(message = "ano lançamento obrigatório")
	@DecimalMax("9999")
	private Integer anoLancamento;
	@NotEmpty(message = "Deve ter pelo menos 1 autor!")
	private List<Long> idsAutores;
}
