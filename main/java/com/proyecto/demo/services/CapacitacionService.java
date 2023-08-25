package com.proyecto.demo.services;

import java.util.Set;

import com.proyecto.demo.modelo.Capacitacion;



public interface CapacitacionService {

    Capacitacion guardarCapacitacion(Capacitacion capacitacion);

    Capacitacion actualizarCapacitacion(Capacitacion capacitacion);

    void eliminarCapacitacion(Long id);

    Capacitacion buscarCapacitacionId(Long id);

    Set<Capacitacion> buscarCapacitaciones();

    Set<Capacitacion> buscarCapacitacionesPorDetalleCliente(Long id);



}
