package co.edu.uniminuto.GymEjb.entities;

import co.edu.uniminuto.GymEjb.entities.Ejercicio;
import co.edu.uniminuto.GymEjb.entities.Logusuario;
import co.edu.uniminuto.GymEjb.entities.Zonacuerpo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-10-22T23:48:12")
@StaticMetamodel(Maquina.class)
public class Maquina_ { 

    public static volatile SingularAttribute<Maquina, Integer> id;
    public static volatile CollectionAttribute<Maquina, Ejercicio> ejercicioCollection;
    public static volatile CollectionAttribute<Maquina, Logusuario> logusuarioCollection;
    public static volatile CollectionAttribute<Maquina, Zonacuerpo> zonacuerpoCollection;
    public static volatile SingularAttribute<Maquina, String> nombreMaquina;

}