/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
 * @author Miguel
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
  @JoinTable(name = "rutinausuario", joinColumns = {
    @JoinColumn(name = "idRutina", referencedColumnName = "id")}, inverseJoinColumns = {
    @JoinColumn(name = "idUsuario", referencedColumnName = "id")})
  @ManyToMany
  private List<Usuario> usuarioList;
  @OneToMany(mappedBy = "idRutina")
  private List<Logusuario> logusuarioList;
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRutina")
  private List<Rutinaejercicio> rutinaejercicioList;

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
  public List<Usuario> getUsuarioList() {
    return usuarioList;
  }

  public void setUsuarioList(List<Usuario> usuarioList) {
    this.usuarioList = usuarioList;
  }

  @XmlTransient
  public List<Logusuario> getLogusuarioList() {
    return logusuarioList;
  }

  public void setLogusuarioList(List<Logusuario> logusuarioList) {
    this.logusuarioList = logusuarioList;
  }

  @XmlTransient
  public List<Rutinaejercicio> getRutinaejercicioList() {
    return rutinaejercicioList;
  }

  public void setRutinaejercicioList(List<Rutinaejercicio> rutinaejercicioList) {
    this.rutinaejercicioList = rutinaejercicioList;
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
    return "com.gym.entities.Rutina[ id=" + id + " ]";
  }
  
}
