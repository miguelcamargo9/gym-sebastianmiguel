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
 * @author Sebastian Rojas
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
  @NamedQuery(name = "Usuario.findById", query = "SELECT u FROM Usuario u WHERE u.id = :id"),
  @NamedQuery(name = "Usuario.findByNombreUsuario", query = "SELECT u FROM Usuario u WHERE u.nombreUsuario = :nombreUsuario"),
  @NamedQuery(name = "Usuario.findByIdTipoUsuario", query = "SELECT u FROM Usuario u WHERE u.idTipoUsuario = :idTipoUsuario"),
  @NamedQuery(name = "Usuario.findByPesoUsuario", query = "SELECT u FROM Usuario u WHERE u.pesoUsuario = :pesoUsuario"),
  @NamedQuery(name = "Usuario.findByAlturaUsuario", query = "SELECT u FROM Usuario u WHERE u.alturaUsuario = :alturaUsuario"),
  @NamedQuery(name = "Usuario.findByEdadUsuario", query = "SELECT u FROM Usuario u WHERE u.edadUsuario = :edadUsuario"),
  @NamedQuery(name = "Usuario.findByContrasena", query = "SELECT u FROM Usuario u WHERE u.contrasena = :contrasena")})
public class Usuario implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "id")
  private Integer id;
  @Size(max = 100)
  @Column(name = "nombreUsuario")
  private String nombreUsuario;
  @Column(name = "idTipoUsuario")
  private Integer idTipoUsuario;
  // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
  @Column(name = "pesoUsuario")
  private Float pesoUsuario;
  @Column(name = "alturaUsuario")
  private Float alturaUsuario;
  @Column(name = "edadUsuario")
  private Integer edadUsuario;
  @Size(max = 100)
  @Column(name = "contrasena")
  private String contrasena;
  @ManyToMany(mappedBy = "usuarioCollection")
  private Collection<Rutina> rutinaCollection;
  @OneToMany(mappedBy = "idUsuario")
  private Collection<Logusuario> logusuarioCollection;
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario")
  private Collection<Rutinaejercicio> rutinaejercicioCollection;

  public Usuario() {
  }

  public Usuario(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNombreUsuario() {
    return nombreUsuario;
  }

  public void setNombreUsuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
  }

  public Integer getIdTipoUsuario() {
    return idTipoUsuario;
  }

  public void setIdTipoUsuario(Integer idTipoUsuario) {
    this.idTipoUsuario = idTipoUsuario;
  }

  public Float getPesoUsuario() {
    return pesoUsuario;
  }

  public void setPesoUsuario(Float pesoUsuario) {
    this.pesoUsuario = pesoUsuario;
  }

  public Float getAlturaUsuario() {
    return alturaUsuario;
  }

  public void setAlturaUsuario(Float alturaUsuario) {
    this.alturaUsuario = alturaUsuario;
  }

  public Integer getEdadUsuario() {
    return edadUsuario;
  }

  public void setEdadUsuario(Integer edadUsuario) {
    this.edadUsuario = edadUsuario;
  }

  public String getContrasena() {
    return contrasena;
  }

  public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
  }

  @XmlTransient
  public Collection<Rutina> getRutinaCollection() {
    return rutinaCollection;
  }

  public void setRutinaCollection(Collection<Rutina> rutinaCollection) {
    this.rutinaCollection = rutinaCollection;
  }

  @XmlTransient
  public Collection<Logusuario> getLogusuarioCollection() {
    return logusuarioCollection;
  }

  public void setLogusuarioCollection(Collection<Logusuario> logusuarioCollection) {
    this.logusuarioCollection = logusuarioCollection;
  }

  @XmlTransient
  public Collection<Rutinaejercicio> getRutinaejercicioCollection() {
    return rutinaejercicioCollection;
  }

  public void setRutinaejercicioCollection(Collection<Rutinaejercicio> rutinaejercicioCollection) {
    this.rutinaejercicioCollection = rutinaejercicioCollection;
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
    if (!(object instanceof Usuario)) {
      return false;
    }
    Usuario other = (Usuario) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "co.edu.uniminuto.GymEjb.entities.Usuario[ id=" + id + " ]";
  }
  
}
