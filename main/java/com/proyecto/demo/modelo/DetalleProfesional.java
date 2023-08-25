package com.proyecto.demo.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "detalle_profesional")
public class DetalleProfesional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Date fechaIngreso;

    @OneToOne(mappedBy = "detalleProfesional")
    @JsonIgnore
    private UsuarioRol usuariorol;

    @OneToMany(mappedBy = "detalleProfesional", fetch = FetchType.LAZY)
    private Set<Visita> visita = new HashSet<Visita>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public UsuarioRol getUsuariorol() {
		return usuariorol;
	}

	public void setUsuariorol(UsuarioRol usuariorol) {
		this.usuariorol = usuariorol;
	}

	public Set<Visita> getVisita() {
		return visita;
	}

	public void setVisita(Set<Visita> visita) {
		this.visita = visita;
	}

	public DetalleProfesional(Long id, String titulo, Date fechaIngreso, UsuarioRol usuariorol, Set<Visita> visita) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
		this.usuariorol = usuariorol;
		this.visita = visita;
	}

	public DetalleProfesional() {
		super();
	}

	
	

}
