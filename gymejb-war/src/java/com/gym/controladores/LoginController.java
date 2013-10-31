/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.controladores;

import com.gym.entities.Usuario;
import com.gym.session.UsuarioFacade;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Sebastian Rojas
 */
public class LoginController {
  @EJB  
  UsuarioFacade miUsuariosession;
  public ArrayList<String> validarAutenticacion(Integer idUsuario, String Contrasena) throws NamingException {
    boolean bandera;
    int idusuarioTrae;
    ArrayList<String> usuarioAutenticado = new ArrayList<String>();
    miUsuariosession = (UsuarioFacade) new InitialContext().lookup("java:global/gymejb/gymejb-ejb/UsuarioFacade!com.gym.session.UsuarioFacade");
    Usuario usuariologin = miUsuariosession.find(idUsuario);
    idusuarioTrae = usuariologin.getId();
    if (usuariologin != null && idusuarioTrae == idUsuario
            && usuariologin.getContrasena().equals(Contrasena)) {
      bandera = true;
      usuarioAutenticado.add("" + bandera);
      usuarioAutenticado.add("" + usuariologin.getId());
      usuarioAutenticado.add(usuariologin.getNombreUsuario());
    } else {
      bandera = false;
      usuarioAutenticado.add("" + bandera);
    }
    return usuarioAutenticado;
  }

  
}
