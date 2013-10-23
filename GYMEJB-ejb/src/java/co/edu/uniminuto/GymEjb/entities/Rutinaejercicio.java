/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.GymEjb.entities;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author miguelcamargo9
 */
@Entity
@Table(name = "rutinaejercicio")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "Rutinaejercicio.findAll", query = "SELECT r FROM Rutinaejercicio r"),
  @NamedQuery(name = "Rutinaejercicio.findById", query = "SELECT r FROM Rutinaejercicio r WHERE r.id = :id"),
  @NamedQuery(name = "Rutinaejercicio.findByDuracion", query = "SELECT r FROM Rutinaejercicio r WHERE r.duracion = :duracion"),
  @NamedQuery(name = "Rutinaejercicio.findByRegularidad", query = "SELECT r FROM Rutinaejercicio r WHERE r.regularidad = :regularidad"),
  @NamedQuery(name = "Rutinaejercicio.findByVelocidad", query = "SELECT r FROM Rutinaejercicio r WHERE r.velocidad = :velocidad"),
  @NamedQuery(name = "Rutinaejercicio.findByDistacia", query = "SELECT r FROM Rutinaejercicio r WHERE r.distacia = :distacia"),
  @NamedQuery(name = "Rutinaejercicio.findByLibraslevantar", query = "SELECT r FROM Rutinaejercicio r WHERE r.libraslevantar = :libraslevantar")})
public class Rutinaejercicio implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "id")
  private Integer id;
  // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
  @Column(name = "duracion")
  private Double duracion;
  @Column(name = "regularidad")
  private Double regularidad;
  @Column(name = "velocidad")
  private Double velocidad;
  @Column(name = "distacia")
  private Double distacia;
  @Column(name = "libraslevantar")
  private Integer libraslevantar;
  @JoinColumn(name = "idEjercicio", referencedColumnName = "id")
  @ManyToOne(optional = false)
  private Ejercicio idEjercicio;
  @JoinColumn(name = "idRutina", referencedColumnName = "id")
  @ManyToOne(optional = false)
  private Rutina idRutina;
  @JoinColumn(name = "idUsuario", referencedColumnName = "id")
  @ManyToOne(optional = false)
  private Usuario idUsuario;

  public Rutinaejercicio() {
  }

  public Rutinaejercicio(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Double getDuracion() {
    return duracion;
  }

  public void setDuracion(Double duracion) {
    this.duracion = duracion;
  }

  public Double getRegularidad() {
    return regularidad;
  }

  public void setRegularidad(Double regularidad) {
    this.regularidad = regularidad;
  }

  public Double getVelocidad() {
    return velocidad;
  }

  public void setVelocidad(Double velocidad) {
    this.velocidad = velocidad;
  }

  public Double getDistacia() {
    return distacia;
  }

  public void setDistacia(Double distacia) {
    this.distacia = distacia;
  }

  public Integer getLibraslevantar() {
    return libraslevantar;
  }

  public void setLibraslevantar(Integer libraslevantar) {
    this.libraslevantar = libraslevantar;
  }

  public Ejercicio getIdEjercicio() {
    return idEjercicio;
  }

  public void setIdEjercicio(Ejercicio idEjercicio) {
    this.idEjercicio = idEjercicio;
  }

  public Rutina getIdRutina() {
    return idRutina;
  }

  public void setIdRutina(Rutina idRutina) {
    this.idRutina = idRutina;
  }

  public Usuario getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(Usuario idUsuario) {
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
    if (!(object instanceof Rutinaejercicio)) {
      return false;
    }
    Rutinaejercicio other = (Rutinaejercicio) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "co.edu.uniminuto.GymEjb.entities.Rutinaejercicio[ id=" + id + " ]";
  }
  
}
