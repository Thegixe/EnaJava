/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TheGixe
 */
public class Estado {
    
    
    private String idEstado;    
    private String descripcion;    
    private Conexion conexion;

    public Estado() throws ClassNotFoundException, SQLException {
     conexion = new Conexion();
    }

    public Estado(String idEstado, String descripcion) throws ClassNotFoundException, SQLException {
        this.idEstado = idEstado;
        this.descripcion = descripcion;
        conexion = new Conexion();
    }

    public String getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    public Estado obtenerEstado(String idEstado) throws SQLException, ClassNotFoundException{
        String sentencia = "select * from estado where idEstado='"+idEstado+"'";
        ResultSet rs = conexion.consultarSQL(sentencia);
        Estado e = new Estado();
        if(rs.next()){
            e.setIdEstado(rs.getString("idEstado"));
            e.setDescripcion(rs.getString("descripcion"));        
        }
        return e;
    }
    
    
    
    
}
