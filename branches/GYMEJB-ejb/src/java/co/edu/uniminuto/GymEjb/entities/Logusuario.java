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
 * @author Sebastian Rojas
 */
@Entity
@Table(name = "logusuario")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "Logusuario.findAll", query = "SELECT l FROM Logusuario l"),
  @NamedQuery(name = "Logusuario.findById", query = "SELECT l FROM Logusuario l WHERE l.id = :id"),
  @NamedQuery(name = "Logusuario.findByIdMaquina", query = "SELECT l FROM Logusuario l WHERE l.idMaquina = :idMaquina"),
  @NamedQuery(name = "Logusuario.findByVelocidad", query = "SELECT l FROM Logusuario l WHERE l.velocidad = :velocidad"),
  @NamedQuery(name = "Logusuario.findByRitmoCardiaco", query = "SELECT l FROM Logusuario l WHERE l.ritmoCardiaco = :ritmoCardiaco"),
  @NamedQuery(name = "Logusuario.findByCaloriasQuemadas", query = "SELECT l FROM Logusuario l WHERE l.caloriasQuemadas = :caloriasQuemadas"),
  @NamedQuery(name = "Logusuario.findByRepeticiones", query = "SELECT l FROM Logusuario l WHERE l.repeticiones = :repeticiones"),
  @NamedQuery(name = "Logusuario.findByDuracion", query = "SELECT l FROM Logusuario l WHERE l.duracion = :duracion"),
  @NamedQuery(name = "Logusuario.findByDistancia", query = "SELECT l FROM Logusuario l WHERE l.distancia = :distancia"),
  @NamedQuery(name = "Logusuario.findByLibrasLevantadas", query = "SELECT l FROM Logusuario l WHERE l.librasLevantadas = :librasLevantadas")})
public class Logusuario implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "id")
  private Integer id;
  @Column(name = "idMaquina")
  private Integer idMaquina;
  // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
  @Column(name = "velocidad")
  private Double velocidad;
  @Column(name = "ritmoCardiaco")
  private Double ritmoCardiaco;
  @Column(name = "caloriasQuemadas")
  private Double caloriasQuemadas;
  @Column(name = "repeticiones")
  private Integer repeticiones;
  @Column(name = "duracion")
  private Double duracion;
  @Column(name = "distancia")
  private Double distancia;
  @Column(name = "librasLevantadas")
  private Integer librasLevantadas;
  @JoinColumn(name = "idUsuario", referencedColumnName = "id")
  @ManyToOne
  private Usuario idUsuario;
  @JoinColumn(name = "idRutina", referencedColumnName = "id")
  @ManyToOne
  private Rutina idRutina;
  @JoinColumn(name = "idRutina", referencedColumnName = "id")
  @ManyToOne
  private Maquina idRutina1;

  public Logusuario() {
  }

  public Logusuario(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getIdMaquina() {
    return idMaquina;
  }

  public void setIdMaquina(Integer idMaquina) {
    this.idMaquina = idMaquina;
  }

  public Double getVelocidad() {
    return velocidad;
  }

  public void setVelocidad(Double velocidad) {
    this.velocidad = velocidad;
  }

  public Double getRitmoCardiaco() {
    return ritmoCardiaco;
  }

  public void setRitmoCardiaco(Double ritmoCardiaco) {
    this.ritmoCardiaco = ritmoCardiaco;
  }

  public Double getCaloriasQuemadas() {
    return caloriasQuemadas;
  }

  public void setCaloriasQuemadas(Double caloriasQuemadas) {
    this.caloriasQuemadas = caloriasQuemadas;
  }

  public Integer getRepeticiones() {
    return repeticiones;
  }

  public void setRepeticiones(Integer repeticiones) {
    this.repeticiones = repeticiones;
  }

  public Double getDuracion() {
    return duracion;
  }

  public void setDuracion(Double duracion) {
    this.duracion = duracion;
  }

  public Double getDistancia() {
    return distancia;
  }

  public void setDistancia(Double distancia) {
    this.distancia = distancia;
  }

  public Integer getLibrasLevantadas() {
    return librasLevantadas;
  }

  public void setLibrasLevantadas(Integer librasLevantadas) {
    this.librasLevantadas = librasLevantadas;
  }

  public Usuario getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(Usuario idUsuario) {
    this.idUsuario = idUsuario;
  }

  public Rutina getIdRutina() {
    return idRutina;
  }

  public void setIdRutina(Rutina idRutina) {
    this.idRutina = idRutina;
  }

  public Maquina getIdRutina1() {
    return idRutina1;
  }

  public void setIdRutina1(Maquina idRutina1) {
    this.idRutina1 = idRutina1;
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
    if (!(object instanceof Logusuario)) {
      return false;
    }
    Logusuario other = (Logusuario) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "co.edu.uniminuto.GymEjb.entities.Logusuario[ id=" + id + " ]";
  }
  
}
