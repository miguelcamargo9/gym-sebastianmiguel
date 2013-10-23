/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.GymEjb.session;

import co.edu.uniminuto.GymEjb.entities.Objetivo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author miguelcamargo9
 */
@Stateless
public class ObjetivoFacade extends AbstractFacade<Objetivo> {
  @PersistenceContext(unitName = "GYMEJB-ejbPU")
  private EntityManager em;

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }

  public ObjetivoFacade() {
    super(Objetivo.class);
  }
  
}
