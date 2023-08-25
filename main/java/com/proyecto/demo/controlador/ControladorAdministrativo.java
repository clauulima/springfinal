package com.proyecto.demo.controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.demo.modelo.Administrativo;
import com.proyecto.demo.services.AdministrativoService;

@RestController
@RequestMapping("/administrativo")
@CrossOrigin("*")
public class ControladorAdministrativo {

    private final AdministrativoService administrativoService;

    @Autowired
    public ControladorAdministrativo(AdministrativoService administrativoService) {
        this.administrativoService = administrativoService;
    }

    @PostMapping("/")
    public ResponseEntity<Administrativo> crearAdministrativo(@RequestBody Administrativo administrativo) throws Exception {
        return ResponseEntity.ok(administrativoService.crearAdministrativo(administrativo));
    }

    @PutMapping("/")
    public ResponseEntity<Administrativo> actualizarAdministrativo(@RequestBody Administrativo administrativo) throws Exception {
        return ResponseEntity.ok(administrativoService.actualizarAdministrativo(administrativo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarAdministrativo(@PathVariable("id") Long id) throws Exception {
        administrativoService.eliminarAdministrativo(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Administrativo> obtenerAdministrativo(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(administrativoService.obtenerAdministrativo(id));
    }

    @GetMapping("/todos")
    public ResponseEntity<?> listarAdministrativos() {
        return ResponseEntity.ok(administrativoService.listarAdministrativos());
    }
}
