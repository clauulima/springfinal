package com.proyecto.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Capacitacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String detalle;
    private int cantidad_participantes;
    private String lugar_capacitacion;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Cliente cliente;

    public Capacitacion() {
        super();
    }

    public Capacitacion(Long id, String nombre, String detalle, int cantidad_participantes, String lugar_capacitacion) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantidad_participantes = cantidad_participantes;
        this.lugar_capacitacion = lugar_capacitacion;
    }

    @Override
    public String toString() {
        return "Capacitacion [id=" + id + ", nombre=" + nombre + ", detalle=" + detalle + ", cantidad_participantes="
                + cantidad_participantes + ", lugar_capacitacion=" + lugar_capacitacion + "]";
    }
}
