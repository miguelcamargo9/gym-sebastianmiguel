/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.GymEjb.session;

import co.edu.uniminuto.GymEjb.entities.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author miguelcamargo9
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {
  @PersistenceContext(unitName = "GYMEJB-ejbPU")
  private EntityManager em;

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }

  public UsuarioFacade() {
    super(Usuario.class);
  }
  
}
