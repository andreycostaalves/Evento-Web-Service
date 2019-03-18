package com.eventoapp.EventoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventoapp.EventoApp.models.Eventos;

public interface EventoRepository extends JpaRepository<Eventos, String> {

	
}
