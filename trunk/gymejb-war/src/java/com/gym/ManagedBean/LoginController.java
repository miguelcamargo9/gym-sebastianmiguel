/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.ManagedBean;

import com.gym.ManagedBean.util.JsfUtil;
import com.gym.ManagedBean.util.PaginationHelper;
import com.gym.entities.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.gym.session.UsuarioFacade;
import java.io.IOException;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

/**
 *
 * @author Sebastian Rojas
 */
@ManagedBean(name = "loginController")
@RequestScoped
public class LoginController {

  @EJB
  private UsuarioFacade usuarioFacade;
  private int id;
  private String password;
  private boolean estadologin;

  /**
   * Creates a new instance of LoginController
   */
  public LoginController() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void generarLogin() {
    Usuario usuario;
    usuario = usuarioFacade.find(id);
    int tipoUsuario = 0;
    System.out.println("--------------------------------------");
    System.out.println("--------------------------------------");
    if (usuario != null && usuario.getContrasena().equals(password)) {
      this.estadologin = true;
      tipoUsuario = usuario.getIdTipoUsuario();
    } else {
      this.estadologin = false;
    }
    if (this.estadologin) {
      try {
        switch(tipoUsuario) {
          case 1:
            FacesContext.getCurrentInstance().getExternalContext().redirect("../menuadmin.xhtml");
            break;
          case 2:
            FacesContext.getCurrentInstance().getExternalContext().redirect("../menuentrenador.xhtml");
            break;
          case 3:
            FacesContext.getCurrentInstance().getExternalContext().redirect("../menuusuario.xhtml");
            break;
        }
      } catch (IOException ioe) {
        System.err.println("listTestBean.valueChanged: IOException");
      }
    } else {
      try {
        FacesContext.getCurrentInstance().getExternalContext().redirect("../error.xhtml");
      } catch (IOException ioe) {
        System.err.println("listTestBean.valueChanged: IOException");
      }
    }
  }
}