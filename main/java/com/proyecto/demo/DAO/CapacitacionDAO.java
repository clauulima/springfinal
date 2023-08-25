package com.proyecto.demo.DAO;

import java.util.List;
import java.util.Optional;

import com.proyecto.demo.modelo.Capacitacion;

public interface CapacitacionDAO {
List<Capacitacion> findAll();
	
	Optional<Capacitacion> findById(long id);
	long deleteCapacitacion(long id);
	long updateCapacitacion(long id, Capacitacion capacitacion);
	long addCapacitacion(Capacitacion capacitacion);
}
