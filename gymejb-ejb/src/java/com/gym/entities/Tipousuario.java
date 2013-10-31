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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tipousuario")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "Tipousuario.findAll", query = "SELECT t FROM Tipousuario t"),
  @NamedQuery(name = "Tipousuario.findById", query = "SELECT t FROM Tipousuario t WHERE t.id = :id"),
  @NamedQuery(name = "Tipousuario.findByDescripcionTipoUsuario", query = "SELECT t FROM Tipousuario t WHERE t.descripcionTipoUsuario = :descripcionTipoUsuario")})
public class Tipousuario implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "id")
  private Integer id;
  @Size(max = 100)
  @Column(name = "descripcionTipoUsuario")
  private String descripcionTipoUsuario;
  @JoinColumn(name = "idPerfil", referencedColumnName = "id")
  @ManyToOne
  private Perfil idPerfil;

  public Tipousuario() {
  }

  public Tipousuario(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDescripcionTipoUsuario() {
    return descripcionTipoUsuario;
  }

  public void setDescripcionTipoUsuario(String descripcionTipoUsuario) {
    this.descripcionTipoUsuario = descripcionTipoUsuario;
  }

  public Perfil getIdPerfil() {
    return idPerfil;
  }

  public void setIdPerfil(Perfil idPerfil) {
    this.idPerfil = idPerfil;
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
    if (!(object instanceof Tipousuario)) {
      return false;
    }
    Tipousuario other = (Tipousuario) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "com.gym.entities.Tipousuario[ id=" + id + " ]";
  }
  
}
