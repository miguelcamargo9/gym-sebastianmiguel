<%-- 
    Document   : menu
    Created on : 14/09/2013, 10:27:47 PM
    Author     : Sebastian Rojas
--%>
<%@page import="com.gym.entities.Menu"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MENU CAMBIO</title>
        <link rel = 'stylesheet' href = 'css/style.css' type='text/css' />
        <script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $("#opciones").hide();
                $("#menu").click(function() {
                    if ($("#opciones").is(':hidden')) {
                        $("#opciones").show("slow");
                    }
                    else {
                        $("#opciones").hide();
                    }
                });
            });

            function ponerUnMarco(direccion) {
                var iframe = document.getElementById("marcos");
                var src = direccion;
                iframe.src = src;
                return;
            }
        </script>
    </head>
    <body>
        <header>
            <h1>GYM BY: SEBASTIAN ROJAS-MIGUEL CAMARGO</h1>
        </header>
        <div id="menu">
            <%

                ArrayList<Menu> menuUsuario = new ArrayList<Menu>();
                menuUsuario = (ArrayList<Menu>) session.getAttribute("menu");
                ArrayList<Menu> menuPadre = new ArrayList<Menu>();
                ArrayList<Menu> menuHijos = new ArrayList<Menu>();
                int padre = 0;
                for (Menu m : menuUsuario) {
                    if (m.getPadre() == null) {
                        menuPadre.add(m);
                        padre = m.getId();
//                        out.println("<li id='padre'>");
//                        out.print(m.getNombre());
                    }

                    if (m.getPadre() != null && padre != 0 && padre == m.getPadre()) {
                        menuHijos.add(m);
//                        out.println("<ul>");
//                        out.print("<a href='javascript:ponerUnMarco(\"");
//                        out.print(m.getEnlace() + "\")'>");
//                        out.print(m.getNombre());
//                        out.print("</a>");
//                        out.print("</ul>");
                    }
                }

                for (Menu mp : menuPadre) {
                    out.println("<li id='padre'>");
                    out.print(mp.getNombre());
                    for (Menu mh : menuHijos) {
                        if (mp.getId() == mh.getPadre()) {
                            out.println("<ul>");
                            out.print("<a href='javascript:ponerUnMarco(\"");
                            out.print(mh.getEnlace() + "\")'>");
                            out.print(mh.getNombre());
                            out.print("</a>");
                            out.print("</ul>");
                        }
                    }
                    out.println("</li>");
                }
            %>
        </div>
        <div id="pestanas">
            <h2 style="text-align:right">BIENVENIDO, <%= session.getAttribute("datosUsuario")%></h2>
        </div>
        <div id="marco">
            <iframe id="marcos" src="about:blank" width="100%" height="100%" frameborder="1" scrolling="no">

            </iframe>
        </div>
    </body>
</html>
