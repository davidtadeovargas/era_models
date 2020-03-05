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
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.Index;

@Entity @Table(name = "cumple",uniqueConstraints = {@UniqueConstraint( columnNames ={"id_id"})}) public class Cumple {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Column(name = "de", nullable = false,length = 150) private String de;
  @Column(name = "a", nullable = false,length = 150) private String a;
  @Column(name = "fcumple", nullable = false,length = 30) private String fcumple;
  @Index(name="cumple_codemp") @Column(name = "codemp", nullable = false,length = 30) private String codemp;
  @Column(name = "ser", nullable = false,length = 30) private String ser;
  @Column(name = "estad", nullable = false) private boolean estad;  
  @Column(name = "usuario", nullable = false,length = 30) private String usuario;
  @Column(name = "sucu", nullable = false,length = 30) private String sucu;
  @Column(name = "nocaj", nullable = false,length = 30) private String nocaj;
  @Column(name = "anio", nullable = true, length = 10) private String anio = "";
  @Column(name = "fhoy", nullable = false) private Date fhoy = new Date();
  @Column(name = "falt", nullable = true) private Date falt;
  @Column(name = "fmod", nullable = false) private Date fmod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getFcumple() {
        return fcumple;
    }

    public void setFcumple(String fcumple) {
        this.fcumple = fcumple;
    }

    public String getCodemp() {
        return codemp;
    }

    public void setCodemp(String codemp) {
        this.codemp = codemp;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public boolean isEstad() {
        return estad;
    }

    public void setEstad(boolean estad) {
        this.estad = estad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public Date getFhoy() {
        return fhoy;
    }

    public void setFhoy(Date fhoy) {
        this.fhoy = fhoy;
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