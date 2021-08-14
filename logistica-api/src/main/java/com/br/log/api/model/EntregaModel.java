package com.br.log.api.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.br.log.domain.model.StatusEntrega;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntregaModel {

	private Long id;
	private String nomecliente;
	private DestinatarioModel destinatario;
	private BigDecimal taxa;
	private StatusEntrega satus;
	private OffsetDateTime dataPedido;
	private OffsetDateTime dataFinalizacao;
		
	
}
