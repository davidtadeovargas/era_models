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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.Index;

@Entity @Table(name = "confgral",uniqueConstraints = {@UniqueConstraint( columnNames ={"id_id"})}) public class Confgral {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="confgral_clasif") @Column(name = "clasif", nullable = false,length = 45) private String clasif;
  @Index(name="confgral_conf") @Column(name = "conf", nullable = false,length = 45) private String conf;
  @Column(name = "val", nullable = false) private int val;
  @Column(name = "nume", nullable = true) private float nume = 0;
  @Temporal(TemporalType.TIMESTAMP)@Column(name = "falt", nullable = true) private Date falt;
  @Temporal(TemporalType.TIMESTAMP)@Column(name = "fmod", nullable = false, updatable=false) private Date fmod;
  @Column(name = "estac", nullable = false,length = 30) private String estac;
  @Column(name = "dia", nullable = true) private int dia = 0;
  @Column(name = "envia", nullable = true) private Date envia = new Date();
  @Column(name = "extr", nullable = true, length = 1000) private String extr = "";
  @Column(name = "asun", nullable = true, length = 255) private String asun = "";
  @Column(name = "anio", nullable = true) private int anio = 0;
  @Column(name = "sucu", nullable = false,length = 30) private String sucu;
  @Column(name = "nocaj", nullable = false,length = 30) private String nocaj;
  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClasif() {
        return clasif;
    }

    public void setClasif(String clasif) {
        this.clasif = clasif;
    }

    public String getConf() {
        return conf;
    }

    public void setConf(String conf) {
        this.conf = conf;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public float getNume() {
        return nume;
    }

    public void setNume(float nume) {
        this.nume = nume;
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

    public String getEstac() {
        return estac;
    }

    public void setEstac(String estac) {
        this.estac = estac;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Date getEnvia() {
        return envia;
    }

    public void setEnvia(Date envia) {
        this.envia = envia;
    }

    public String getExtr() {
        return extr;
    }

    public void setExtr(String extr) {
        this.extr = extr;
    }

    public String getAsun() {
        return asun;
    }

    public void setAsun(String asun) {
        this.asun = asun;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
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
  
    
}
