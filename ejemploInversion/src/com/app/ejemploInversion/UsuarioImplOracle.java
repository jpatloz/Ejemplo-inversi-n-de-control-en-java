package com.app.ejemploInversion;

public class UsuarioImplOracle implements IUsuario{

	@Override
	public void insertaUsuario() {
		System.out.println("Insertando usuario en Oracle");
		
	}

	@Override
	public void eliminaUsuarioByID(int id) {
		System.out.println("Eliminando usuario en Oracle: " + id);
		
	}

}
