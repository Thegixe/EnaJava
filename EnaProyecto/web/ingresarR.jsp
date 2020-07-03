<%-- 
    Document   : ingresarR
    Created on : 03-jul-2020, 17:20:20
    Author     : TheGixe
--%>

<%@page import="modelos.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <% if(session.getAttribute("usuario")!=null){ 
        Usuario u =(Usuario) session.getAttribute("usuario");%>
    <body>
     <center>
        <h1>Ingresar requerimiento</h1>
        <form action ="ControlEquipo" method="post">
            <table style="border: 1px; border-width: 1px; border-collapse: collapse; border-color:  black;">
                <tr>
                    <td>ID</td>
                    <td>Nombre</td>
                    <td>Procedencia</td>
                    <td>Estadio</td>
                    <td>Division</td>
                    
                </tr>
                <tr>
                    <td><input type="text" name="idEquipo" value=""/></td> 
                    <td><input type="text" name="nombre" value=""/></td>
                    <td><input type="text" name="procedencia" value=""/></td>
                    
                    
                    <% try{
                    Estadio estadio = new Estadio(); 
                    ArrayList<Estadio> estadios = estadio.obtenerEstadios(); 
                    %>
                <td>
                    <select name="idEstadio">
                        <% for(Estadio es:estadios){%>
                        <option value="<%=es.getIdEstadio()%>"> 
                            <%= es.getNombre()%>
                        </option>
                        <% }%>
                    </select>
                </td>
                <%
                            }catch(Exception e){ 
                                out.println(e.getMessage());
                            } %>
                    
                    <% try{
                    Division division = new Division(); 
                    ArrayList<Division> divisiones = division.obtenerDivisiones(); 
                    %>
                <td>
                    <select name="idDivision">
                        <% for(Division di:divisiones){%>
                        <option value="<%=di.getIdDivision()%>"> 
                            <%= di.getNombre()%>
                        </option>
                        <% }%>
                    </select>
                </td>
                <%
                            }catch(Exception e){ 
                                out.println(e.getMessage());
                            } %>
                            
                    
                    
                            
                    <td><input type="submit" value="Agregar" /> </td>  
                   
                </tr>
            </table>
            <input type="hidden" name="accion" value="1"/>
        </form>
        <a href="intranet.jsp">Volver</a>
        
        
        
        
     </center>
    </body>
    <% }else{
    response.sendRedirect("index.jsp?mensaje=acceso denegado");
    }%>
</html>
