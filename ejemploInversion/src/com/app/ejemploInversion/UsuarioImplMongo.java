package com.app.ejemploInversion;

public class UsuarioImplMongo implements IUsuario {

	@Override
	public void insertaUsuario() {
		System.out.println("Insertando usuario en Mongo");
	}

	@Override
	public void eliminaUsuarioByID(int id) {
		System.out.println("Eliminando usuario en Mongo: " + id);

	}

}
