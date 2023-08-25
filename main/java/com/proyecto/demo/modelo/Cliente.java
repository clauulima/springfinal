package com.proyecto.demo.modelo;



import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "info_cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres;
    private String apellidos;
    private String telefono;

    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;

    @OneToOne(mappedBy = "cliente")
    @JsonIgnore
    private UsuarioRol usuariorol;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "cliente", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Visita> visita = new HashSet<Visita>();

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "cliente", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Capacitacion> capacitaciones = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "cliente", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Siniestro> siniestros = new HashSet<>();


	public Cliente(Long id, String nombres, String apellidos, String telefono, String afp, int sistemaSalud,
			String direccion, String comuna, UsuarioRol usuariorol, Set<Visita> visita,
			Set<Capacitacion> capacitaciones, Set<Siniestro> siniestros) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.usuariorol = usuariorol;
		this.visita = visita;
		this.capacitaciones = capacitaciones;
		this.siniestros = siniestros;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public int getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
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

	public Set<Capacitacion> getCapacitaciones() {
		return capacitaciones;
	}

	public void setCapacitaciones(Set<Capacitacion> capacitaciones) {
		this.capacitaciones = capacitaciones;
	}

	public Set<Siniestro> getAccidentes() {
		return siniestros;
	}

	public void setAccidentes(Set<Siniestro> siniestros) {
		this.siniestros = siniestros;
	}


	

}
