package com.proyecto.demo.services;

import java.util.Set;

import com.proyecto.demo.modelo.DetalleProfesional;



public interface ProfesionalService {

    DetalleProfesional guardarProfesional(DetalleProfesional detalleProfesional) throws Exception;

    DetalleProfesional actualizarProfesional(DetalleProfesional detalleProfesional);

    void eliminarProfesional(Long id);

    DetalleProfesional obtenerProfesional(Long id);

    Set<DetalleProfesional> listarProfesionales();



}
