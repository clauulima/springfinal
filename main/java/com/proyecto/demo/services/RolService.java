package com.proyecto.demo.services;

import java.util.List;

import com.proyecto.demo.modelo.Rol;



public interface RolService {

    Rol agrergarRol(Rol rol) throws Exception;

    Rol obtenerRolPorId(Long id);

    void eliminarRol(Long id);

    Rol actualizarRol(Rol rol) throws Exception;

    List<Rol> obtenerRoless();

    Rol obtenerRolPorNombre(String nombre);


}
