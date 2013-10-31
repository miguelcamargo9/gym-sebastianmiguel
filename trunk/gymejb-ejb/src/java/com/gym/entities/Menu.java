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
@Table(name = "menu")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m"),
  @NamedQuery(name = "Menu.findById", query = "SELECT m FROM Menu m WHERE m.id = :id"),
  @NamedQuery(name = "Menu.findByPadre", query = "SELECT m FROM Menu m WHERE m.padre = :padre"),
  @NamedQuery(name = "Menu.findByOrden", query = "SELECT m FROM Menu m WHERE m.orden = :orden"),
  @NamedQuery(name = "Menu.findByNombre", query = "SELECT m FROM Menu m WHERE m.nombre = :nombre"),
  @NamedQuery(name = "Menu.findByEnlace", query = "SELECT m FROM Menu m WHERE m.enlace = :enlace"),
  @NamedQuery(name = "Menu.findByActivo", query = "SELECT m FROM Menu m WHERE m.activo = :activo")})
public class Menu implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "id")
  private Integer id;
  @Column(name = "padre")
  private Integer padre;
  @Column(name = "orden")
  private Short orden;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 45)
  @Column(name = "nombre")
  private String nombre;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 100)
  @Column(name = "enlace")
  private String enlace;
  @Basic(optional = false)
  @NotNull
  @Column(name = "activo")
  private boolean activo;

  public Menu() {
  }

  public Menu(Integer id) {
    this.id = id;
  }

  public Menu(Integer id, String nombre, String enlace, boolean activo) {
    this.id = id;
    this.nombre = nombre;
    this.enlace = enlace;
    this.activo = activo;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getPadre() {
    return padre;
  }

  public void setPadre(Integer padre) {
    this.padre = padre;
  }

  public Short getOrden() {
    return orden;
  }

  public void setOrden(Short orden) {
    this.orden = orden;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getEnlace() {
    return enlace;
  }

  public void setEnlace(String enlace) {
    this.enlace = enlace;
  }

  public boolean getActivo() {
    return activo;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
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
    if (!(object instanceof Menu)) {
      return false;
    }
    Menu other = (Menu) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "com.gym.entities.Menu[ id=" + id + " ]";
  }
  
}
