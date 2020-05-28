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
import java.math.BigDecimal;
//@Index(name="")

@Entity @Table(name = "cxp",uniqueConstraints = {@UniqueConstraint( columnNames ={"id_id"})}) public class Cxp {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_id", nullable = false) private int id;
  @Index(name="cxp_norefer") @Column(name = "norefer", nullable = false,length = 50) private String norefer;
  @Index(name="cxp_noser") @Column(name = "noser", nullable = false,length = 30) private String noser;
  @Index(name="cxp_prov") @Column(name = "prov", nullable = false,length = 30) private String prov;
  @Column(name = "ser", nullable = false,length = 30) private String ser;
  @Column(name = "formpag", nullable = true, length = 30) private String formpag = "";
  @Column(name = "conceppag", nullable = true, length = 30) private String conceppag = "";
  @Column(name = "monedaID", nullable = false, columnDefinition = "int default 0") private int monedaID;
  @Column(name = "tipcam", nullable = false) private BigDecimal tipcam;
  @Column(name = "comen", nullable = true, length = 500) private String comen = "";
  @Column(name = "subtot", nullable = false) private BigDecimal subtot;
  @Column(name = "tot", nullable = false) private BigDecimal tot;
  @Column(name = "impue", columnDefinition = "NUMERIC(19,2)",nullable = false) private BigDecimal impue;
  @Column(name = "carg", nullable = false) private BigDecimal carg;
  @Column(name = "abon", nullable = false) private BigDecimal abon;
  @Column(name = "concep", nullable = true, length = 30) private String concep = "";
  @Column(name = "folbanc", nullable = true, length = 50) private String folbanc = "";
  @Column(name = "fvenc", nullable = true) private Date fvenc = new Date();
  @Column(name = "fdoc", nullable = false) private Date fdoc = new Date();
  @Column(name = "falt", nullable = true) private Date falt;
  @Column(name = "fmod", nullable = false) private Date fmod;
  @Column(name = "fol", nullable = true, columnDefinition = "int default 0") private int fol = 0;  
  @Column(name = "estac", nullable = false,length = 30) private String estac;
  @Column(name = "sucu", nullable = false,length = 30) private String sucu;
  @Column(name = "nocaj", nullable = false,length = 30) private String nocaj;    
  @Column(name = "cuentabanco", nullable = true, length = 30) private String cuentabanco = "";
  @Column(name = "estado", nullable = true, length = 30) private String estado = "";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNorefer() {
        return norefer;
    }

    public void setNorefer(String norefer) {
        this.norefer = norefer;
    }

    public String getNoser() {
        return noser;
    }

    public void setNoser(String noser) {
        this.noser = noser;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getFormpag() {
        return formpag;
    }

    public void setFormpag(String formpag) {
        this.formpag = formpag;
    }

    public String getConceppag() {
        return conceppag;
    }

    public void setConceppag(String conceppag) {
        this.conceppag = conceppag;
    }

    public int getMonedaID() {
        return monedaID;
    }

    public void setMonedaID(int monedaID) {
        this.monedaID = monedaID;
    }

    public BigDecimal getTipcam() {
        return tipcam;
    }

    public void setTipcam(BigDecimal tipcam) {
        this.tipcam = tipcam;
    }

    public String getComen() {
        return comen;
    }

    public void setComen(String comen) {
        this.comen = comen;
    }

    public BigDecimal getSubtot() {
        return subtot;
    }

    public void setSubtot(BigDecimal subtot) {
        this.subtot = subtot;
    }

    public BigDecimal getTot() {
        return tot;
    }

    public void setTot(BigDecimal tot) {
        this.tot = tot;
    }

    public BigDecimal getImpue() {
        return impue;
    }

    public void setImpue(BigDecimal impue) {
        this.impue = impue;
    }

    public BigDecimal getCarg() {
        return carg;
    }

    public void setCarg(BigDecimal carg) {
        this.carg = carg;
    }

    public BigDecimal getAbon() {
        return abon;
    }

    public void setAbon(BigDecimal abon) {
        this.abon = abon;
    }

    public String getConcep() {
        return concep;
    }

    public void setConcep(String concep) {
        this.concep = concep;
    }

    public String getFolbanc() {
        return folbanc;
    }

    public void setFolbanc(String folbanc) {
        this.folbanc = folbanc;
    }

    public Date getFvenc() {
        return fvenc;
    }

    public void setFvenc(Date fvenc) {
        this.fvenc = fvenc;
    }

    public Date getFdoc() {
        return fdoc;
    }

    public void setFdoc(Date fdoc) {
        this.fdoc = fdoc;
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

    public int getFol() {
        return fol;
    }

    public void setFol(int fol) {
        this.fol = fol;
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

    public String getCuentabanco() {
        return cuentabanco;
    }

    public void setCuentabanco(String cuentabanco) {
        this.cuentabanco = cuentabanco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
 

     
}