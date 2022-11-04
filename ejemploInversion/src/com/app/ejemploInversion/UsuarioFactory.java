package com.app.ejemploInversion;

public class UsuarioFactory {
	
	IUsuario user;
	
	public UsuarioFactory(IUsuario user) {
		this.user = user;
	}

	public void getInsertaUsuario() {
		user.insertaUsuario();
	}
	
	public void getEliminaUsuarioById(int id) {
		user.eliminaUsuarioByID(id);
	}
}
