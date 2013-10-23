/*
 * Miguel Camargo
 * ING SISTEMAS
 */
package co.edu.uniminuto.GymEjb.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author miguelcamargo9
 */
@Entity
@Table(name = "categoria")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c"),
  @NamedQuery(name = "Categoria.findById", query = "SELECT c FROM Categoria c WHERE c.id = :id"),
  @NamedQuery(name = "Categoria.findByNombreCategoria", query = "SELECT c FROM Categoria c WHERE c.nombreCategoria = :nombreCategoria")})
public class Categoria implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "id")
  private Integer id;
  @Size(max = 100)
  @Column(name = "nombreCategoria")
  private String nombreCategoria;
  @OneToMany(mappedBy = "idCategoria")
  private Collection<Ejercicio> ejercicioCollection;

  public Categoria() {
  }

  public Categoria(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNombreCategoria() {
    return nombreCategoria;
  }

  public void setNombreCategoria(String nombreCategoria) {
    this.nombreCategoria = nombreCategoria;
  }

  @XmlTransient
  public Collection<Ejercicio> getEjercicioCollection() {
    return ejercicioCollection;
  }

  public void setEjercicioCollection(Collection<Ejercicio> ejercicioCollection) {
    this.ejercicioCollection = ejercicioCollection;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (id != null ? id.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof Categoria)) {
      return false;
    }
    Categoria other = (Categoria) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "co.edu.uniminuto.GymEjb.entities.Categoria[ id=" + id + " ]";
  }
  
}
