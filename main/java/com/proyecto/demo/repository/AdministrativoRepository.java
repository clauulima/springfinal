package com.proyecto.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.proyecto.demo.modelo.Administrativo;
import com.proyecto.demo.modelo.UsuarioRol;

@Repository
@EnableJpaRepositories
public interface AdministrativoRepository extends JpaRepository<Administrativo, Long> {

    Administrativo findByUsuariorol(UsuarioRol usuarioRol);

}
