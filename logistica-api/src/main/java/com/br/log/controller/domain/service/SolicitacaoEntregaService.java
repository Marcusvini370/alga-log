package com.br.log.controller.domain.service;

import java.time.OffsetDateTime;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.br.log.domain.model.Cliente;
import com.br.log.domain.model.Entrega;
import com.br.log.domain.model.StatusEntrega;
import com.br.log.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SolicitacaoEntregaService {

	private CatalogoClienteService catalogoClienteService;
	private EntregaRepository entregaRepository;
	
	@Transactional
	public Entrega solicitar(Entrega entrega) {
		
	   //consulta se o cliente que foi consultado na entrega se ele existe
	  Cliente cliente = catalogoClienteService.buscar(entrega.getCliente().getId());
	   
	  entrega.setCliente(cliente);
	  entrega.setStatus(StatusEntrega.PENDENTE); 
	  entrega.setDataPedido(OffsetDateTime.now()); //data atual
	   
	   return entregaRepository.save(entrega);
	}
	
}
