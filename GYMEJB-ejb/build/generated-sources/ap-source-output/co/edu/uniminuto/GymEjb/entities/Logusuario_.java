package co.edu.uniminuto.GymEjb.entities;

import co.edu.uniminuto.GymEjb.entities.Maquina;
import co.edu.uniminuto.GymEjb.entities.Rutina;
import co.edu.uniminuto.GymEjb.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-10-22T23:48:12")
@StaticMetamodel(Logusuario.class)
public class Logusuario_ { 

    public static volatile SingularAttribute<Logusuario, Integer> id;
    public static volatile SingularAttribute<Logusuario, Double> distancia;
    public static volatile SingularAttribute<Logusuario, Integer> librasLevantadas;
    public static volatile SingularAttribute<Logusuario, Usuario> idUsuario;
    public static volatile SingularAttribute<Logusuario, Double> ritmoCardiaco;
    public static volatile SingularAttribute<Logusuario, Rutina> idRutina1;
    public static volatile SingularAttribute<Logusuario, Integer> idMaquina;
    public static volatile SingularAttribute<Logusuario, Maquina> idRutina;
    public static volatile SingularAttribute<Logusuario, Integer> repeticiones;
    public static volatile SingularAttribute<Logusuario, Double> duracion;
    public static volatile SingularAttribute<Logusuario, Double> velocidad;
    public static volatile SingularAttribute<Logusuario, Double> caloriasQuemadas;

}