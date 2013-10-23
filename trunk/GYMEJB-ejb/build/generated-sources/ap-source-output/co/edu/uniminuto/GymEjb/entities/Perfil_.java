package co.edu.uniminuto.GymEjb.entities;

import co.edu.uniminuto.GymEjb.entities.Tipousuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-10-22T23:48:12")
@StaticMetamodel(Perfil.class)
public class Perfil_ { 

    public static volatile SingularAttribute<Perfil, Integer> id;
    public static volatile SingularAttribute<Perfil, String> descripcionPerfil;
    public static volatile CollectionAttribute<Perfil, Tipousuario> tipousuarioCollection;

}