package co.edu.uniminuto.GymEjb.entities;

import co.edu.uniminuto.GymEjb.entities.Logusuario;
import co.edu.uniminuto.GymEjb.entities.Rutinaejercicio;
import co.edu.uniminuto.GymEjb.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-10-22T23:48:12")
@StaticMetamodel(Rutina.class)
public class Rutina_ { 

    public static volatile SingularAttribute<Rutina, Integer> id;
    public static volatile CollectionAttribute<Rutina, Usuario> usuarioCollection;
    public static volatile CollectionAttribute<Rutina, Logusuario> logusuarioCollection;
    public static volatile SingularAttribute<Rutina, String> nombreRutina;
    public static volatile CollectionAttribute<Rutina, Rutinaejercicio> rutinaejercicioCollection;

}