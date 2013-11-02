/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.Servlets;

import com.gym.controladores.RutinaController;
import com.gym.entities.Rutina;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Miguel
 */
@WebServlet(name = "rutinaServlet", urlPatterns = {"/rutinaServlet"})
public class rutinaServlet extends HttpServlet {
  

  

  /**
   * Processes requests for both HTTP
   * <code>GET</code> and
   * <code>POST</code> methods.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  /**
  @EJB
  RutinaFacade miRutinaSession;
  **/
  
  
  Rutina miRutina;
  RutinaController rutinaController ;
  String mensaje;

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException, NamingException{      
    //miRutinaSession = (RutinaFacade) new InitialContext().lookup("java:module/RutinaFacade");

    List<Rutina> rutinasList = rutinaController.getRutinas();

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    try {
      /* TODO output your page here. You may use following sample code. */
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Servlet rutina</title>");      
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>"+mensaje+"</h1>");
      out.println("<h1>Rutinas</h1>");
      for (Rutina r : rutinasList) {
        out.println("<h2>"+r.getNombreRutina()+"</h2>");
      }
      out.println("</body>");
      out.println("</html>");
    } finally {      
      out.close();
    }
  }

  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  /**
   * Handles the HTTP
   * <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    try {
      processRequest(request, response);
    } catch (NamingException ex) {
      Logger.getLogger(rutinaServlet.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  /**
   * Handles the HTTP
   * <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    ArrayList<String> rutinasCreadas = new ArrayList<String>();
    Integer idRutina = Integer.parseInt(request.getParameter("idRutina"));
    String nombreRutina = request.getParameter("nombreRutina");
    rutinasCreadas = rutinaController.validadarRutina(idRutina);
    if(rutinasCreadas.get(0).equals("false")){
      miRutina = new Rutina(idRutina);
      miRutina.setNombreRutina(nombreRutina);
      rutinaController.crearRutina(miRutina);
      mensaje = "Se ha Creado la Rutina con Exito";
    }
    else{
      mensaje = rutinasCreadas.get(1);
    }
    try {
      processRequest(request, response);
    } catch (NamingException ex) {
      Logger.getLogger(rutinaServlet.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>
}
