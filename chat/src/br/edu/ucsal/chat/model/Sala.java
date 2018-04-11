package br.edu.ucsal.chat.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class Sala {

	private Collection<Usuario> usuarios = new TreeSet<>();
	
	
	public Collection<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public void setUsuarios(Collection<Usuario> usuarios) {
		this.usuarios = usuarios;
		 
	}
	
	public boolean adicionarUsuario(Usuario usuario) {
		///if(usuario.getNome().equals("TODOS")) 
		return usuarios.add(usuario);
	}
	
	
	public void addMensagem(Mensagem mensagem, String destinatario ) {
		Usuario dest = this.getUsuario(destinatario);
		if(dest == null) {
			for (Usuario usuario : usuarios) {
				usuario.add(mensagem);
			}
		}else {
			dest.add(mensagem);
			mensagem.getRemetente().add(mensagem);;
		}
		
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
