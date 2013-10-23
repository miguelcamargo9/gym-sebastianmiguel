package co.edu.uniminuto.GymEjb.entities;

import co.edu.uniminuto.GymEjb.entities.Perfil;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-10-22T23:48:12")
@StaticMetamodel(Tipousuario.class)
public class Tipousuario_ { 

    public static volatile SingularAttribute<Tipousuario, Integer> id;
    public static volatile SingularAttribute<Tipousuario, Perfil> idPerfil;
    public static volatile SingularAttribute<Tipousuario, String> descripcionTipoUsuario;

}