package co.edu.uniminuto.GymEjb.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-10-22T23:48:12")
@StaticMetamodel(Menu.class)
public class Menu_ { 

    public static volatile SingularAttribute<Menu, Integer> id;
    public static volatile SingularAttribute<Menu, Short> orden;
    public static volatile SingularAttribute<Menu, String> nombre;
    public static volatile SingularAttribute<Menu, Integer> padre;
    public static volatile SingularAttribute<Menu, String> enlace;
    public static volatile SingularAttribute<Menu, Boolean> activo;

}