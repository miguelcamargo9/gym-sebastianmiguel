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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
 * @author Sebastian Rojas
 */
@Entity
@Table(name = "maquina")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "Maquina.findAll", query = "SELECT m FROM Maquina m"),
  @NamedQuery(name = "Maquina.findById", query = "SELECT m FROM Maquina m WHERE m.id = :id"),
  @NamedQuery(name = "Maquina.findByNombreMaquina", query = "SELECT m FROM Maquina m WHERE m.nombreMaquina = :nombreMaquina")})
public class Maquina implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "id")
  private Integer id;
  @Size(max = 100)
  @Column(name = "nombreMaquina")
  private String nombreMaquina;
  @JoinTable(name = "maquinazona", joinColumns = {
    @JoinColumn(name = "idMaquina", referencedColumnName = "id")}, inverseJoinColumns = {
    @JoinColumn(name = "idZona", referencedColumnName = "id")})
  @ManyToMany
  private Collection<Zonacuerpo> zonacuerpoCollection;
  @ManyToMany(mappedBy = "maquinaCollection")
  private Collection<Ejercicio> ejercicioCollection;
  @OneToMany(mappedBy = "idRutina1")
  private Collection<Logusuario> logusuarioCollection;

  public Maquina() {
  }

  public Maquina(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNombreMaquina() {
    return nombreMaquina;
  }

  public void setNombreMaquina(String nombreMaquina) {
    this.nombreMaquina = nombreMaquina;
  }

  @XmlTransient
  public Collection<Zonacuerpo> getZonacuerpoCollection() {
    return zonacuerpoCollection;
  }

  public void setZonacuerpoCollection(Collection<Zonacuerpo> zonacuerpoCollection) {
    this.zonacuerpoCollection = zonacuerpoCollection;
  }

  @XmlTransient
  public Collection<Ejercicio> getEjercicioCollection() {
    return ejercicioCollection;
  }

  public void setEjercicioCollection(Collection<Ejercicio> ejercicioCollection) {
    this.ejercicioCollection = ejercicioCollection;
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
    if (!(object instanceof Maquina)) {
      return false;
    }
    Maquina other = (Maquina) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "co.edu.uniminuto.GymEjb.entities.Maquina[ id=" + id + " ]";
  }
  
}
