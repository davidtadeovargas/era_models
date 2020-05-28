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
//@Index(name="")

@Entity @Table(name = "serieprod") public class Serieprod {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="prod") @Column(name = "prod", nullable = false,length = 30) private String prod;
  @Index(name="ser") @Column(name = "ser", nullable = false,length = 255) private String ser;
  @Column(name = "alma", nullable = false,length = 30) private String alma;
  @Column(name = "exist", nullable = true, columnDefinition = "float default 0") private float exist;
  @Column(name = "comen", nullable = false,length = 500) private String comen;  
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

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getAlma() {
        return alma;
    }

    public void setAlma(String alma) {
        this.alma = alma;
    }

    public float getExist() {
        return exist;
    }

    public void setExist(float exist) {
        this.exist = exist;
    }

    public String getComen() {
        return comen;
    }

    public void setComen(String comen) {
        this.comen = comen;
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
