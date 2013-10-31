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
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "ejercicio")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "Ejercicio.findAll", query = "SELECT e FROM Ejercicio e"),
  @NamedQuery(name = "Ejercicio.findById", query = "SELECT e FROM Ejercicio e WHERE e.id = :id"),
  @NamedQuery(name = "Ejercicio.findByNombreEjercicio", query = "SELECT e FROM Ejercicio e WHERE e.nombreEjercicio = :nombreEjercicio")})
public class Ejercicio implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "id")
  private Integer id;
  @Size(max = 45)
  @Column(name = "nombreEjercicio")
  private String nombreEjercicio;
  @Lob
  @Size(max = 65535)
  @Column(name = "explicacion")
  private String explicacion;
  @JoinTable(name = "ejercicioobjetivo", joinColumns = {
    @JoinColumn(name = "idEjercicio", referencedColumnName = "id")}, inverseJoinColumns = {
    @JoinColumn(name = "idObjetivo", referencedColumnName = "id")})
  @ManyToMany
  private List<Objetivo> objetivoList;
  @JoinTable(name = "ejerciciomaquina", joinColumns = {
    @JoinColumn(name = "idEjercicio", referencedColumnName = "id")}, inverseJoinColumns = {
    @JoinColumn(name = "idMaquina", referencedColumnName = "id")})
  @ManyToMany
  private List<Maquina> maquinaList;
  @JoinColumn(name = "idCategoria", referencedColumnName = "id")
  @ManyToOne
  private Categoria idCategoria;
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEjercicio")
  private List<Rutinaejercicio> rutinaejercicioList;

  public Ejercicio() {
  }

  public Ejercicio(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNombreEjercicio() {
    return nombreEjercicio;
  }

  public void setNombreEjercicio(String nombreEjercicio) {
    this.nombreEjercicio = nombreEjercicio;
  }

  public String getExplicacion() {
    return explicacion;
  }

  public void setExplicacion(String explicacion) {
    this.explicacion = explicacion;
  }

  @XmlTransient
  public List<Objetivo> getObjetivoList() {
    return objetivoList;
  }

  public void setObjetivoList(List<Objetivo> objetivoList) {
    this.objetivoList = objetivoList;
  }

  @XmlTransient
  public List<Maquina> getMaquinaList() {
    return maquinaList;
  }

  public void setMaquinaList(List<Maquina> maquinaList) {
    this.maquinaList = maquinaList;
  }

  public Categoria getIdCategoria() {
    return idCategoria;
  }

  public void setIdCategoria(Categoria idCategoria) {
    this.idCategoria = idCategoria;
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
    if (!(object instanceof Ejercicio)) {
      return false;
    }
    Ejercicio other = (Ejercicio) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "com.gym.entities.Ejercicio[ id=" + id + " ]";
  }
  
}
