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

@Entity @Table(name = "partords") public class Partords {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="codord") @Column(name = "codord", nullable = false,length = 30) private String codord;
  @Column(name = "codcot", nullable = false,length = 30) private String codcot;
  @Column(name = "prod", nullable = false,length = 30) private String prod;
  @Column(name = "cant", nullable = false) private int cant;
  @Column(name = "alma", nullable = false,length = 30) private String alma;
  @Column(name = "unid", nullable = false,length = 30) private String unid;
  @Column(name = "descrip", nullable = false,length = 255) private String descrip;
  @Column(name = "mon", nullable = false,length = 30) private String mon;
  @Column(name = "descu", nullable = false) private int descu;
  @Column(name = "descad", nullable = false) private int descad;
  @Column(name = "impue", nullable = false,length = 30) private String impue;
  @Column(name = "impueval", nullable = false) private int impueval;
  @Column(name = "ultcost", nullable = true) private float ultcost;
  @Column(name = "impo", nullable = true) private float impo;
  @Column(name = "impoimpue", nullable = true) private float impoimpue;  
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

    public String getCodord() {
        return codord;
    }

    public void setCodord(String codord) {
        this.codord = codord;
    }

    public String getCodcot() {
        return codcot;
    }

    public void setCodcot(String codcot) {
        this.codcot = codcot;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getAlma() {
        return alma;
    }

    public void setAlma(String alma) {
        this.alma = alma;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public int getDescu() {
        return descu;
    }

    public void setDescu(int descu) {
        this.descu = descu;
    }

    public int getDescad() {
        return descad;
    }

    public void setDescad(int descad) {
        this.descad = descad;
    }

    public String getImpue() {
        return impue;
    }

    public void setImpue(String impue) {
        this.impue = impue;
    }

    public int getImpueval() {
        return impueval;
    }

    public void setImpueval(int impueval) {
        this.impueval = impueval;
    }

    public float getUltcost() {
        return ultcost;
    }

    public void setUltcost(float ultcost) {
        this.ultcost = ultcost;
    }

    public float getImpo() {
        return impo;
    }

    public void setImpo(float impo) {
        this.impo = impo;
    }

    public float getImpoimpue() {
        return impoimpue;
    }

    public void setImpoimpue(float impoimpue) {
        this.impoimpue = impoimpue;
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
