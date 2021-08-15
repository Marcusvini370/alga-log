package com.br.log.api.model;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OcorrenciaInput {
	
	@NotBlank
	private String descricao;

}
