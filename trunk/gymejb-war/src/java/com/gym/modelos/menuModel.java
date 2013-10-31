/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.modelos;

import com.gym.entities.Menu;
import com.gym.entities.Permiso;
import com.gym.session.MenuFacade;
import com.gym.session.PermisoFacade;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Sebastian Rojas
 */
public class menuModel {

  @EJB
          
  PermisoFacade miPermisoSession;
  MenuFacade miMenuSession;
  
  public List<Menu> crearMenuUsuario(Integer idUsuario) throws NamingException {
    List<Menu> mimenu = new ArrayList<Menu>();
    miPermisoSession = (PermisoFacade) new InitialContext().lookup("java:global/gymejb/gymejb-ejb/PermisoFacade!com.gym.session.PermisoFacade");
    miMenuSession = (MenuFacade) new InitialContext().lookup("java:global/gymejb/gymejb-ejb/MenuFacade!com.gym.session.MenuFacade");
    Permiso permisoUsuario = miPermisoSession.find(idUsuario);
    String[] apermisoUsuario = permisoUsuario.getPermisos().split(",");
    for (int i = 0; i < apermisoUsuario.length; i++) {
      mimenu.add(miMenuSession.find(Integer.parseInt(apermisoUsuario[i])));
    }
    return mimenu;
  }
}
