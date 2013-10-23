package co.edu.uniminuto.GymEjb.entities;

import co.edu.uniminuto.GymEjb.entities.Ejercicio;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-10-22T23:48:12")
@StaticMetamodel(Objetivo.class)
public class Objetivo_ { 

    public static volatile SingularAttribute<Objetivo, Integer> id;
    public static volatile CollectionAttribute<Objetivo, Ejercicio> ejercicioCollection;
    public static volatile SingularAttribute<Objetivo, String> descripcion;

}