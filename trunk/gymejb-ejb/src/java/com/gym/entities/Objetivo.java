/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "objetivo")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "Objetivo.findAll", query = "SELECT o FROM Objetivo o"),
  @NamedQuery(name = "Objetivo.findById", query = "SELECT o FROM Objetivo o WHERE o.id = :id")})
public class Objetivo implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "id")
  private Integer id;
  @Lob
  @Size(max = 65535)
  @Column(name = "descripcion")
  private String descripcion;
  @ManyToMany(mappedBy = "objetivoList")
  private List<Ejercicio> ejercicioList;

  public Objetivo() {
  }

  public Objetivo(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  @XmlTransient
  public List<Ejercicio> getEjercicioList() {
    return ejercicioList;
  }

  public void setEjercicioList(List<Ejercicio> ejercicioList) {
    this.ejercicioList = ejercicioList;
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
    if (!(object instanceof Objetivo)) {
      return false;
    }
    Objetivo other = (Objetivo) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "com.gym.entities.Objetivo[ id=" + id + " ]";
  }
  
}
