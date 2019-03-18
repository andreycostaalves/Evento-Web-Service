package com.eventoapp.EventoApp.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eventoapp.EventoApp.models.Eventos;
import com.eventoapp.EventoApp.repository.EventoRepository;

@RestController
@RequestMapping("/evento")
public class EventoResource {
	
	@Autowired
	private EventoRepository er;
	
	//RETORNA UMA LISTA COM OS EVENTOS DO BANCO DE DADOS;
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Eventos> listaEventos() {
		Iterable<Eventos> listaEventos = er.findAll();
		return listaEventos;
		
	}
	//SALVAR EVENTOS NO BANCO
	@PostMapping
	public Eventos cadastraEvento(@RequestBody @Valid Eventos evento) {
		return er.save(evento);
	}
	//DELETAR EVENTOS	
	@DeleteMapping
	public Eventos deletaEvento(@RequestBody Eventos evento) {
		 er.delete(evento);
		 return evento;
	}
	
	
	

}
