/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
@Table(name = "perfil")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "Perfil.findAll", query = "SELECT p FROM Perfil p"),
  @NamedQuery(name = "Perfil.findById", query = "SELECT p FROM Perfil p WHERE p.id = :id"),
  @NamedQuery(name = "Perfil.findByDescripcionPerfil", query = "SELECT p FROM Perfil p WHERE p.descripcionPerfil = :descripcionPerfil")})
public class Perfil implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "id")
  private Integer id;
  @Size(max = 100)
  @Column(name = "descripcionPerfil")
  private String descripcionPerfil;
  @OneToMany(mappedBy = "idPerfil")
  private Collection<Tipousuario> tipousuarioCollection;

  public Perfil() {
  }

  public Perfil(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDescripcionPerfil() {
    return descripcionPerfil;
  }

  public void setDescripcionPerfil(String descripcionPerfil) {
    this.descripcionPerfil = descripcionPerfil;
  }

  @XmlTransient
  public Collection<Tipousuario> getTipousuarioCollection() {
    return tipousuarioCollection;
  }

  public void setTipousuarioCollection(Collection<Tipousuario> tipousuarioCollection) {
    this.tipousuarioCollection = tipousuarioCollection;
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
    if (!(object instanceof Perfil)) {
      return false;
    }
    Perfil other = (Perfil) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "co.edu.uniminuto.GymEjb.entities.Perfil[ id=" + id + " ]";
  }
  
}
