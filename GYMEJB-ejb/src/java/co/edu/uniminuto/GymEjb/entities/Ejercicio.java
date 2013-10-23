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
import javax.persistence.JoinColumn;
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
 * @author miguelcamargo9
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
  @ManyToMany(mappedBy = "ejercicioCollection")
  private Collection<Objetivo> objetivoCollection;
  @ManyToMany(mappedBy = "ejercicioCollection")
  private Collection<Maquina> maquinaCollection;
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEjercicio")
  private Collection<Rutinaejercicio> rutinaejercicioCollection;
  @JoinColumn(name = "idCategoria", referencedColumnName = "id")
  @ManyToOne
  private Categoria idCategoria;

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
  public Collection<Objetivo> getObjetivoCollection() {
    return objetivoCollection;
  }

  public void setObjetivoCollection(Collection<Objetivo> objetivoCollection) {
    this.objetivoCollection = objetivoCollection;
  }

  @XmlTransient
  public Collection<Maquina> getMaquinaCollection() {
    return maquinaCollection;
  }

  public void setMaquinaCollection(Collection<Maquina> maquinaCollection) {
    this.maquinaCollection = maquinaCollection;
  }

  @XmlTransient
  public Collection<Rutinaejercicio> getRutinaejercicioCollection() {
    return rutinaejercicioCollection;
  }

  public void setRutinaejercicioCollection(Collection<Rutinaejercicio> rutinaejercicioCollection) {
    this.rutinaejercicioCollection = rutinaejercicioCollection;
  }

  public Categoria getIdCategoria() {
    return idCategoria;
  }

  public void setIdCategoria(Categoria idCategoria) {
    this.idCategoria = idCategoria;
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
    return "co.edu.uniminuto.GymEjb.entities.Ejercicio[ id=" + id + " ]";
  }
  
}
