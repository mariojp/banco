package br.edu.ucsal.chat.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class Sala {

	private List<Mensagem> mensagens = new ArrayList<>();
	private Collection<Usuario> usuarios = new TreeSet<>();
	
	
	public List<Mensagem> getMensagens() {
		return mensagens;
	}
	public void setMensagens(List<Mensagem> mensagens) {
		this.mensagens = mensagens;
	}
	public Collection<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Collection<Usuario> usuarios) {
		this.usuarios = usuarios;
		 
	}
	
	public boolean adicionarUsuario(Usuario usuario) {
		return usuarios.add(usuario);
	}
	
	
	public StringBuilder mensagens(Usuario usuario) {
		StringBuilder sb = new StringBuilder();
		for (Mensagem mensagem : mensagens) {
			if(
					mensagem.getDestinatario() == null ||
					mensagem.getRemetente().equals(usuario) || 
					mensagem.getDestinatario().equals(usuario)
					) {
				
				sb.append(mensagem.getHorario());
				sb.append(mensagem.getRemetente());
				sb.append(": ");
				sb.append(mensagem.getConteudo());
				sb.append("\n");
				
			}
		}
		return sb;
	}
	public void addMensagem(Mensagem mensagem) {
		mensagens.add(mensagem);
		
	}
	public Usuario getUsuario(String destinatario) {
		Usuario u = null;
		for (Usuario usuario : usuarios) {
			if(usuario.getNome().equals(destinatario)) {
				u = usuario;
			}
		}
		return u;
	}
}
