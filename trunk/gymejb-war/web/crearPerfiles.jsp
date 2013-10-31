<%-- 
    Document   : crearPerfiles
    Created on : 31/10/2013, 01:19:33 AM
    Author     : Sebastian Rojas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Creacion de Perfiles</title>
  </head>
  <body>
    <form action="perfilesServlet" method="post">
      <fieldset>
        <legend>Creacion de Perfiles</legend>
        <table>
          <tr>
            <td>
              * Nombre del perfil
            </td>
            <td>
              <input type="text" name="perfil">      
            </td>
          </tr>
        </table>
      </fieldset>
    </form>
  </body>
</html>
