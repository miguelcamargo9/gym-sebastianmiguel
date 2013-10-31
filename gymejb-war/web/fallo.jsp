<%-- 
    Document   : fallo
    Created on : 15/09/2013, 01:05:04 AM
    Author     : Sebastian Rojas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Usuario no valido</title>
    <script type="text/javascript">
      function usuarioInvalido() {
        alert('usuario invalido por favor verifique');
         window.location = "index.jsp";
      }
    </script>
  </head>
  <body onload="usuarioInvalido()">
  </body>
</html>
