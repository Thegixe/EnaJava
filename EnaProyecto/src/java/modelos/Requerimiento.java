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
public class Requerimiento {
    
    private String idRequerimiento;
    private Gerencia gerencia;
    private Unidad unidad;
    private String requerimiento;
    private Estado estado;
    private Conexion conexion;

    public Requerimiento() throws ClassNotFoundException, SQLException {
        conexion = new Conexion();
        gerencia = new Gerencia();
        unidad = new Unidad();
        estado = new Estado();
    }

    public Requerimiento(String idRequerimiento, Gerencia gerencia, Unidad unidad, String requerimiento, Estado estado) throws ClassNotFoundException, SQLException {
        this.idRequerimiento = idRequerimiento;
        this.gerencia = gerencia;
        this.unidad = unidad;
        this.requerimiento = requerimiento;
        this.estado = estado;
        conexion = new Conexion();
    }

    public String getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(String idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    public Gerencia getGerencia() {
        return gerencia;
    }

    public void setGerencia(Gerencia gerencia) {
        this.gerencia = gerencia;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    public String getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(String requerimiento) {
        this.requerimiento = requerimiento;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
    
    
}
