/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Index(name="")

@Entity @Table(name = "registroemail") public class Registroemail {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Column(name = "correo", nullable = false,length = 350) private String correo;
  @Column(name = "contra", nullable = false,length = 100) private String contra;
  @Column(name = "generada_fecha", nullable = false) private Date generada_fecha;
  @Column(name = "cambiada_fecha", nullable = false) private Date cambiada_fecha = new Date();
  @Column(name = "ya_entro_booleano", nullable = false, columnDefinition = "int default 0") private int ya_entro_booleano;  
  @Column(name = "estac", nullable = false,length = 30) private String estac;
@Column(name = "sucu", nullable = false,length = 30) private String sucu;
@Column(name = "nocaj", nullable = false,length = 30) private String nocaj;  
@Column(name = "falt", nullable = true) private Date falt;
@Column(name = "fmod", nullable = false) private Date fmod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getGenerada_fecha() {
        return generada_fecha;
    }

    public void setGenerada_fecha(Date generada_fecha) {
        this.generada_fecha = generada_fecha;
    }

    public Date getCambiada_fecha() {
        return cambiada_fecha;
    }

    public void setCambiada_fecha(Date cambiada_fecha) {
        this.cambiada_fecha = cambiada_fecha;
    }

    public int getYa_entro_booleano() {
        return ya_entro_booleano;
    }

    public void setYa_entro_booleano(int ya_entro_booleano) {
        this.ya_entro_booleano = ya_entro_booleano;
    }

    public String getEstac() {
        return estac;
    }

    public void setEstac(String estac) {
        this.estac = estac;
    }

    public String getSucu() {
        return sucu;
    }

    public void setSucu(String sucu) {
        this.sucu = sucu;
    }

    public String getNocaj() {
        return nocaj;
    }

    public void setNocaj(String nocaj) {
        this.nocaj = nocaj;
    }

    public Date getFalt() {
        return falt;
    }

    public void setFalt(Date falt) {
        this.falt = falt;
    }

    public Date getFmod() {
        return fmod;
    }

    public void setFmod(Date fmod) {
        this.fmod = fmod;
    }


    
}
