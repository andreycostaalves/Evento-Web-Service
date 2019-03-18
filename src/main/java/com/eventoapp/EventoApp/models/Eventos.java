package com.eventoapp.EventoApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Eventos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//preenche automaticamente o valor do "codigo";
	private Long codigo;
	@NotBlank                                          //@Notblank - torna o preenchimento dos campos obrigatorio.
	private String  nome;
	@NotBlank
	private String local;
	@NotBlank
	private String data;
	@NotBlank
	private String horario;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
	

}
