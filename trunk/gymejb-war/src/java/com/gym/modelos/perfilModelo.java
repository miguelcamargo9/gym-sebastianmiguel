/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.modelos;

import com.gym.entities.Perfil;
import com.gym.session.PerfilFacade;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Sebastian Rojas
 */
public class perfilModelo {
  PerfilFacade perfilFacade = lookupPerfilFacadeBean();
  
  public boolean crearPerfil(String descripcion) {
    Integer id;
    id = perfilFacade.count();
    id = id++;
    Perfil perfil = new Perfil();
    perfil.setId(id);
    perfil.setDescripcionPerfil(descripcion);
    perfilFacade.create(perfil);
    return true;
  }

  private PerfilFacade lookupPerfilFacadeBean() {
    try {
      Context c = new InitialContext();
      return (PerfilFacade) c.lookup("java:global/gymejb/gymejb-ejb/PerfilFacade!com.gym.session.PerfilFacade");
    } catch (NamingException ne) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
      throw new RuntimeException(ne);
    }
  }
}
