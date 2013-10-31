/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.session;

import com.gym.entities.Logusuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Miguel
 */
@Stateless
public class LogusuarioFacade extends AbstractFacade<Logusuario> {
  @PersistenceContext(unitName = "gymejb-ejbPU")
  private EntityManager em;

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }

  public LogusuarioFacade() {
    super(Logusuario.class);
  }
  
}
