<%-- 
    Document   : crearRutina
    Created on : 27-oct-2013, 13:26:12
    Author     : Miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Crear Rutina</h1>
    <form name="crearRutinaForm" action="rutinaServlet" method="POST">
      <table>
        <tr>
          <td>
            ID
          </td>
          <td>
            <input type="text" name="idRutina" required>
          </td>
        </tr>
        <tr>
          <td>
            Nombre
          </td>
          <td>
            <input type="text" name="nombreRutina" required>
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <button value="GUARDAR" >GUARDAR</button>   
          </td>
        </tr>
      </table>
    </form>
  </body>
</html>
