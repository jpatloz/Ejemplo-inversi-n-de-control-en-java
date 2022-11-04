package com.app.ejemploInversion;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsuarioFactory obj = new UsuarioFactory(new UsuarioImplMongo());
		obj.getInsertaUsuario();
		obj.getEliminaUsuarioById(1);
	}

}
