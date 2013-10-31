/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.controladores;

import com.gym.entities.Rutina;
import com.gym.modelos.rutinaModelo;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Miguel
 */
public class RutinaController {

  rutinaModelo rutinaModel;

  public ArrayList<String> validadarRutina(Integer idRutina) { 
    boolean bandera;
    ArrayList<String> rutinasCreadas = new ArrayList<String>();
    try {
      Rutina rutinaCreada = rutinaModel.buscarRutina(idRutina);
      bandera = true;
      rutinasCreadas.add("" + bandera);
      rutinasCreadas.add("" + rutinaCreada.getId());
      rutinasCreadas.add(rutinaCreada.getNombreRutina());
    } catch (Exception ex) {
      bandera = false;
      rutinasCreadas.add("" + bandera);
      rutinasCreadas.add("Esta Rutina ya Fue Creada, Verifique");
    }
    return rutinasCreadas;
  }

  public List<Rutina> getRutinas() {
    return rutinaModel.rutinaLista();
  }

  public void crearRutina(Rutina miRutina) {
    rutinaModel.crearRutina(miRutina);
  }
}
