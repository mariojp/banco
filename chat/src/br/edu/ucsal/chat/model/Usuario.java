package br.edu.ucsal.chat.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Comparable<Usuario>{
	
	private String nome;
	private String cor;
	
	private List<Mensagem> mensagens = new ArrayList<>();

	
	public Usuario() {
	}
	
	public Usuario(String nome, String cor) {
		super();
		this.nome = nome;
		this.cor = cor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public boolean equals(Object other) {
		return this.nome.equals(((Usuario) other).getNome());
	}

	@Override
	public int compareTo(Usuario other) {
		return this.getNome().compareToIgnoreCase(other.getNome());
	}
	
	@Override
	public int hashCode() {
		return nome.hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome;
	}

	public void add(Mensagem mensagem) {
		mensagens.add(mensagem);		
	}
	
	public StringBuilder mensagens() {
		StringBuilder sb = new StringBuilder();
		for (Mensagem mensagem : mensagens) {
			sb.append(mensagem.getRemetente());
			sb.append(" : ");
			sb.append(mensagem.getConteudo());
			sb.append("\n");
		}
		return sb;
	}
	
}
