package co.edu.uniminuto.GymEjb.entities;

import co.edu.uniminuto.GymEjb.entities.Categoria;
import co.edu.uniminuto.GymEjb.entities.Maquina;
import co.edu.uniminuto.GymEjb.entities.Objetivo;
import co.edu.uniminuto.GymEjb.entities.Rutinaejercicio;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-10-22T23:48:12")
@StaticMetamodel(Ejercicio.class)
public class Ejercicio_ { 

    public static volatile SingularAttribute<Ejercicio, Integer> id;
    public static volatile SingularAttribute<Ejercicio, Categoria> idCategoria;
    public static volatile CollectionAttribute<Ejercicio, Maquina> maquinaCollection;
    public static volatile SingularAttribute<Ejercicio, String> nombreEjercicio;
    public static volatile CollectionAttribute<Ejercicio, Objetivo> objetivoCollection;
    public static volatile SingularAttribute<Ejercicio, String> explicacion;
    public static volatile CollectionAttribute<Ejercicio, Rutinaejercicio> rutinaejercicioCollection;

}