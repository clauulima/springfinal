package com.proyecto.demo.services;

import java.util.Set;

import com.proyecto.demo.modelo.Administrativo;

public interface AdministrativoService {

    Administrativo crearAdministrativo(Administrativo detalleadministrativo) throws Exception;

    Administrativo actualizarAdministrativo(Administrativo detalleadministrativo);

    void eliminarAdministrativo(Long id) throws Exception;

    Administrativo obtenerAdministrativo(Long id) throws Exception;

    Set<Administrativo> listarAdministrativos();

}
