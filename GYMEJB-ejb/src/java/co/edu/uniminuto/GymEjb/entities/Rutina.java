/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.GymEjb.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table(name = "rutina")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "Rutina.findAll", query = "SELECT r FROM Rutina r"),
  @NamedQuery(name = "Rutina.findById", query = "SELECT r FROM Rutina r WHERE r.id = :id"),
  @NamedQuery(name = "Rutina.findByNombreRutina", query = "SELECT r FROM Rutina r WHERE r.nombreRutina = :nombreRutina")})
public class Rutina implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "id")
  private Integer id;
  @Size(max = 100)
  @Column(name = "nombreRutina")
  private String nombreRutina;
  @ManyToMany(mappedBy = "rutinaCollection")
  private Collection<Usuario> usuarioCollection;
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRutina")
  private Collection<Rutinaejercicio> rutinaejercicioCollection;
  @OneToMany(mappedBy = "idRutina1")
  private Collection<Logusuario> logusuarioCollection;

  public Rutina() {
  }

  public Rutina(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNombreRutina() {
    return nombreRutina;
  }

  public void setNombreRutina(String nombreRutina) {
    this.nombreRutina = nombreRutina;
  }

  @XmlTransient
  public Collection<Usuario> getUsuarioCollection() {
    return usuarioCollection;
  }

  public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
    this.usuarioCollection = usuarioCollection;
  }

  @XmlTransient
  public Collection<Rutinaejercicio> getRutinaejercicioCollection() {
    return rutinaejercicioCollection;
  }

  public void setRutinaejercicioCollection(Collection<Rutinaejercicio> rutinaejercicioCollection) {
    this.rutinaejercicioCollection = rutinaejercicioCollection;
  }

  @XmlTransient
  public Collection<Logusuario> getLogusuarioCollection() {
    return logusuarioCollection;
  }

  public void setLogusuarioCollection(Collection<Logusuario> logusuarioCollection) {
    this.logusuarioCollection = logusuarioCollection;
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
    if (!(object instanceof Rutina)) {
      return false;
    }
    Rutina other = (Rutina) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "co.edu.uniminuto.GymEjb.entities.Rutina[ id=" + id + " ]";
  }
  
}
