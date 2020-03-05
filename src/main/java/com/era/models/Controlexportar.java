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

@Entity @Table(name = "controlexportar") public class Controlexportar {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Column(name = "id_ultimaVentaExpo", nullable = false) private int id_ultimaVentaExpo;
  @Column(name = "id_ultimapartidaExpo", nullable = false) private int id_ultimapartidaExpo;  
  @Column(name = "fechaExpo", nullable = true) private Date fechaExpo = new Date();  
  @Column(name = "fechaImpo", nullable = true) private Date fechaImpo;
  @Column(name = "tipo", nullable = false,length = 255) private String tipo = "";
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

    public int getId_ultimaVentaExpo() {
        return id_ultimaVentaExpo;
    }

    public void setId_ultimaVentaExpo(int id_ultimaVentaExpo) {
        this.id_ultimaVentaExpo = id_ultimaVentaExpo;
    }

    public int getId_ultimapartidaExpo() {
        return id_ultimapartidaExpo;
    }

    public void setId_ultimapartidaExpo(int id_ultimapartidaExpo) {
        this.id_ultimapartidaExpo = id_ultimapartidaExpo;
    }

    public Date getFechaExpo() {
        return fechaExpo;
    }

    public void setFechaExpo(Date fechaExpo) {
        this.fechaExpo = fechaExpo;
    }

    public Date getFechaImpo() {
        return fechaImpo;
    }

    public void setFechaImpo(Date fechaImpo) {
        this.fechaImpo = fechaImpo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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