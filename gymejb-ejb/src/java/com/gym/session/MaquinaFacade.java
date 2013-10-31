/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.session;

import com.gym.entities.Maquina;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Miguel
 */
@Stateless
public class MaquinaFacade extends AbstractFacade<Maquina> {
  @PersistenceContext(unitName = "gymejb-ejbPU")
  private EntityManager em;

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }

  public MaquinaFacade() {
    super(Maquina.class);
  }
  
}
