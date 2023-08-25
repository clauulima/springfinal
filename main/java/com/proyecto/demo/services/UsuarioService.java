package com.proyecto.demo.services;

import java.util.Set;

import com.proyecto.demo.modelo.Usuario;
import com.proyecto.demo.modelo.UsuarioRol;



public interface UsuarioService {

    Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    Usuario obtenerUsuario(String username);

    void eliminarUsuario(Long usuarioId);

    Set<Usuario> obtenerUsuarios();

    Usuario actualizarUsuario(Usuario usuario) throws Exception;

    Usuario obtenerUsuarioPorId(Long usuarioId);

    Usuario actualizarContrasena(Usuario usuario) throws Exception;

}