package com.br.log.api.model.input;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DestinatarioInput {
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String logradouro;
	
	@NotBlank
	private String numero; 
	
	private String complemento;
	
	@NotBlank
	private String bairro;
	
	@NotNull
	private BigDecimal taxa;


}
