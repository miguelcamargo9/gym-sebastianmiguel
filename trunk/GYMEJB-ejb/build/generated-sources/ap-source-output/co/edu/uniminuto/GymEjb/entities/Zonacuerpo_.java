package co.edu.uniminuto.GymEjb.entities;

import co.edu.uniminuto.GymEjb.entities.Maquina;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-10-22T23:48:12")
@StaticMetamodel(Zonacuerpo.class)
public class Zonacuerpo_ { 

    public static volatile SingularAttribute<Zonacuerpo, Integer> id;
    public static volatile SingularAttribute<Zonacuerpo, String> nombre;
    public static volatile CollectionAttribute<Zonacuerpo, Maquina> maquinaCollection;

}