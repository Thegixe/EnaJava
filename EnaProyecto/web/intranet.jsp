<%-- 
    Document   : intranet
    Created on : 03-jul-2020, 14:19:10
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
        <table border="1">
        <tr>
            <td align="center">
                <a href="ingresarR.jsp"><input type="button" value="Ingresar requerimiento" /></a>
            </td>
         </tr>   
         <tr>
             <td align="center">
                <a href="consultarR.jsp"><input type="button" value="Consultar requerimiento" /></a>
            </td>
         </tr>
         <tr>
             <td align="center">
                <a href="cerrarR.jsp"><input type="button" value="Cerrar requerimiento" /></a>
            </td>
         </tr>
        
        </table>
        
    </center>       
    </body>
     <% }else{
    response.sendRedirect("index.jsp?mensaje=acceso denegado");
    }%>
</html>
