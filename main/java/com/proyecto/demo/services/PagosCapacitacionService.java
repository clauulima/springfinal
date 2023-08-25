package com.proyecto.demo.services;

import java.util.Set;

import com.proyecto.demo.modelo.PagosCapacitacion;



public interface PagosCapacitacionService {

    PagosCapacitacion guardarPagosCapacitacion(PagosCapacitacion pagoscapacitacion);

    PagosCapacitacion actualizarPagosCapacitacion(PagosCapacitacion pagoscapacitacion);

    void eliminarPagosCapacitacion(Long id);

    PagosCapacitacion buscarPagosCapacitacion(Long id);

    Set<PagosCapacitacion> listarPagosCapacitacion();

    Set<PagosCapacitacion> listarPagosCapacitacionPorCapacitacion(Long id);

}
