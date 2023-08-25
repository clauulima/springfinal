package com.proyecto.demo.services;


import java.util.List;

import com.proyecto.demo.modelo.UsuarioRol;



public interface UsuarioRolService {

    UsuarioRol guardarUsuarioRol(UsuarioRol usuarioRol) throws Exception;

    List<UsuarioRol> obtenerUsuarioRolUsuario(Long usuarioId);

    void eliminarUsuarioRol(Long usuarioRolId);

    List<UsuarioRol> obtenerUsuarioRol();

    List<UsuarioRol> obtenerUsuarioRolRol(Long rolId);

    UsuarioRol actualizarUsuarioRol(UsuarioRol usuarioRol) throws Exception;

}
