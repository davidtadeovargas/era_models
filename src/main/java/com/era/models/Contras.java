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

@Entity @Table(name = "contras",uniqueConstraints = {@UniqueConstraint( columnNames ={"id_idp"})}) public class Contras {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Column(name = "id_idp", nullable = false) private int id_idp;  
  @Index(name="contras_prov") @Column(name = "prov", nullable = false,length = 30) private String prov;
  @Column(name = "respon", nullable = false,length = 100) private String respon;
  @Index(name="contras_comp") @Column(name = "comp", nullable = false,length = 30) private String comp;
  @Column(name = "tot", nullable = true) private float tot;
  @Column(name = "fech", nullable = true) private Date fech = new Date();
  @Column(name = "falt", nullable = true) private Date falt;  
  @Column(name = "estac", nullable = false,length = 30) private String estac;
  @Column(name = "sucu", nullable = false,length = 30) private String sucu;
  @Column(name = "nocaj", nullable = false,length = 30) private String nocaj;  
  @Column(name = "fmod", nullable = false) private Date fmod; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_idp() {
        return id_idp;
    }

    public void setId_idp(int id_idp) {
        this.id_idp = id_idp;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getRespon() {
        return respon;
    }

    public void setRespon(String respon) {
        this.respon = respon;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public float getTot() {
        return tot;
    }

    public void setTot(float tot) {
        this.tot = tot;
    }

    public Date getFech() {
        return fech;
    }

    public void setFech(Date fech) {
        this.fech = fech;
    }

    public Date getFalt() {
        return falt;
    }

    public void setFalt(Date falt) {
        this.falt = falt;
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

    public Date getFmod() {
        return fmod;
    }

    public void setFmod(Date fmod) {
        this.fmod = fmod;
    }
  
      
  
}