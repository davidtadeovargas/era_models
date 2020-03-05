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
//@Index(name="")

@Entity @Table(name = "prevcomprs",uniqueConstraints = {@UniqueConstraint( columnNames ={"id_id"})}) public class Prevcomprs {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="prevcomprs_codprevcomp") @Column(name = "codprevcomp", nullable = false,length = 30) private String codprevcomp;
  @Column(name = "motiv", nullable = false,length = 255) private String motiv;
  @Column(name = "noser", nullable = false,length = 30) private String noser;
  @Column(name = "nodoc", nullable = true, length = 30) private String nodoc = "";
  @Column(name = "prov", nullable = false,length = 30) private String prov;
  @Column(name = "ser", nullable = false,length = 30) private String ser;
  @Column(name = "codcomp", nullable = true, length = 30) private String codcomp = "";
  @Column(name = "nosercomp", nullable = false,length = 30) private String nosercomp;
  @Column(name = "notcredpag", nullable = true, length = 250) private String notcredpag = "";
  @Column(name = "tipcam", nullable = true) private float tipcam;
  @Column(name = "mon", nullable = false,length = 30) private String mon;
  @Column(name = "ruta", nullable = true, length = 500) private String ruta = "";
  @Column(name = "observ", nullable = true, length = 255) private String observ = "";
  @Column(name = "subtot", nullable = true) private float subtot;
  @Column(name = "impue", nullable = true) private float impue;
  @Column(name = "tip", nullable = true, length = 30) private String tip = "PREV";
  @Column(name = "tot", nullable = true) private float tot;
  @Column(name = "estado", nullable = false,length = 10) private String estado;  
  @Column(name = "estac", nullable = false,length = 30) private String estac;
  @Column(name = "sucu", nullable = false,length = 30) private String sucu;
  @Column(name = "nocaj", nullable = false,length = 30) private String nocaj;
  @Column(name = "fdoc", nullable = true) private Date fdoc = new Date();
  @Column(name = "fent", nullable = true) private Date fent = new Date();
  @Column(name = "falt", nullable = true) private Date falt;
  @Column(name = "fmod", nullable = false) private Date fmod;
  @Column(name = "fvenc", nullable = false) private Date fvenc = new Date();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodprevcomp() {
        return codprevcomp;
    }

    public void setCodprevcomp(String codprevcomp) {
        this.codprevcomp = codprevcomp;
    }

    public String getMotiv() {
        return motiv;
    }

    public void setMotiv(String motiv) {
        this.motiv = motiv;
    }

    public String getNoser() {
        return noser;
    }

    public void setNoser(String noser) {
        this.noser = noser;
    }

    public String getNodoc() {
        return nodoc;
    }

    public void setNodoc(String nodoc) {
        this.nodoc = nodoc;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getCodcomp() {
        return codcomp;
    }

    public void setCodcomp(String codcomp) {
        this.codcomp = codcomp;
    }

    public String getNosercomp() {
        return nosercomp;
    }

    public void setNosercomp(String nosercomp) {
        this.nosercomp = nosercomp;
    }

    public String getNotcredpag() {
        return notcredpag;
    }

    public void setNotcredpag(String notcredpag) {
        this.notcredpag = notcredpag;
    }

    public float getTipcam() {
        return tipcam;
    }

    public void setTipcam(float tipcam) {
        this.tipcam = tipcam;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
    }

    public float getSubtot() {
        return subtot;
    }

    public void setSubtot(float subtot) {
        this.subtot = subtot;
    }

    public float getImpue() {
        return impue;
    }

    public void setImpue(float impue) {
        this.impue = impue;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public float getTot() {
        return tot;
    }

    public void setTot(float tot) {
        this.tot = tot;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public Date getFdoc() {
        return fdoc;
    }

    public void setFdoc(Date fdoc) {
        this.fdoc = fdoc;
    }

    public Date getFent() {
        return fent;
    }

    public void setFent(Date fent) {
        this.fent = fent;
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

    public Date getFvenc() {
        return fvenc;
    }

    public void setFvenc(Date fvenc) {
        this.fvenc = fvenc;
    }

    
}
