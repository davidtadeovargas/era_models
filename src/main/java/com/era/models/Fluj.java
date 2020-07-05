/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.models;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Index;
//@Index(name="")

@Entity @Table(name = "fluj") public class Fluj {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "fluj", nullable = false) private int id;
  @Index(name="fluj_concep") @Column(name = "concep", nullable = false,length = 100) private String concep;
  @Column(name = "tipdoc", nullable = false,length = 50) private String tipdoc;
  @Column(name = "norefer", nullable = false,length = 50) private String norefer;
  @Index(name="fluj_ing_eg") @Column(name = "ing_eg", nullable = false,length = 5) private String ing_eg;  
  @Column(name = "impo", nullable = true) private BigDecimal impo;
  @Column(name = "mon", nullable = false,length = 100) private String mon;
  @Column(name = "modd", nullable = false,length = 10) private String modd;
  @Column(name = "vta", nullable = false, columnDefinition = "int default 0") private int vta;
  @Column(name = "ncortz", nullable = false, columnDefinition = "int default 0") private int ncortz;
  @Index(name="corta") @Column(name = "corta", nullable = true, columnDefinition = "boolean default false") private boolean corta;
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

    public String getConcep() {
        return concep;
    }

    public void setConcep(String concep) {
        this.concep = concep;
    }

    public String getTipdoc() {
        return tipdoc;
    }

    public void setTipdoc(String tipdoc) {
        this.tipdoc = tipdoc;
    }

    public String getNorefer() {
        return norefer;
    }

    public void setNorefer(String norefer) {
        this.norefer = norefer;
    }

    public String getIng_eg() {
        return ing_eg;
    }

    public void setIng_eg(String ing_eg) {
        this.ing_eg = ing_eg;
    }

    public BigDecimal getImpo() {
        return impo;
    }

    public void setImpo(BigDecimal impo) {
        this.impo = impo;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getModd() {
        return modd;
    }

    public void setModd(String modd) {
        this.modd = modd;
    }

    public int getVta() {
        return vta;
    }

    public void setVta(int vta) {
        this.vta = vta;
    }

    public int getNcortz() {
        return ncortz;
    }

    public void setNcortz(int ncortz) {
        this.ncortz = ncortz;
    }

    public boolean getCorta() {
        return corta;
    }

    public void setCorta(boolean corta) {
        this.corta = corta;
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
