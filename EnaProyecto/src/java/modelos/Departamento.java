/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.SQLException;

/**
 *
 * @author TheGixe
 */
public class Departamento {
    
    private String idDepartamento;
    private String nombre;
    private Conexion conexion;

    public Departamento() throws ClassNotFoundException, SQLException {
        conexion = new Conexion();
    }

    public Departamento(String idDepartamento, String nombre) throws ClassNotFoundException, SQLException {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        conexion = new Conexion();
    }

    public String getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
