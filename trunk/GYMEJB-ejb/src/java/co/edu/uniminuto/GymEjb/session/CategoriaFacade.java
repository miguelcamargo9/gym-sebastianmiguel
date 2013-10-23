/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.GymEjb.session;

import co.edu.uniminuto.GymEjb.entities.Categoria;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author miguelcamargo9
 */
@Stateless
public class CategoriaFacade extends AbstractFacade<Categoria> {
  @PersistenceContext(unitName = "GYMEJB-ejbPU")
  private EntityManager em;

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }

  public CategoriaFacade() {
    super(Categoria.class);
  }
  
}
