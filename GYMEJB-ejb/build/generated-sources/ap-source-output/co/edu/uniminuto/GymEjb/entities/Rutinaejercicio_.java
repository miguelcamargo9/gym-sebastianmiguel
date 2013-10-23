package co.edu.uniminuto.GymEjb.entities;

import co.edu.uniminuto.GymEjb.entities.Ejercicio;
import co.edu.uniminuto.GymEjb.entities.Rutina;
import co.edu.uniminuto.GymEjb.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-10-22T23:48:12")
@StaticMetamodel(Rutinaejercicio.class)
public class Rutinaejercicio_ { 

    public static volatile SingularAttribute<Rutinaejercicio, Integer> id;
    public static volatile SingularAttribute<Rutinaejercicio, Double> distacia;
    public static volatile SingularAttribute<Rutinaejercicio, Usuario> idUsuario;
    public static volatile SingularAttribute<Rutinaejercicio, Double> regularidad;
    public static volatile SingularAttribute<Rutinaejercicio, Integer> libraslevantar;
    public static volatile SingularAttribute<Rutinaejercicio, Rutina> idRutina;
    public static volatile SingularAttribute<Rutinaejercicio, Ejercicio> idEjercicio;
    public static volatile SingularAttribute<Rutinaejercicio, Double> duracion;
    public static volatile SingularAttribute<Rutinaejercicio, Double> velocidad;

}