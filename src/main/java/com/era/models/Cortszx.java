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

@Entity @Table(name = "cortszx",uniqueConstraints = {@UniqueConstraint( columnNames ={"id_id"})}) public class Cortszx {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Column(name = "numcort", nullable = false, columnDefinition = "int default 0") private int numcort;
  @Column(name = "cort", nullable = false,length = 30) private String cort;
  @Column(name = "regis", nullable = true, columnDefinition = "int default 0") private int regis = 0;
  @Column(name = "totvtas", nullable = false, columnDefinition = "int default 0") private int totvtas;
  @Column(name = "totingr", nullable = true, columnDefinition = "float default 0") private float totingr;
  @Column(name = "totegre", nullable = true, columnDefinition = "float default 0") private float totegre;
  @Column(name = "totcaj", nullable = true, columnDefinition = "float default 0") private float totcaj;
  @Column(name = "vtabruta", nullable = true, columnDefinition = "float default 0") private float vtabruta = 0;
  @Column(name = "descu", nullable = true, columnDefinition = "float default 0") private float descu = 0;
  @Column(name = "devs", nullable = true, columnDefinition = "float default 0") private float devs = 0;
  @Column(name = "vtanet", nullable = true, columnDefinition = "float default 0") private float vtanet = 0;
  @Column(name = "impue", nullable = true, columnDefinition = "float default 0") private float impue = 0;
  @Column(name = "vtanetimp", nullable = true, columnDefinition = "float default 0") private float vtanetimp = 0;
  @Column(name = "totfacs", nullable = true, columnDefinition = "float default 0") private float totfacs = 0;
  @Column(name = "tottics", nullable = true, columnDefinition = "float default 0") private float tottics = 0;
  @Column(name = "cantfac", nullable = true, columnDefinition = "int default 0") private int cantfac = 0;
  @Column(name = "canttics", nullable = true, columnDefinition = "int default 0") private int canttics = 0;
  @Column(name = "totefe", nullable = true, columnDefinition = "float default 0") private float totefe = 0;
  @Column(name = "totdeb", nullable = true, columnDefinition = "float default 0") private float totdeb = 0;
  @Column(name = "tottarcred", nullable = true, columnDefinition = "float default 0") private float tottarcred = 0;
  @Column(name = "totdep", nullable = true, columnDefinition = "float default 0") private float totdep = 0;  
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

    public int getNumcort() {
        return numcort;
    }

    public void setNumcort(int numcort) {
        this.numcort = numcort;
    }

    public String getCort() {
        return cort;
    }

    public void setCort(String cort) {
        this.cort = cort;
    }

    public int getRegis() {
        return regis;
    }

    public void setRegis(int regis) {
        this.regis = regis;
    }

    public int getTotvtas() {
        return totvtas;
    }

    public void setTotvtas(int totvtas) {
        this.totvtas = totvtas;
    }

    public float getTotingr() {
        return totingr;
    }

    public void setTotingr(float totingr) {
        this.totingr = totingr;
    }

    public float getTotegre() {
        return totegre;
    }

    public void setTotegre(float totegre) {
        this.totegre = totegre;
    }

    public float getTotcaj() {
        return totcaj;
    }

    public void setTotcaj(float totcaj) {
        this.totcaj = totcaj;
    }

    public float getVtabruta() {
        return vtabruta;
    }

    public void setVtabruta(float vtabruta) {
        this.vtabruta = vtabruta;
    }

    public float getDescu() {
        return descu;
    }

    public void setDescu(float descu) {
        this.descu = descu;
    }

    public float getDevs() {
        return devs;
    }

    public void setDevs(float devs) {
        this.devs = devs;
    }

    public float getVtanet() {
        return vtanet;
    }

    public void setVtanet(float vtanet) {
        this.vtanet = vtanet;
    }

    public float getImpue() {
        return impue;
    }

    public void setImpue(float impue) {
        this.impue = impue;
    }

    public float getVtanetimp() {
        return vtanetimp;
    }

    public void setVtanetimp(float vtanetimp) {
        this.vtanetimp = vtanetimp;
    }

    public float getTotfacs() {
        return totfacs;
    }

    public void setTotfacs(float totfacs) {
        this.totfacs = totfacs;
    }

    public float getTottics() {
        return tottics;
    }

    public void setTottics(float tottics) {
        this.tottics = tottics;
    }

    public int getCantfac() {
        return cantfac;
    }

    public void setCantfac(int cantfac) {
        this.cantfac = cantfac;
    }

    public int getCanttics() {
        return canttics;
    }

    public void setCanttics(int canttics) {
        this.canttics = canttics;
    }

    public float getTotefe() {
        return totefe;
    }

    public void setTotefe(float totefe) {
        this.totefe = totefe;
    }

    public float getTotdeb() {
        return totdeb;
    }

    public void setTotdeb(float totdeb) {
        this.totdeb = totdeb;
    }

    public float getTottarcred() {
        return tottarcred;
    }

    public void setTottarcred(float tottarcred) {
        this.tottarcred = tottarcred;
    }

    public float getTotdep() {
        return totdep;
    }

    public void setTotdep(float totdep) {
        this.totdep = totdep;
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