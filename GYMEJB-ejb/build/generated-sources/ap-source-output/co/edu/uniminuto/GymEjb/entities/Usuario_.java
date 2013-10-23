package co.edu.uniminuto.GymEjb.entities;

import co.edu.uniminuto.GymEjb.entities.Logusuario;
import co.edu.uniminuto.GymEjb.entities.Rutina;
import co.edu.uniminuto.GymEjb.entities.Rutinaejercicio;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-10-22T23:48:12")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Integer> id;
    public static volatile SingularAttribute<Usuario, Float> pesoUsuario;
    public static volatile CollectionAttribute<Usuario, Logusuario> logusuarioCollection;
    public static volatile SingularAttribute<Usuario, Integer> idTipoUsuario;
    public static volatile SingularAttribute<Usuario, Integer> edadUsuario;
    public static volatile CollectionAttribute<Usuario, Rutina> rutinaCollection;
    public static volatile SingularAttribute<Usuario, String> contrasena;
    public static volatile CollectionAttribute<Usuario, Rutinaejercicio> rutinaejercicioCollection;
    public static volatile SingularAttribute<Usuario, Float> alturaUsuario;
    public static volatile SingularAttribute<Usuario, String> nombreUsuario;

}