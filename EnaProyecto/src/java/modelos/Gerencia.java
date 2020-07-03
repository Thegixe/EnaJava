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
public class Gerencia {
    
    
    
    private String idGerencia;
    private String nombre;
    private Departamento departamento;
    private Conexion conexion;

    public Gerencia() throws ClassNotFoundException, SQLException {
        conexion = new Conexion();
        departamento = new Departamento();
    }

    public Gerencia(String idGerencia, String nombre, Departamento departamento) throws ClassNotFoundException, SQLException {
        this.idGerencia = idGerencia;
        this.nombre = nombre;
        this.departamento = departamento;
        conexion = new Conexion();
    }

    public String getIdGerencia() {
        return idGerencia;
    }

    public void setIdGerencia(String idGerencia) {
        this.idGerencia = idGerencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
    
    
    
}
