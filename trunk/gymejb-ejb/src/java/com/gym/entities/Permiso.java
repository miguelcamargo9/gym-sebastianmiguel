/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Miguel
 */
@Entity
@Table(name = "permiso")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "Permiso.findAll", query = "SELECT p FROM Permiso p"),
  @NamedQuery(name = "Permiso.findById", query = "SELECT p FROM Permiso p WHERE p.id = :id"),
  @NamedQuery(name = "Permiso.findByPermisos", query = "SELECT p FROM Permiso p WHERE p.permisos = :permisos"),
  @NamedQuery(name = "Permiso.findByEstado", query = "SELECT p FROM Permiso p WHERE p.estado = :estado"),
  @NamedQuery(name = "Permiso.findByIdUsuario", query = "SELECT p FROM Permiso p WHERE p.idUsuario = :idUsuario")})
public class Permiso implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "id")
  private Integer id;
  @Size(max = 100)
  @Column(name = "permisos")
  private String permisos;
  @Column(name = "estado")
  private Boolean estado;
  @Basic(optional = false)
  @NotNull
  @Column(name = "idUsuario")
  private int idUsuario;

  public Permiso() {
  }

  public Permiso(Integer id) {
    this.id = id;
  }

  public Permiso(Integer id, int idUsuario) {
    this.id = id;
    this.idUsuario = idUsuario;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getPermisos() {
    return permisos;
  }

  public void setPermisos(String permisos) {
    this.permisos = permisos;
  }

  public Boolean getEstado() {
    return estado;
  }

  public void setEstado(Boolean estado) {
    this.estado = estado;
  }

  public int getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
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
    if (!(object instanceof Permiso)) {
      return false;
    }
    Permiso other = (Permiso) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "com.gym.entities.Permiso[ id=" + id + " ]";
  }
  
}
