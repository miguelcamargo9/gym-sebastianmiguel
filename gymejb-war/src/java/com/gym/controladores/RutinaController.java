/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.controladores;

/**
 *
 * @author Miguel
 */
public class RutinaController {
  
  public boolean validadarRutina(Integer idRutina, String nombreRutina) throws NullPointerException {
    boolean msj = true;
    int IdR;
    String NoR; 
    try {
      IdR = idRutina;
    } catch (NullPointerException ex) {
      //msj = "El Id de la Categoria No Puede ser Vacio.";
      msj = false;
    }
    try {
      NoR = nombreRutina;
    } catch (NullPointerException ex) {
      msj = false;
      //msj = "El Nombre de la Rutina No Puede ser Vacio.";
    }
    return msj;
  }
}
