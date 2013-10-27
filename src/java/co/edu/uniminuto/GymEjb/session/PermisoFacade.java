/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.GymEjb.session;

import co.edu.uniminuto.GymEjb.entities.Permiso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Sebastian Rojas
 */
@Stateless
public class PermisoFacade extends AbstractFacade<Permiso> {
  @PersistenceContext(unitName = "GYMEJB-ejbPU")
  private EntityManager em;

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }

  public PermisoFacade() {
    super(Permiso.class);
  }
  
}
