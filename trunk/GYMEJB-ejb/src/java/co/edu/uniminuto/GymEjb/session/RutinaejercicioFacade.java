/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.GymEjb.session;

import co.edu.uniminuto.GymEjb.entities.Rutinaejercicio;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author miguelcamargo9
 */
@Stateless
public class RutinaejercicioFacade extends AbstractFacade<Rutinaejercicio> {
  @PersistenceContext(unitName = "GYMEJB-ejbPU")
  private EntityManager em;

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }

  public RutinaejercicioFacade() {
    super(Rutinaejercicio.class);
  }
  
}