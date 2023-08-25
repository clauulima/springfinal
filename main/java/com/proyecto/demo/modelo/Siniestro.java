package com.proyecto.demo.modelo;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Siniestro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private String descripcion;

    @ManyToOne(fetch = FetchType.EAGER)
    private Cliente infoCliente;

    public Siniestro(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getInfoCliente() {
		return infoCliente;
	}

	public void setInfoCliente(Cliente infoCliente) {
		this.infoCliente = infoCliente;
	}
    
    
}