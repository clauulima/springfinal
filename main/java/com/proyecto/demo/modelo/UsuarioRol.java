package com.proyecto.demo.modelo;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UsuarioRol {
	
	private UsuarioRol usuarioRol;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioRolId;

    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.EAGER)
    private Rol rol;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "usuarioRol")
    private Administrativo administrativo;

    public UsuarioRol() {
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
