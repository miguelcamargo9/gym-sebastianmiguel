/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.modelos;

import com.gym.entities.Rutina;
import com.gym.session.RutinaFacade;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Miguel
 */
public class rutinaModelo {
  RutinaFacade rutinaFacade = lookupRutinaFacadeBean();
  
    public void crearRutina(Rutina miRutina){
      rutinaFacade.create(miRutina);
    }
    
    public List<Rutina> rutinaLista(){
      return rutinaFacade.findAll();
    }  

  private RutinaFacade lookupRutinaFacadeBean() {
    try {
      Context c = new InitialContext();
      return (RutinaFacade) c.lookup("java:global/gymejb/gymejb-ejb/RutinaFacade!com.gym.session.RutinaFacade");
    } catch (NamingException ne) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
      throw new RuntimeException(ne);
    }
  }
}
