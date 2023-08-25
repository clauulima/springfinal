package com.proyecto.demo.DAO;

import java.util.List;
import java.util.Optional;

import com.proyecto.demo.modelo.Usuario;


public interface UsuariosDAO {
	
	List<Usuario> findAll();
	
	Optional<Usuario> finfById();
	long deleteUsuario(long id);
	long updateUsuario(long id, Usuario usuario);
	long addUsuario(Usuario usuario);
		
	
	
}
