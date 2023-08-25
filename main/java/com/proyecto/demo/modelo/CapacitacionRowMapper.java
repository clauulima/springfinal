package com.proyecto.demo.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CapacitacionRowMapper implements RowMapper<Capacitacion>{

    @Override
    public Capacitacion mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Capacitacion(
            rs.getLong("id"),  // Cambio de getInt a getLong
            rs.getString("nombre"),
            rs.getString("detalle"),
            rs.getInt("cantidad_participantes"),
            rs.getString("lugar_capacitacion")
        );
    }
}
