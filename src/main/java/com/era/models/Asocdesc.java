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
import org.hibernate.annotations.Index;

@Entity @Table(name = "asocdesc") public class Asocdesc {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="clien") @Column(name = "clien", nullable = false,length = 30) private String clien;
  @Index(name="prod") @Column(name = "prod", nullable = false,length = 30) private String prod;
  @Index(name="clas") @Column(name = "clas", nullable = false,length = 30) private String clas;
  @Column(name = "clasjera", nullable = false,length = 2048) private String clasjera;
  @Column(name = "util", nullable = true) private float util = 0;
  @Column(name = "list", nullable = true) private int list = 1;
  @Column(name = "prec", nullable = true) private float prec = 0;
  @Column(name = "usar", nullable = false,length = 10) private String usar;  
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

    public String getClien() {
        return clien;
    }

    public void setClien(String clien) {
        this.clien = clien;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getClasjera() {
        return clasjera;
    }

    public void setClasjera(String clasjera) {
        this.clasjera = clasjera;
    }

    public float getUtil() {
        return util;
    }

    public void setUtil(float util) {
        this.util = util;
    }

    public int getList() {
        return list;
    }

    public void setList(int list) {
        this.list = list;
    }

    public float getPrec() {
        return prec;
    }

    public void setPrec(float prec) {
        this.prec = prec;
    }

    public String getUsar() {
        return usar;
    }

    public void setUsar(String usar) {
        this.usar = usar;
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
