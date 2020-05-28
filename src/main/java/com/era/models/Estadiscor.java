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
//@Index(name="")
@Entity @Table(name = "estadiscor",uniqueConstraints = {@UniqueConstraint( columnNames ={"id_id"})}) public class Estadiscor {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Column(name = "corrde", nullable = false,length = 61) private String corrde;
  @Column(name = "corr", nullable = false,length = 61) private String corr;
  @Column(name = "nodoc", nullable = false,length = 255) private String nodoc;
  @Column(name = "tipdoc", nullable = false,length = 100) private String tipdoc;
  @Column(name = "estad", nullable = false,length = 100) private String estad;
  @Column(name = "motiv", nullable = false,length = 500) private String motiv;  
  @Column(name = "estac", nullable = false,length = 30) private String estac;
  @Column(name = "sucu", nullable = false,length = 30) private String sucu;
  @Column(name = "export", nullable = true, columnDefinition = "boolean default false") private boolean export = false;
  @Column(name = "falt", nullable = true) private Date falt;
  @Column(name = "nocaj", nullable = false,length = 30) private String nocaj;  
  @Column(name = "fmod", nullable = false) private Date fmod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorrde() {
        return corrde;
    }

    public void setCorrde(String corrde) {
        this.corrde = corrde;
    }

    public String getCorr() {
        return corr;
    }

    public void setCorr(String corr) {
        this.corr = corr;
    }

    public String getNodoc() {
        return nodoc;
    }

    public void setNodoc(String nodoc) {
        this.nodoc = nodoc;
    }

    public String getTipdoc() {
        return tipdoc;
    }

    public void setTipdoc(String tipdoc) {
        this.tipdoc = tipdoc;
    }

    public String getEstad() {
        return estad;
    }

    public void setEstad(String estad) {
        this.estad = estad;
    }

    public String getMotiv() {
        return motiv;
    }

    public void setMotiv(String motiv) {
        this.motiv = motiv;
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

    public boolean isExport() {
        return export;
    }

    public void setExport(boolean export) {
        this.export = export;
    }

    public Date getFalt() {
        return falt;
    }

    public void setFalt(Date falt) {
        this.falt = falt;
    }

    public String getNocaj() {
        return nocaj;
    }

    public void setNocaj(String nocaj) {
        this.nocaj = nocaj;
    }

    public Date getFmod() {
        return fmod;
    }

    public void setFmod(Date fmod) {
        this.fmod = fmod;
    }
  
  
        
}

