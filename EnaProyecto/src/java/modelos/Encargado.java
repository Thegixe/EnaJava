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
public class Encargado {
    
    private String idEncargado;
    private String nombre;
    private Conexion conexion;

    public Encargado() throws ClassNotFoundException, SQLException {
        conexion = new Conexion();
    }

    public Encargado(String idEncargado, String nombre) throws ClassNotFoundException, SQLException {
        this.idEncargado = idEncargado;
        this.nombre = nombre;
        conexion = new Conexion();
    }

    public String getIdEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(String idEncargado) {
        this.idEncargado = idEncargado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
    
}
