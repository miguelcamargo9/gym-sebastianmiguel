<%-- 
    Document   : AdministradorUsuarios
    Created on : 15/09/2013, 11:20:43 PM
    Author     : Sebastian Rojas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <form action="usuarioServlet" method="post">
      <fieldset>
        <legend>ADMINISTRACION DE USUARIOS</legend>
        <table>
          <tr>
            <td>
              *CEDULA
            </td>
            <td>
              <input type="text" name="idUsuario" required>
            </td>
          </tr>
          <tr>
            <td>
              *NOMBRE
            </td>
            <td>
              <input type="text" name="nombreUsuario" required>
            </td>
          </tr>
          <tr>
            <td>
              *PESO USUARIO
            </td>
            <td>
              <input type="text" name="pesoUsuario" required>
            </td>
          </tr>
          <tr>
            <td>
              *ALTURA USUARIO
            </td>
            <td>
              <input type="text" name="alturaUsuario" required>
            </td>
          </tr>
          <tr>
            <td>
              *EDAD USUARIO
            </td>
            <td>
              <input type="text" name="edadUsuario" required>
            </td>
          </tr>
          <tr>
            <td>
              *CONTRASEÑA
            </td>
            <td>
              <input type="text" name="contrasena" required>
            </td>
          </tr>
        </table>
        <input type="submit" value="guardar"> 
      </fieldset>
    </form>
  </body>
</html>
