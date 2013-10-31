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
@Table(name = "zonacuerpo")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "Zonacuerpo.findAll", query = "SELECT z FROM Zonacuerpo z"),
  @NamedQuery(name = "Zonacuerpo.findById", query = "SELECT z FROM Zonacuerpo z WHERE z.id = :id"),
  @NamedQuery(name = "Zonacuerpo.findByNombre", query = "SELECT z FROM Zonacuerpo z WHERE z.nombre = :nombre")})
public class Zonacuerpo implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "id")
  private Integer id;
  @Size(max = 50)
  @Column(name = "nombre")
  private String nombre;
  @ManyToMany(mappedBy = "zonacuerpoList")
  private List<Maquina> maquinaList;

  public Zonacuerpo() {
  }

  public Zonacuerpo(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @XmlTransient
  public List<Maquina> getMaquinaList() {
    return maquinaList;
  }

  public void setMaquinaList(List<Maquina> maquinaList) {
    this.maquinaList = maquinaList;
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
    if (!(object instanceof Zonacuerpo)) {
      return false;
    }
    Zonacuerpo other = (Zonacuerpo) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "com.gym.entities.Zonacuerpo[ id=" + id + " ]";
  }
  
}
