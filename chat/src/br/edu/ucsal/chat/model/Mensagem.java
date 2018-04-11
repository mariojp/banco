package br.edu.ucsal.chat.model;

import java.time.LocalDateTime;


public class Mensagem {
	
	private Usuario remetente;
	private Usuario destinatario;
	private String conteudo;
	private LocalDateTime horario;
	
	
	
	
	public Mensagem(Usuario remetente, String conteudo) {
		super();
		this.remetente = remetente;
		this.conteudo = conteudo;
		this.horario = LocalDateTime.now();
	}
	
	

	
	
	public Usuario getRemetente() {
		return remetente;
	}
	public void setRemetente(Usuario remetente) {
		this.remetente = remetente;
	}
	public Usuario getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Usuario destinatario) {
		this.destinatario = destinatario;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public LocalDateTime getHorario() {
		return horario;
	}
	
	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}
	
	@Override
	public String toString() {
		return this.conteudo; 
	}

}
