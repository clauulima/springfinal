package com.proyecto.demo.services;

import java.util.Set;

import com.proyecto.demo.modelo.Cliente;



public interface ClienteService {

    Cliente guardarDetalleCliente(Cliente detallecliente) throws Exception;

    Cliente actualizarDetalleCliente(Cliente detallecliente);

    void eliminarDetalleCliente(Long id) ;

    Cliente buscarDetalleCliente(Long id) throws Exception;

    Set<Cliente> obtenerDetalleClientes();



}
