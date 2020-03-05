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

@Entity @Table(name = "petis",uniqueConstraints = {@UniqueConstraint( columnNames ={"id_id"})}) public class Petis {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Column(name = "nomarch", nullable = false,length = 1000) private String nomarch;
  @Column(name = "path", nullable = false,length = 1000) private String path;  
  @Index(name="petis_estac") @Column(name = "estac", nullable = false,length = 30) private String estac;
  @Column(name = "estacdestin", nullable = false,length = 30) private String estacdestin;
  @Column(name = "val", nullable = false) private boolean val;
  @Column(name = "estad", nullable = false) private boolean estad;
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

    public String getNomarch() {
        return nomarch;
    }

    public void setNomarch(String nomarch) {
        this.nomarch = nomarch;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getEstac() {
        return estac;
    }

    public void setEstac(String estac) {
        this.estac = estac;
    }

    public String getEstacdestin() {
        return estacdestin;
    }

    public void setEstacdestin(String estacdestin) {
        this.estacdestin = estacdestin;
    }

    public boolean isVal() {
        return val;
    }

    public void setVal(boolean val) {
        this.val = val;
    }

    public boolean isEstad() {
        return estad;
    }

    public void setEstad(boolean estad) {
        this.estad = estad;
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
