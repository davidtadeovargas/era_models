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

@Entity @Table(name = "ords") public class Ords {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "codord", nullable = false) private int id;
  @Index(name="prov") @Column(name = "prov", nullable = false,length = 30) private String prov;
  @Column(name = "proy", nullable = false,length = 30) private String proy;
  @Column(name = "subtot", nullable = true) private float subtot;
  @Column(name = "impue", nullable = true) private float impue;
  @Column(name = "total", nullable = true) private float total;
  @Column(name = "eje", nullable = false,length = 255) private String eje;  
  @Column(name = "estac", nullable = false,length = 30) private String estac;
  @Column(name = "sucu", nullable = false,length = 30) private String sucu;
  @Column(name = "nocaj", nullable = false,length = 30) private String nocaj;
  @Column(name = "fent", nullable = false) private Date fent = new Date();
  @Column(name = "falt", nullable = true) private Date falt;
  @Column(name = "fmod", nullable = false) private Date fmod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getProy() {
        return proy;
    }

    public void setProy(String proy) {
        this.proy = proy;
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

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getEje() {
        return eje;
    }

    public void setEje(String eje) {
        this.eje = eje;
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

    
}
