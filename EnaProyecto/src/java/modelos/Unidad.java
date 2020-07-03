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
public class Unidad {
    
    private String idUnidad;
    private String nombre;
    private Encargado encargado;
    private Conexion conexion;

    public Unidad() throws ClassNotFoundException, SQLException {
        conexion = new Conexion();
        encargado = new Encargado();
    }

    public Unidad(String idUnidad, String nombre, Encargado encargado) throws ClassNotFoundException, SQLException {
        this.idUnidad = idUnidad;
        this.nombre = nombre;
        this.encargado = encargado;
        conexion = new Conexion();
    }

    public String getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(String idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Encargado getEncargado() {
        return encargado;
    }

    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }
    
    
    
    
    
    
    
    
}
