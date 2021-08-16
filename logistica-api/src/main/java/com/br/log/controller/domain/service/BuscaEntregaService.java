package com.br.log.controller.domain.service;

import org.springframework.stereotype.Service;

import com.br.log.controller.domain.exception.EntidadeNaoEcontradaException;
import com.br.log.domain.model.Entrega;
import com.br.log.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
	
	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		
		return  entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEcontradaException("Entrega não encontrada"));
		
	}

}
