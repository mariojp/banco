package br.edu.ucsal.model;

public class Usuario {

	private String login;
	private String senha;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(String login) {
		this.login = login;		
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		Usuario other = (Usuario) obj;
		return this.getLogin().equals(other.getLogin());
	}
	
}
