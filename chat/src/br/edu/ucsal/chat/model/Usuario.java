package br.edu.ucsal.chat.model;

public class Usuario implements Comparable<Usuario>{
	
	private String nome;
	private String cor;
	
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
	
}
