/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.session;

import com.gym.entities.Zonacuerpo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Miguel
 */
@Stateless
public class ZonacuerpoFacade extends AbstractFacade<Zonacuerpo> {
  @PersistenceContext(unitName = "gymejb-ejbPU")
  private EntityManager em;

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }

  public ZonacuerpoFacade() {
    super(Zonacuerpo.class);
  }
  
}
