/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.time.LocalDate;
import javax.jws.WebService;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author dylan
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_usuario", discriminatorType = DiscriminatorType.STRING)
@Table(name="usuario")
@WebService
public class Usuario implements Serializable {
    
    @Id
	@Column(name="nick")
	    protected String nick;
	@Column(name="nombre")
	    protected String nombre;
	@Column(name="apellido")
	    protected String apellido;
	@Column(name="mail", unique=true)
	    protected String mail;
	@Column(name="imagen")
	    protected String imagen;
	@Column(name="fecNac")
        @XmlJavaTypeAdapter(LocalDateAdapter.class)
	    protected LocalDate fecNacimiento;
        @Column(name="password", nullable = false)
	    protected String contraseñaHash;
    

    public String getNick() {
        return nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public LocalDate getFechaNacimiento() {     
        return fecNacimiento;
    }
    public void setFecNac(LocalDate fecNac) {
        this.fecNacimiento = fecNac;
    }
    public String getContraseñaHash() {
        return contraseñaHash;
    }

    public void setContraseñaHash(String contraseñaHash) {
        this.contraseñaHash = contraseñaHash;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
    
      
 
    public String getContraseña() {
        return contraseñaHash;
    }

    public void setContraseña(String contraseña) {
        this.contraseñaHash = contraseña;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nick != null ? nick.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.nick == null && other.nick != null) || (this.nick != null && !this.nick.equals(other.nick))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistences.Usuario[ id=" + nick + " ]";
    }
    
}
