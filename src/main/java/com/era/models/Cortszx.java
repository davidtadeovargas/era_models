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
import javax.persistence.UniqueConstraint;

@Entity @Table(name = "cortszx",uniqueConstraints = {@UniqueConstraint( columnNames ={"id_id"})}) public class Cortszx {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Column(name = "numcort", nullable = false, columnDefinition = "int default 0") private int numcort;
  @Column(name = "cort", nullable = false,length = 30) private String cort;
  @Column(name = "regis", nullable = true, columnDefinition = "boolean default false") private boolean regis;
  @Column(name = "totvtas", nullable = false, columnDefinition = "int default 0") private int totvtas;
  @Column(name = "totingr", nullable = true) private BigDecimal totingr;
  @Column(name = "totegre", nullable = true) private BigDecimal totegre;
  @Column(name = "totcaj", nullable = true) private BigDecimal totcaj;
  @Column(name = "vtabruta", nullable = true) private BigDecimal vtabruta;
  @Column(name = "descu", nullable = true) private BigDecimal descu;
  @Column(name = "devs", nullable = true) private BigDecimal devs;
  @Column(name = "vtanet", nullable = true) private BigDecimal vtanet;
  @Column(name = "impue", nullable = true) private BigDecimal impue;
  @Column(name = "vtanetimp", nullable = true) private BigDecimal vtanetimp;
  @Column(name = "totfacs", nullable = true) private BigDecimal totfacs;
  @Column(name = "tottics", nullable = true) private BigDecimal tottics;
  @Column(name = "cantfac", nullable = true, columnDefinition = "int default 0") private int cantfac = 0;
  @Column(name = "canttics", nullable = true, columnDefinition = "int default 0") private int canttics = 0;
  @Column(name = "totefe", nullable = true) private BigDecimal totefe;
  @Column(name = "totdeb", nullable = true) private BigDecimal totdeb;
  @Column(name = "tottarcred", nullable = true) private BigDecimal tottarcred;
  @Column(name = "totdep", nullable = true) private BigDecimal totdep;
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

    public boolean isRegis() {
        return regis;
    }

    public void setRegis(boolean regis) {
        this.regis = regis;
    }

    public int getTotvtas() {
        return totvtas;
    }

    public void setTotvtas(int totvtas) {
        this.totvtas = totvtas;
    }

    public BigDecimal getTotingr() {
        return totingr;
    }

    public void setTotingr(BigDecimal totingr) {
        this.totingr = totingr;
    }

    public BigDecimal getTotegre() {
        return totegre;
    }

    public void setTotegre(BigDecimal totegre) {
        this.totegre = totegre;
    }

    public BigDecimal getTotcaj() {
        return totcaj;
    }

    public void setTotcaj(BigDecimal totcaj) {
        this.totcaj = totcaj;
    }

    public BigDecimal getVtabruta() {
        return vtabruta;
    }

    public void setVtabruta(BigDecimal vtabruta) {
        this.vtabruta = vtabruta;
    }

    public BigDecimal getDescu() {
        return descu;
    }

    public void setDescu(BigDecimal descu) {
        this.descu = descu;
    }

    public BigDecimal getDevs() {
        return devs;
    }

    public void setDevs(BigDecimal devs) {
        this.devs = devs;
    }

    public BigDecimal getVtanet() {
        return vtanet;
    }

    public void setVtanet(BigDecimal vtanet) {
        this.vtanet = vtanet;
    }

    public BigDecimal getImpue() {
        return impue;
    }

    public void setImpue(BigDecimal impue) {
        this.impue = impue;
    }

    public BigDecimal getVtanetimp() {
        return vtanetimp;
    }

    public void setVtanetimp(BigDecimal vtanetimp) {
        this.vtanetimp = vtanetimp;
    }

    public BigDecimal getTotfacs() {
        return totfacs;
    }

    public void setTotfacs(BigDecimal totfacs) {
        this.totfacs = totfacs;
    }

    public BigDecimal getTottics() {
        return tottics;
    }

    public void setTottics(BigDecimal tottics) {
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

    public BigDecimal getTotefe() {
        return totefe;
    }

    public void setTotefe(BigDecimal totefe) {
        this.totefe = totefe;
    }

    public BigDecimal getTotdeb() {
        return totdeb;
    }

    public void setTotdeb(BigDecimal totdeb) {
        this.totdeb = totdeb;
    }

    public BigDecimal getTottarcred() {
        return tottarcred;
    }

    public void setTottarcred(BigDecimal tottarcred) {
        this.tottarcred = tottarcred;
    }

    public BigDecimal getTotdep() {
        return totdep;
    }

    public void setTotdep(BigDecimal totdep) {
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